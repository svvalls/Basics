import java.util.Scanner;


public class DemoMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the age of the person = ");
		int a = scan.nextInt();
		String result = MinorOrAdult (a);
		System.out.println(result);

	}
	public static String MinorOrAdult (int Age){
		if (Age>=18)
			return "Adult";
		else
			return "Minor";
	}

}
