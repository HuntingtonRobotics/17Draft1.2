package org.usfirst.frc.team5016.robot.subsystems;

import org.usfirst.frc.team5016.robot.Robot;
import org.usfirst.frc.team5016.robot.RobotMap;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {

    CANTalon frontLeft, frontRight, backLeft, backRight;
    RobotDrive chassis;
    
    public void initDefaultCommand() {
    	frontLeft = new CANTalon(RobotMap.frontLeftMotorPort);
    	frontRight = new CANTalon(RobotMap.frontRightMotorPort);
    	backLeft = new CANTalon(RobotMap.backLeftMotorPort);
    	backRight = new CANTalon(RobotMap.backRightMotorPort);
    	
    	chassis = new RobotDrive(frontLeft, frontRight, backLeft, backRight);
    }
    public void tankDrive(double left, double right){
    	this.frontLeft.set(left);
    	this.frontRight.set(left);
    	this.backLeft.set(right);
    	this.backRight.set(right);
    }
    
    public void mecanumDrive(double left, double right, double rotation){
    	
    	chassis.mecanumDrive_Cartesian(left, right, rotation, Robot.gyroscope.angle);
    }
}

