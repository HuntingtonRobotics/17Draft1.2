package org.usfirst.frc.team5016.robot.subsystems;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Gyroscope extends Subsystem {

	public ADXRS450_Gyro gyro;
	
	public double angle;
	public double rate;
	
    public void initDefaultCommand() {
    	this.gyro = new ADXRS450_Gyro();
    	this.gyro.calibrate();
    	this.refreshGyro();
    }
    
    public void refreshGyro(){
    	this.angle = this.gyro.getAngle();
    	this.rate = this.gyro.getRate();
    }
}

