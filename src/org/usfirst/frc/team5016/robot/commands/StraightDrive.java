package org.usfirst.frc.team5016.robot.commands;

import org.usfirst.frc.team5016.robot.Robot;
import org.usfirst.frc.team5016.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class StraightDrive extends Command {
    
	public StraightDrive() {
    	requires(Robot.driveTrain);
    	requires(Robot.gyroscope);
    }

    protected void initialize() {}

    protected void execute() {
    	switch(Robot.oi.getPOV()) {
    	case 0:
    	
    		if (Robot.gyroscope.angle < 0 - RobotMap.offset) {
    			Robot.driveTrain.straightForward(Robot.oi.getRT(), true, false);
    		} else if (Robot.gyroscope.angle > 0.0 + RobotMap.offset) {
    			Robot.driveTrain.straightForward(Robot.oi.getRT(), true, true);	
    		} else {
    			Robot.driveTrain.straightForward(Robot.oi.getRT(), false, false);
    		} 
    		break;
    
    	case 90:
    		if (Robot.gyroscope.angle < 90 - RobotMap.offset) {
    			Robot.driveTrain.straightRight(Robot.oi.getRT(), true, false);
    		} else if (Robot.gyroscope.angle > RobotMap.offset + RobotMap.offset) {
    			Robot.driveTrain.straightRight(Robot.oi.getRT(), true, true);
    		} else {
    			Robot.driveTrain.straightRight(Robot.oi.getRT(), false, false);
    		}
    		break;
    	
    	case 180:
    		if (Robot.gyroscope.angle < 180 - RobotMap.offset) {
    			Robot.driveTrain.straightBack(Robot.oi.getRT(), true, false);
    		} else if (Robot.gyroscope.angle > 180 + RobotMap.offset) {
    			Robot.driveTrain.straightBack(Robot.oi.getRT(), true, true);
    		} else {
    			Robot.driveTrain.straightBack(Robot.oi.getRT(), false, false);
    		}
			break;
    		
    	
    	case 270:
    		if (Robot.gyroscope.angle < 270.0 - RobotMap.offset) {
    			Robot.driveTrain.straightLeft(Robot.oi.getRT(), true, false);
    		} else if (Robot.gyroscope.angle > 270 + RobotMap.offset) {
    			Robot.driveTrain.straightLeft(Robot.oi.getRT(), true, true);
    		} else {
    			Robot.driveTrain.straightLeft(Robot.oi.getRT(), false, false);
    		}
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