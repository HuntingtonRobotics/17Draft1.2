package org.usfirst.frc.team5016.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team5016.robot.Robot;
import org.usfirst.frc.team5016.robot.RobotMap;

/**
 *
 */
public class AutoMoveStraight extends Command {
	double distance, startingAngle, rightMotors, leftMotors, totalAcceleration, accelerationInstances;
	Timer time;
	
    public AutoMoveStraight(double inches) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.driveTrain);
    	requires(Robot.gyroscope);
    	rightMotors = RobotMap.autoSpeed;
    	leftMotors = RobotMap.autoSpeed;
    	//requires(Robot.accellerometer);
    	
    	this.distance = inches;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	this.startingAngle = Robot.gyroscope.angle;
    	time = new Timer();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.accelerometer.refreshAccelerometer();
    	
    	Robot.driveTrain.tankDrive(this.rightMotors, this.leftMotors);
    	
    	if(this.startingAngle <= Robot.gyroscope.angle+5.0){//test if the robot is driving straight tolerance of 5 degrees to either side
    		this.leftMotors -= 0.02;
    		this.rightMotors += 0.02;
    	}else if(this.startingAngle >= Robot.gyroscope.angle-5.0){
    		this.leftMotors += 0.02;
    		this.rightMotors -= 0.02;
    		
    	}
    	
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	/*
    	 * To find the distance traveled there is a running total of all collected accelerations 
    	 * that is divided by the number of times that we have calculated it
    	 * There may have to put a delay in there so the values don't get out of control
    	 */
    	if(Robot.driveTrain.averageEncoderDistance() * RobotMap.encoderToInches <= 400){
    		Robot.driveTrain.backLeftEncoder.reset();//Resets All the distances
    		Robot.driveTrain.backRightEncoder.reset();
    		Robot.driveTrain.frontLeftEncoder.reset();
    		Robot.driveTrain.frontRightEncoder.reset();
    		
    		return true;
    	}else{
    		return false;
    	}
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
