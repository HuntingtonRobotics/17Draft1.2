package org.usfirst.frc.team5016.robot.commands;

import org.usfirst.frc.team5016.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class MecanumDrive extends Command {

    public MecanumDrive() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.driveTrain.mecanumDrive(Robot.oi.getLeftStickX(), Robot.oi.getLeftStickY(), Robot.oi.getRightStickX());
    	SmartDashboard.putNumber("LeftStickX", Robot.oi.getLeftStickX());
    	SmartDashboard.putNumber("LeftStickY", Robot.oi.getLeftStickY());
    	SmartDashboard.putNumber("Rotation", Robot.oi.getRightStickX());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
