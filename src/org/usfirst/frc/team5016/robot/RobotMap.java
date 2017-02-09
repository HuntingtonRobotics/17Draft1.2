package org.usfirst.frc.team5016.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static final int frontRightMotorPort = 0;//The PWM ports for the drive motors
	public static final int frontLeftMotorPort = 1;
	public static final int backRightMotorPort = 2;
	public static  final int backLeftMotorPort = 3;
	
	public static final int driveGamePadPort = 0;//The Drive and Operator gamepad Ports
	public static final int guitarPadPort = 1;
	
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
	
	public static final int guitar1Port = 1;
	public static final int guitar2Port = 2;
	public static final int guitar3Port = 4;
	public static final int guitar4Port = 3;
	public static final int guitar5Port = 5;
	
	public static final double driveSpeed = .5;//Multiplier for the driveTrain ex. .5 reduces speed by 1/2
	public static final double shooterSpeed = 1;// The default speed that the shooter motor will rin at
	
	public static final int shooterMotorPort = 4;//The PWM for the shooter motor
	
	public static final int climbMotorPort = 5;
	public static final double climbMotorSpeed = 1;
	
	public static final int shooterEncoderChannelA = 0;//The encoder channels for the ShooterEncoder
	public static final int shooterEncoderChannelB = 1;
	public static final double shooterReleaseRate = 1.0;//****Need to get the actual value for this***** This is the speed of the motor when the fuel is released
	
	public static final int xCalibrate = 180;
	
	
}
