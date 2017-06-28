package myFristPackage;

public class RecVolume {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rec = new Rectangle();
		
		System.out.println(rec.getRecvolume());
		
		Rectangle rec2 = new Rectangle(1,1,3);
		System.out.println(rec2.getRecvolume());
	}

}
