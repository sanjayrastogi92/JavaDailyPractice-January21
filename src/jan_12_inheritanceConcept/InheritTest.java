package jan_12_inheritanceConcept;

public class InheritTest {

	public static void main(String[] args) {
		
	
		Car c = new Audi(); //Top Casting
		c.start();
		c.refuel();
	
		Audi a = (Audi) new Car(); //Down Casting
		a.start();
		
		// It will be compiled easily or no compile time error will be there
		// but it will show Run time exception 
	}

}
