package org.firstinspires.ftc.teamcode.subsystems.teleop;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.arcrobotics.ftclib.hardware.SimpleServo;

public class GripperSubsystemClass extends SubsystemBase {
    private SimpleServo gripper;

    public GripperSubsystemClass(SimpleServo g){
        gripper = g;
    }

    public void close(){
        gripper.turnToAngle(45);
    }
    public void open(){
        gripper.turnToAngle(0);
    }
}