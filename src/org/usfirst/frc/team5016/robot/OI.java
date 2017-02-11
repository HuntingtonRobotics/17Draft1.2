package org.usfirst.frc.team5016.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.buttons.Trigger;

public class OI {
	public Joystick driveGamePad = new Joystick(RobotMap.driveGamePadPort);
	public JoystickButton xboxA = new JoystickButton(driveGamePad, RobotMap.xboxYPort);
	public JoystickButton xboxB = new JoystickButton(driveGamePad, RobotMap.xboxBPort);
	public JoystickButton xboxX = new JoystickButton(driveGamePad, RobotMap.xboxAPort);
	public JoystickButton xboxY = new JoystickButton(driveGamePad, RobotMap.xboxXPort);
	public JoystickButton xboxLb = new JoystickButton(driveGamePad, RobotMap.xboxLbPort);
	public JoystickButton xboxRb = new JoystickButton(driveGamePad, RobotMap.xboxRbPort);
	public JoystickButton xboxBack = new JoystickButton(driveGamePad, RobotMap.xboxBackPort);
	public JoystickButton xboxStart = new JoystickButton(driveGamePad, RobotMap.xboxStartPort);
	public JoystickButton xboxLStick = new JoystickButton(driveGamePad, RobotMap.xboxLStickPort);
	public JoystickButton xboxRStick = new JoystickButton(driveGamePad, RobotMap.xboxRStickPort);
	
	public Joystick guitarPad = new Joystick(RobotMap.guitarPadPort);
	public JoystickButton guitar1 = new JoystickButton(guitarPad, RobotMap.guitar1Port);
	public JoystickButton guitar2 = new JoystickButton(guitarPad, RobotMap.guitar2Port);
	public JoystickButton guitar3 = new JoystickButton(guitarPad, RobotMap.guitar3Port);
	public JoystickButton guitar4 = new JoystickButton(guitarPad, RobotMap.guitar4Port);
	public JoystickButton guitar5 = new JoystickButton(guitarPad, RobotMap.guitar5Port);

	public Trigger xboxLT = new Trigger() {
			@Override
			public boolean get() {
				if (driveGamePad.getRawAxis(2) > 0.1)
					return true;
				else
					return false;
			}
		};
		Trigger xboxRT = new Trigger() {

			@Override
			public boolean get() {
				if (driveGamePad.getRawAxis(3) > 0.1)
					return true;
				else
					return false;
			}
		};
	
	public double getLeftXAxis(){
		return driveGamePad.getRawAxis(0);
	}
	
	public double getLeftYAxis(){
		return driveGamePad.getRawAxis(1);
	}
	public double getRightXAxis(){
		return driveGamePad.getRawAxis(4);
	}
	public double getRightYAxis(){
		return driveGamePad.getRawAxis(5);
	}
	public int getPOV() {
		return driveGamePad.getPOV();
	}
	public double getRT(){
		return driveGamePad.getRawAxis(3);
	}
	public double getLT() {
		return driveGamePad.getRawAxis(2);
	}
	
	
}