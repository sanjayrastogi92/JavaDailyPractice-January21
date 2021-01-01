package jan_01;

public class MethodOverloadingInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2,3,5,7,4,5};
		
		String[] str = {"Sanjay", "Ankit","Priyanshu","Shiv"};
		
		Double[] doub = {10.11, 32.11, 34.22, 12.23,33.12};
		
		Character[] ch = {'s','a','n','j','a','y'};

		printArray(arr);
		printArray(str);
		printArray(doub);
		printArray(ch);
	}

	
	public static void printArray(int[] ar) {
		
		for(int i : ar) {
			System.out.println(i);
		}
		
	}
	
	public static void printArray(String[] ar){
		
		for(String s : ar) {
			System.out.println(s);
		}
	}
	
	public static void printArray(Double[] ar) {
		
		for(Double d : ar) {
			System.out.println(d);
		}
	}
	
	public static void printArray(Character[] ar) {
		
		for(Character c : ar) {
			System.out.println(c);
		}
	}
}
