package jan_04;

import java.util.Scanner;

public class BrowserCallUsingSwitch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any browser name");
		String browserName = sc.nextLine();
		
		sc.close();
		
		System.out.println("You've entered "+browserName+" browser");
		
		switch(browserName.toLowerCase())
		{
		case "chrome":
			System.out.println("Launching chrome");
			break;
			
		case "firefox":
			System.out.println("Launching firefox");
			break;
			
		case "IE":
			System.out.println("Launching IE");
			break;
			
		default:
			System.out.println("Please enter the valid browser name");
		}

	}

}
