package org.usfirst.frc.team5016.robot.subsystems;

import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Camera extends Subsystem {
	UsbCamera gearCam; // USB 0, Server 1181
	UsbCamera shooterCam; // USB 1, Server 1182
	

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
    	gearCam = CameraServer.getInstance().startAutomaticCapture();
    	shooterCam = CameraServer.getInstance().startAutomaticCapture();
    }
}

