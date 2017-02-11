package org.usfirst.frc.team5016.robot.commands;

import org.usfirst.frc.team5016.robot.Robot;
import org.usfirst.frc.team5016.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class Shoot extends Command {

    public Shoot() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.shooter);
    }

    // Called just before this Command runs the first time
    protected void initialize() {    	
    	//Shooter motors spin to full speed, fuel will be released into the shooters only
    	//when motors in front of the shooter spin to allow the balls to come in at a constant rate
    	Robot.shooter.motor.set(RobotMap.shooterSpeed);
    	Robot.shooter.refreshEncoder();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.shooter.refreshEncoder();
    	//When the shooter motor reaches a certain speed, release the fuel
    	if(Robot.shooter.encoderRate >= RobotMap.shooterReleaseRate){
    		new ReleaseFuel();
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.shooter.motor.set(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}