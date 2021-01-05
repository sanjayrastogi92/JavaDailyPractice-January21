package jan_05;

import java.util.Scanner;

public class AreaAndCircumference {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the radius of the circle");
		int radius = sc.nextInt();
		
		AreaAndCircumference ac = new AreaAndCircumference();
		ac.getAreaAndCircum(radius);
		sc.close();

	}
	
	public void getAreaAndCircum(int rad) {
		float area = (float) (3.14*rad*rad);
		System.out.println("Area of the cirlce of radius : "+rad+" is "+area);
		
		float circum = (float) (2*3.14*rad);
		System.out.println("Circumference of the circle of radius : "+rad+" is "+circum);
	}

}
