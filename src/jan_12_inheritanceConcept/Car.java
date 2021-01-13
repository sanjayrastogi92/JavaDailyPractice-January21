package jan_12_inheritanceConcept;

public class Car extends Vehicle{

	public void start() {
		System.out.println("car started");
	}

	public void stop() {
		System.out.println("car stopped");
	}
	
	public void refuel() {
		System.out.println("car refueled");
	}
}
