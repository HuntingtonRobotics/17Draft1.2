package org.usfirst.frc.team5016.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static final int frontRightMotorPort=0;//The PWM ports for the drive motors
	public static final int frontLeftMotorPort=1;
	public static final int backRightMotorPort=2;
	public static  final int backLeftMotorPort=3;
	
	public static final int driveGamepadPort=0;//The Drive and Operator gamepad Ports
	public static final int operatorGamepadPort=1;
	
	public static final double driveSpeed=.5;//Multiplier for the driveTrain ex. .5 reduces speed by 1/2
	public static final double shooterSpeed=1;// The default speed that the shooter motor will rin at
	
	public static final int shooterMotorPort=4;//The PWM for the shooter motor
	
	public static final int climbMotorPort=5;
	public static final double climbMotorSpeed=1;
	
	public static final int driverJoystickPort=0;
}
