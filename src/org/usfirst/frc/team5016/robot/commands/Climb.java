package org.usfirst.frc.team5016.robot.commands;

import org.usfirst.frc.team5016.robot.Robot;
import org.usfirst.frc.team5016.robot.RobotMap;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Climb extends Command {

    public Climb() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    CANTalon climbMotor;
    protected void initialize() {
    	Robot.climber.climbMotor.set(RobotMap.climbMotorSpeed);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	climbMotor.set(0);//Turn off climb motor
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
