package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Claw;

public class CommandStopCoral extends Command {
    public final Claw m_claw;
    public CommandStopCoral(Claw subsystem) {
        addRequirements(subsystem);
        m_claw = subsystem;
    }
    
    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
        m_claw.setVoltage(0);
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        m_claw.setVoltage(0);
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
            return true;

    }
}
