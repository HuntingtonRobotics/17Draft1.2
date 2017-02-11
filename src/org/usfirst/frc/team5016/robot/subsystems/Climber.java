package org.usfirst.frc.team5016.robot.subsystems;

import org.usfirst.frc.team5016.robot.RobotMap;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Climber extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public CANTalon climbMotor;

    public void initDefaultCommand() {
    	this.climbMotor = new CANTalon(RobotMap.climbMotorPort);
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

