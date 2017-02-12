package org.usfirst.frc.team5016.robot.subsystems;

import org.usfirst.frc.team5016.robot.Robot;
import org.usfirst.frc.team5016.robot.RobotMap;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.CounterBase;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {

    public CANTalon frontLeft, frontRight, backLeft, backRight;
    public Encoder frontLeftEncoder, frontRightEncoder, backLeftEncoder, backRightEncoder;
    public RobotDrive chassis;
    
    public void initDefaultCommand() {
    	frontLeft = new CANTalon(RobotMap.frontLeftMotorPort);
    	frontRight = new CANTalon(RobotMap.frontRightMotorPort);
    	backLeft = new CANTalon(RobotMap.backLeftMotorPort);
    	backRight = new CANTalon(RobotMap.backRightMotorPort);
    	
    	frontLeftEncoder = new Encoder(RobotMap.frontLeftEncoderA, RobotMap.frontLeftEncoderB, true, CounterBase.EncodingType.k4X);
    	frontRightEncoder = new Encoder(RobotMap.frontRightEncoderA, RobotMap.frontRightEncoderB, true, CounterBase.EncodingType.k4X);
    	backLeftEncoder = new Encoder(RobotMap.backLeftEncoderA, RobotMap.backLeftEncoderB, true, CounterBase.EncodingType.k4X);
    	backRightEncoder = new Encoder(RobotMap.backRightEncoderA, RobotMap.backRightEncoderB, true, CounterBase.EncodingType.k4X);
    	
    	
    	chassis = new RobotDrive(frontLeft, frontRight, backLeft, backRight);
    	setDefaultCommand(new MechanumDrive()());

    }
    public void tankDrive(double left, double right){
    	this.frontLeft.set(left);
    	this.frontRight.set(left);
    	this.backLeft.set(right);
    	this.backRight.set(right);
    }
    
    public void mecanumDrive(double x, double y, double rotation){
    	
    	chassis.mecanumDrive_Cartesian(x, y, rotation, Robot.gyroscope.angle);
    }
    
    public double  averageEncoderDistance(){
    	double total = this.backLeftEncoder.getDistance()+this.backRightEncoder.getDistance()+this.frontLeftEncoder.getDistance()+this.frontRightEncoder.getDistance();
    	return total/4;
    }
}

