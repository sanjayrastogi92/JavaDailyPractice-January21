package jan_11;

public class EncapConceptTest {

	public static void main(String[] args) {
		
		EncapConcept ec = new EncapConcept();
		ec.name = "Udita";
		
		System.out.println(ec.name);
		
		//ec.title="Testing";
		ec.setTitle("Testing");
		String actualTitle = ec.getTitle();
		System.out.println(actualTitle);

		ec.balanceUpdate();
	}

}
