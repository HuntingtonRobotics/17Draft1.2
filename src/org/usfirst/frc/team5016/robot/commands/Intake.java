package org.usfirst.frc.team5016.robot.commands;

import org.usfirst.frc.team5016.robot.Robot;
import org.usfirst.frc.team5016.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class Intake extends Command {

    public Intake() {
requires(Robot.intakePool);

    }
    protected void initialize() {}
    protected void execute() {
    	if (Robot.oi.guitarPad.getRawButton(1)) {
    		Robot.intakePool.intakeMotor.set(RobotMap.intakeMotorSpeed);
    	} else {
    		Robot.intakePool.intakeMotor.set(0);
    	}
    }
    
    protected boolean isFinished() {
        return false;
    }
    protected void end() {}
    
    protected void interrupted() {
    	end();
    }
}
