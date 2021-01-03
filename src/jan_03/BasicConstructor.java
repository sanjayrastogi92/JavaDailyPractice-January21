package jan_03;

public class BasicConstructor {

	static int count =0;
	BasicConstructor(){
		count++;
	}
	
	public static void main(String[] args) {
		

		BasicConstructor bc1 = new BasicConstructor();
		BasicConstructor bc2 = new BasicConstructor();
		BasicConstructor bc3 = new BasicConstructor();
		System.out.println(count);

	}

}
