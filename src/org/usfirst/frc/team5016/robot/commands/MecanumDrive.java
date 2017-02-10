package org.usfirst.frc.team5016.robot.commands;

import org.usfirst.frc.team5016.robot.Robot;
import org.usfirst.frc.team5016.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class MecanumDrive extends Command {

    public MecanumDrive() {
    	requires(Robot.driveTrain);
    	
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }
    

    // Called just before this Command runs the first time
    protected void initialize(){
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	Robot.driveTrain.chassis.mecanumDrive_Cartesian(Robot.oi.driveGamePad.getRawAxis(0) * RobotMap.driveSpeed, Robot.oi.driveGamePad.getRawAxis(1) * RobotMap.driveSpeed, Robot.oi.driveGamePad.getRawAxis(4) * RobotMap.driveSpeed, Robot.gyroscope.angle);
    
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
