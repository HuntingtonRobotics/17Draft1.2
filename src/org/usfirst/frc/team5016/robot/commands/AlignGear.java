package org.usfirst.frc.team5016.robot.commands;

import org.usfirst.frc.team5016.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class AlignGear extends Command {

    public AlignGear() {    	
    	requires(Robot.camera);
    }

    protected void initialize() {
    	
    	
    }

    protected void execute() {
    	SmartDashboard.getNumber("X", 0.0);
    	SmartDashboard.getNumber("Y", 0.0);
    	
    	System.out.println("X: " + Robot.camera.table.getNumber("x", 0.0));

    	
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
