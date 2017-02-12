package org.usfirst.frc.team5016.robot.commands;

import org.usfirst.frc.team5016.robot.Robot;
import org.usfirst.frc.team5016.robot.commands.AutoMoveStraight;
import org.usfirst.frc.team5016.robot.commands.AlignGear;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class RightStartAutonomous extends CommandGroup {

    public RightStartAutonomous() {
    	//https://firstfrc.blob.core.windows.net/frc2017/Drawings/2017FieldAssembly.pdf
    	//Go about 200inches straight going slightly past the Gear Mechanism, then rotate left until vison sees the reflective tape
    	//Go towards the Gear and adjust along the way
    	requires(Robot.driveTrain);
    	requires(Robot.gyroscope);
    	requires(Robot.accelerometer);
    	
    	addSequential(new AutoMoveStraight(200.0));//Moves forward 200 inches
    	addSequential(new Rotate_FindGear());//rotates 90 to the right trying to find the reflective tape
    	addSequential(new AlignGear());// once the robot is rotated it will move forward and try to find put the gear on
    	
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
}
