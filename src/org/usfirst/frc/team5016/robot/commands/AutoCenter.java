package org.usfirst.frc.team5016.robot.commands;

import org.usfirst.frc.team5016.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class AutoCenter extends Command {

    public AutoCenter() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.camera);
    	requires(Robot.driveTrain);
    	requires(Robot.shooter);
    	requires(Robot.gyroscope);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	for(double x = 0; x <= 3.8; x++){
    		Robot.driveTrain.drive(Robot.oi.getLeftXAxis(), Robot.oi.getLeftYAxis(), Robot.oi.getRightXAxis(), 0.0);
    	}
    	Robot.driveTrain.drive(0, 1, 0, 0.0);
    	Timer.delay(1.5);
    	Robot.driveTrain.drive(0, 1, 0, 0.0);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
