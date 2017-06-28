import java.util.Scanner;




public class ScannerClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the next string line");
		boolean New = scan.hasNextByte();
		System.out.println("The next string valur entered is = "+New);

	}

}
