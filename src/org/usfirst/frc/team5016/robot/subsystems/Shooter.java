package org.usfirst.frc.team5016.robot.subsystems;

import edu.wpi.first.wpilibj.CounterBase;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team5016.robot.RobotMap;

import com.ctre.CANTalon;

public class Shooter extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public CANTalon motor;
	public Encoder encoder;
	
	public double encoderRate;
	public double rate;
	public boolean reverseDirection = true;
	
    public void initDefaultCommand() {
    	encoder = new Encoder(RobotMap.shooterEncoderChannelA, RobotMap.shooterEncoderChannelB, reverseDirection, CounterBase.EncodingType.k4X );
    		//makes an encoder at the shooter motor
    	motor = new CANTalon(RobotMap.frontLeftMotorPort);
    }
    
    public void refreshEncoder(){
    	this.encoderRate = this.encoder.getRate();
    }
    
}

