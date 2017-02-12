package org.usfirst.frc.team5016.robot.commands;

import org.usfirst.frc.team5016.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class StraightDrive extends Command {
    
	public StraightDrive() {
    	requires(Robot.driveTrain);
    }

    protected void initialize() {}

    protected void execute() {
    	switch(Robot.oi.getPOV()) {
    	case 0:
    		Robot.driveTrain.straightForward(Robot.oi.getRT());
    		break;
    	case 90:
    		Robot.driveTrain.straightRight(Robot.oi.getRT());
    		break;
    	case 180:
    		Robot.driveTrain.straightBack(Robot.oi.getRT());
    		break;
    	case 270:
    		Robot.driveTrain.straightLeft(Robot.oi.getRT());
    		break;
    	default:
    		break;

    	}
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    	end();
    }
}