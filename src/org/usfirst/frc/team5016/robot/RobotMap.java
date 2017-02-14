package org.usfirst.frc.team5016.robot;

public class RobotMap {
	public static final int frontRightMotorPort = 3;
	public static final int frontLeftMotorPort = 1;
	public static final int backRightMotorPort = 0;
	public static final int backLeftMotorPort = 2; 
	
	public static final int driveGamePadPort = 0;
	
	public static final int xboxAPort = 1;
	public static final int xboxBPort = 2;
	public static final int xboxXPort = 3;
	public static final int xboxYPort = 4;
	public static final int xboxLbPort = 5;
	public static final int xboxRbPort = 6;
	public static final int xboxBackPort = 7;
	public static final int xboxStartPort = 8;
	public static final int xboxLStickPort = 9;
	public static final int xboxRStickPort = 10;
	
	public static final int guitarPadPort = 1;
	
	public static final int guitar1Port = 1;
	public static final int guitar2Port = 2;
	public static final int guitar3Port = 4;
	public static final int guitar4Port = 3;
	public static final int guitar5Port = 5;
	
	public static final double driveSpeed = 0.5;//Multiplier for the driveTrain ex. .5 reduces speed by 1/2
	public static final double shooterSpeed = 1;// The default speed that the shooter motor will rin at
	
	public static final int intakeMotorPort = 15;
	public static final double intakeMotorSpeed = 0.6;
	
	public static final int shooterMotorPort = 5;//The PWM for the shooter motor
	public static final double shooterMotorSpeed = 0.9;
	
	public static final int climbMotorPort = 6;
	public static final double climbMotorSpeed = 1;
	
	public static final int shooterEncoderChannelA = 0;//The encoder channels for the ShooterEncoder
	public static final int shooterEncoderChannelB = 1;
	public static final double shooterReleaseRate = 0.5;//****Need to get the actual value for this***** This is the speed of the motor when the fuel is released
	
	public static final int xCalibrate = 180;
	
	public static final int offset = 2;
		
}