package jan_01;
import java.util.*;

public class ValuesAtOddPositionInArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements you want to enter");
		int num = sc.nextInt();
		
		System.out.println("Enter all the elements of array");
		int[] arr = new int[num];
		
		for(int i=0; i<num; i++) {
			
			arr[i]=sc.nextInt();
		}
		
		sc.close();
		
		System.out.println("Elements at odd places are :");
		
		for(int j=0; j<num; j++) {
			
			if(j%2==0) {
				System.out.println(arr[j]);
			}
		}

	}

}
