package chapter03;


/**
 * Escreva uma descrição da classe Car aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Car
{
    String colour;
	double enginePower;
	boolean isConvertible;
	boolean isDirectionForwards;
	boolean parkingBrakeOn;
	boolean isMoving;
	boolean engineStarted;

	public Car(String colour, double enginePower, boolean isConvertible) {
		this.colour = colour;
		this.enginePower = enginePower;
		this.isConvertible = isConvertible;
		isDirectionForwards = true;
		parkingBrakeOn = true;
		isMoving = false;
		engineStarted = false;
	}
	
	public void pressAccelerator() {
		if(!parkingBrakeOn && engineStarted) {
			System.out.println("The "+ colour +" car is moving");
			isMoving = true;
		}
		else if (engineStarted) {
			System.out.println("The parking brake for the "+ colour +" car is on!");
			isMoving = false;
		}
		else {
			System.out.println("The engine for the "+ colour +" car is not started");
			
		}
	}
	
	public void setParkingBreak(boolean parkingBrakeOn) {
		this.parkingBrakeOn = parkingBrakeOn;
	}
	
	public boolean getParkingBreak() {
		return parkingBrakeOn;
	}
	
	public void pressStartButton() {
		if(!engineStarted) {
			System.out.println("Engine for the "+ colour +" car is starting");
			engineStarted = true;
		}
	}
}
