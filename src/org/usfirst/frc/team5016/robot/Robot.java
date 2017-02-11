package org.usfirst.frc.team5016.robot;

import org.usfirst.frc.team5016.robot.commands.MecanumDrive;
import org.usfirst.frc.team5016.robot.commands.StraightDrive;
import org.usfirst.frc.team5016.robot.subsystems.Camera;
import org.usfirst.frc.team5016.robot.subsystems.Climber;
import org.usfirst.frc.team5016.robot.subsystems.DriveTrain;
import org.usfirst.frc.team5016.robot.subsystems.Gyroscope;
import org.usfirst.frc.team5016.robot.subsystems.IntakePool;
import org.usfirst.frc.team5016.robot.subsystems.Shooter;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

public class Robot extends IterativeRobot {
	
	public static Camera camera;
	public static DriveTrain driveTrain;
	public static Shooter shooter;
	public static Gyroscope gyroscope;
	public static Climber climber;
	public static MecanumDrive mecanumDrive;
	public static IntakePool intakePool;
	public static OI oi;
	
	public static Command driveCommand;
	
	@Override
	public void robotInit() {
		camera = new Camera();
		driveTrain = new DriveTrain();
		shooter = new Shooter();
		gyroscope = new Gyroscope();
		climber = new Climber();
		mecanumDrive = new MecanumDrive();
		intakePool = new IntakePool();
		
		oi = new OI();		
	}
	
	@Override
	public void disabledInit() {
	}

	@Override
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}
	
	@Override
	public void autonomousInit() {
	}
	
	@Override
	public void autonomousPeriodic() {
		/*Robot.driveTrain.drive(1, 1, 0, 0);
		Timer.delay(1.5);
		Robot.driveTrain.drive(0, 0, 0, 0);*/
		Scheduler.getInstance().run();
	}

	@Override
	public void teleopInit() {
		gyroscope.refreshGyro();
		
		if (driveCommand != null)
			driveCommand.start();
		}
	
	@Override
	public void teleopPeriodic() {
		//gyroscope.refreshGyro();
		
		if(oi.getPOV() != -1){
			driveCommand = new StraightDrive();
			driveCommand.start();
		} else {
			driveCommand = new MecanumDrive();
			driveCommand.start();			
		}
	}

	@Override
	public void testPeriodic() {		
		LiveWindow.run();
	}
}
