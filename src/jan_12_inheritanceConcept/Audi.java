package jan_12_inheritanceConcept;


public class Audi extends Car  {
	
	@Override
	public void start() {
		System.out.println("Audi started");
	}

	public void stereoMusic() {
		System.out.println("Audi music playing");
	}

}
