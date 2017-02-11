package org.usfirst.frc.team5016.robot.commands;

import org.usfirst.frc.team5016.robot.Robot;
import org.usfirst.frc.team5016.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class MecanumDrive extends Command {

    public MecanumDrive() {
    	requires(Robot.driveTrain);
    	
    }
   
    protected void initialize(){
    	
    }
    protected void execute() {
    	
    	Robot.driveTrain.drive(Robot.oi.getLeftXAxis() * RobotMap.driveSpeed, Robot.oi.getLeftYAxis() * RobotMap.driveSpeed, Robot.oi.getRightXAxis() * RobotMap.driveSpeed, 0.0);    
    }
    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    	Robot.driveTrain.chassis.mecanumDrive_Cartesian(0,0,0,0);
    }

    protected void interrupted() {
    	end();
    }
}
