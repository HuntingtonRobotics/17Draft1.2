package org.usfirst.frc.team5016.robot.subsystems;

import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.networktables.NetworkTable;

/**
 *
 */
public class Camera extends Subsystem {
	UsbCamera gearCam; // USB 1, Server 1181
	UsbCamera shooterCam; // USB 0, Server 1182
	

	
	
	public double defaultValue;
	public NetworkTable table;
	public double x, y;
	

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
    	gearCam = CameraServer.getInstance().startAutomaticCapture();
    	//shooterCam = CameraServer.getInstance().startAutomaticCapture();
    	defaultValue = 0.0;
    	x = 0;
    	y = 0;
    	
    	
    	table = NetworkTable.getTable("SmartDashboard");
    	
    		
    	
    	
    }
   
    	
    	
    }


