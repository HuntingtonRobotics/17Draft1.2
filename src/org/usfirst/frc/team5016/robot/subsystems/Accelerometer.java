package org.usfirst.frc.team5016.robot.subsystems;

import edu.wpi.first.wpilibj.BuiltInAccelerometer;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Accelerometer extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	BuiltInAccelerometer accelerometer;
	public double y, x;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	this.accelerometer = new BuiltInAccelerometer();
    	
    	this.refreshAccelerometer();
    }
    
    public void refreshAccelerometer(){
    	this.x = this.accelerometer.getX();
    	this.y  = this.accelerometer.getY();
    }
    
    public double getAcceleration(){
    	this.refreshAccelerometer();
    	return Math.sqrt(this.y*this.y+this.x*this.x);
    }
}

