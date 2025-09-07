// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;

public class Robot extends TimedRobot {
  private VictorSP leftDrive;
  private VictorSP rightDrive;

  private XboxController controller;

  private DifferentialDrive m_robotDrive;

  public Robot() {
    leftDrive = new VictorSP(1);
    rightDrive = new VictorSP(0);

    rightDrive.setInverted(true);


    controller = new XboxController(0);

    m_robotDrive = new DifferentialDrive(leftDrive::set, rightDrive::set);
  }

  @Override
  public void robotPeriodic() {}

  @Override
  public void autonomousInit() {}

  @Override
  public void autonomousPeriodic() {}

  @Override
  public void teleopInit() {}

  @Override
  public void teleopPeriodic() {
    m_robotDrive.arcadeDrive(-controller.getLeftY(), -controller.getRightX());
  }

  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  @Override
  public void testInit() {}

  @Override
  public void testPeriodic() {}

  @Override
  public void simulationInit() {}

  @Override
  public void simulationPeriodic() {}
}
