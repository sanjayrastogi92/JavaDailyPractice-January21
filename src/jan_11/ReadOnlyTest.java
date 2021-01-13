package jan_11;

public class ReadOnlyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account acc = new Account();
		String name = acc.getName();
		System.out.println(name);
		
		String lastName = acc.getlastName();
		System.out.println(lastName);
		
		String dob = acc.getdob();
		System.out.println(dob);
		
		acc.kyc=true;
		
		System.out.println(acc.kyc);
	}

}
