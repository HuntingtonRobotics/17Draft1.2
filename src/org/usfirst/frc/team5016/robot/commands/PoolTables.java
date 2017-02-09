package org.usfirst.frc.team5016.robot.commands;

import org.usfirst.frc.team5016.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class PoolTables extends Command {

    public PoolTables() {
    	requires(Robot.camera);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	try {
    		Robot.camera.x = Robot.camera.table.getNumber("X", 0.0);
    		Robot.camera.y = Robot.camera.table.getNumber("Y", 0.0);
    		
    		//System.out.println("X: " + Robot.camera.table.getNumber("x", -1.0) + "     " + "Y: " + Robot.camera.table.getNumber("y", -1.0));
    		
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    	
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
