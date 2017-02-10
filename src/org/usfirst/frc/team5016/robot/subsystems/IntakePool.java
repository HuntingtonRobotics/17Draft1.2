package org.usfirst.frc.team5016.robot.subsystems;

import org.usfirst.frc.team5016.robot.RobotMap;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class IntakePool extends Subsystem {
	
	public CANTalon intakeMotor;

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
    	
    	this.intakeMotor = new CANTalon(RobotMap.intakeMotorPort);
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

