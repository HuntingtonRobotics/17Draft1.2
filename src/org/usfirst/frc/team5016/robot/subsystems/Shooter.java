package org.usfirst.frc.team5016.robot.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team5016.robot.RobotMap;

import com.ctre.CANTalon;

/**
 *
 */
public class Shooter extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public CANTalon shooterMotor;
	
    public void initDefaultCommand() {
    	shooterMotor = new CANTalon(RobotMap.frontLeftMotorPort);
    }
    public void shoot(){
    	shooterMotor.set(RobotMap.shooterSpeed);
    }
}

