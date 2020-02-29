package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Intake extends SubsystemBase {

    private final CANSparkMax roller;
    private final TalonSRX rightBelt, leftBelt;

    public Intake() {
        roller = new CANSparkMax(Constants.roller, MotorType.kBrushed);
        rightBelt = new TalonSRX(Constants.rightBelt);
        leftBelt = new TalonSRX(Constants.leftBelt);

        rightBelt.setInverted(false);
        leftBelt.setInverted(true);
    }

    public void setRoller(double speed) {
        roller.set(speed);
    }

    public void setBelts(double speed) {
        rightBelt.set(ControlMode.PercentOutput, speed);
        leftBelt.set(ControlMode.PercentOutput, speed);
    }

    public void setBelts(double rightSpeed, double leftSpeed) {
        rightBelt.set(ControlMode.PercentOutput, rightSpeed);
        leftBelt.set(ControlMode.PercentOutput, leftSpeed);
    }

}