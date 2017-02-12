package org.usfirst.frc.team5016.robot.subsystems;

import org.usfirst.frc.team5016.robot.Robot;
import org.usfirst.frc.team5016.robot.RobotMap;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain extends Subsystem {

    CANTalon frontLeft, backLeft, frontRight, backRight;
    public RobotDrive chassis;
    
    public void initDefaultCommand(){
    	
    	frontLeft = new CANTalon(3){
    		@Override
    		public void set (double speed){
    			super.set(speed * RobotMap.driveSpeed);
    		}
    	};
    	backLeft = new CANTalon(0){
    		@Override
    		public void set (double speed){
    			super.set(speed * RobotMap.driveSpeed);
    		}
    	};
    	frontRight = new CANTalon(1){
    		@Override
    		public void set (double speed){
    			super.set(-speed * RobotMap.driveSpeed);
    		}
    	};
    	backRight = new CANTalon(2){
    		@Override
    		public void set (double speed){
    			super.set(-speed * RobotMap.driveSpeed);
    		}
    	};
    	
    	chassis = new RobotDrive(frontLeft, backLeft, frontRight, backRight);
    	
    	setDefaultCommand(null);

    }

	public void drive(double xAxis, double yAxis, double rotateAxis, double gyroAngle) {
		chassis.mecanumDrive_Cartesian(-xAxis, -yAxis, rotateAxis, gyroAngle);
	}
	
	public void straightForward(double speed) {
		Robot.driveTrain.drive(0, -1, 0, 0);
	}
	public void straightBack(double speed) {
		Robot.driveTrain.drive(0, 1, 0, 0);
	}
	public void straightLeft(double speed){
		Robot.driveTrain.drive(-1, 0, 0, 0);
	}
	public void straightRight(double speed){
		Robot.driveTrain.drive(1, 0, 0, 0);
	}
}