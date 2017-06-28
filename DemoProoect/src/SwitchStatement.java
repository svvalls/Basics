import java.util.Scanner;


public class SwitchStatement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter Marks of the student = ");
		int Marks = scan.nextInt();
		if (Marks >= 90){
			System.out.println("Distinction");
		}
		if ((Marks >= 70) & (Marks < 90)){
			System.out.println("First class");
		}

	}

}
