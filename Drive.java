package org.usfirst.frc.team4787.robot;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Drive extends Subsystem {

	private RobotDrive driveTrain;
	private String mode;
	
	public Drive() {
		super();
	}
	
	public Drive(RobotDrive rd) {
		driveTrain = rd;
		this.mode = "Disabled";
	}
	
	@Override
	protected void initDefaultCommand() {
		switch(this.getMode()) {
		case "Disabled":
			driveTrain.arcadeDrive(0.0,0.0);
			break;
		case "Autonomous":
			break;
		case "TeleOp":
			break;
		default:
			break;
		}
	}
	
	public void arcadeDrive(double moveValue, double rotateValue) {
		driveTrain.arcadeDrive(moveValue,rotateValue);
	}
	
	public String getMode() {
		return this.mode;
	}
	
	public void setMode(String value) {
		this.mode = value;
	}
}
