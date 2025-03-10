/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.armSub;

public class armAutoMovmentLower extends CommandBase {
  private boolean endcommand = false;
  private final Timer m_timer = new Timer();
  private double time_to_wait = 5;
private armSub m_arm; 

  /*
   * Creates a new IntakeDumpCommand.
   */
  public armAutoMovmentLower(armSub m_arm){
    this.m_arm = m_arm;
    addRequirements(m_arm);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    m_timer.start();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    
    m_arm.armDown();
    
    
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    if(time_to_wait <= m_timer.get()){
      return true;
    }
    return false;
    
  }
}
