package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Outtake extends SubsystemBase {

    private final CANSparkMax rightFlywheel, leftFlywheel;

    public Outtake() {
        rightFlywheel = new CANSparkMax(Constants.rightFlywheel, MotorType.kBrushed);
        leftFlywheel = new CANSparkMax(Constants.leftFlywheel, MotorType.kBrushed);

        rightFlywheel.setInverted(false);
        leftFlywheel.setInverted(false);
    }

    public void setFlywheels(double speed) {
        leftFlywheel.set(speed);
        rightFlywheel.set(speed);
    }

}