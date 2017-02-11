package org.usfirst.frc.team5016.robot.subsystems;

import org.usfirst.frc.team5016.robot.RobotMap;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain extends Subsystem {

    CANTalon frontLeft, frontRight, backLeft, backRight;
    public RobotDrive chassis;
    
    public void initDefaultCommand(){
    	
    	frontRight = new CANTalon(1){
    		@Override
    		public void set (double speed){
    			super.set(speed * RobotMap.driveSpeed);
    		}
    	};
    	frontRight = new CANTalon(2){
    		@Override
    		public void set (double speed){
    			super.set(speed * RobotMap.driveSpeed);
    		}
    	};
    	backLeft = new CANTalon(3){
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
    	chassis = new RobotDrive(frontLeft, backLeft, frontRight, backRight);
    	
    	setDefaultCommand(null);

    }

	public void drive(double xAxis, double yAxis, double rotateAxis, double gyroAngle) {
		chassis.mecanumDrive_Cartesian(xAxis, -yAxis, rotateAxis, gyroAngle);
	}
	
	public void straightForward(double speed) {
		frontLeft.set(speed);
		backLeft.set(speed);
		frontRight.set(speed);
		backRight.set(speed);
	}
	public void straightBack(double speed) {
		frontLeft.set(-speed);
		backLeft.set(-speed);
		frontRight.set(-speed);
		backRight.set(-speed);
	}
	public void straightLeft(double speed){
		frontLeft.set(-speed);
		backLeft.set(speed);
		frontRight.set(speed);
		backRight.set(-speed);
	}
	public void straightRight(double speed){
		frontLeft.set(speed);
		backLeft.set(-speed);
		frontRight.set(-speed);
		backRight.set(speed);
	}
	}
	
		
		
	
  
    


