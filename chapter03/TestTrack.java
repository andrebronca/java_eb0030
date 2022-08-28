package chapter03;


/**
 * Escreva uma descrição da classe TestTrack aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class TestTrack
{
   String name;
	Car c1;
	Car c2;
	Car c3;
	boolean isOpen;
	
	public TestTrack(String name) {
		this.name = name;
		isOpen = true;
		c1 = new Car("red", 100, true);
		c2 = new Car("blue", 120, true);
		c3 = new Car("green", 150, false);
	}
	
	public void runAllCars() {
		c1.pressStartButton();
		c2.pressStartButton();
		c3.pressStartButton();
		c1.setParkingBreak(false);
		c2.setParkingBreak(false);
		c1.pressAccelerator();
		c2.pressAccelerator();
		c3.pressAccelerator();
	}
	
	public void closeTrack() {
		c1.setParkingBreak(true);
		c2.setParkingBreak(true);
		c3.setParkingBreak(true);
		isOpen = false;
		System.out.println("The test track is now closed");
	}
	
	public void allStop() {
		c1.engineStarted = false;
		c2.engineStarted = false;
		c3.engineStarted = false;
		isOpen = true;
	}
}
