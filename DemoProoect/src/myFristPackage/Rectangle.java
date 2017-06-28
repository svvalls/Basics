package myFristPackage;

public class Rectangle {
	
	int Height ;
	int Length;
	int Breadth ;
	
	public int getRecvolume()
	{
		return (Height *Length * Breadth);
	}
	
	Rectangle ()
	{
		Height = 10;
		Length = 20;
		Breadth = 30;
	}
	Rectangle (int l, int b, int h){
		Length = l;
		Breadth = b;
		Height = h;
	}
	
	
	}


