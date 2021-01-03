package jan_03;

public class BasicConstructor2 {
	
	String name;
	int rollno;
	
	BasicConstructor2(String name, int rollno){
		this.name = name;
		this.rollno = rollno;
		
		System.out.println("within constructor");
	}
	
	
	public static void main(String[] args) {
		
		BasicConstructor2 ba1 = new BasicConstructor2("Sanjay", 101);
		BasicConstructor2 ba2 = new BasicConstructor2("Shiv", 102);
		BasicConstructor2 ba3 = new BasicConstructor2("Vinay", 103);

	}

}
