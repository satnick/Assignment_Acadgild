

interface PrintArea
{
	void print();
}

class Square implements PrintArea
{
	private int area;
	Square(int a){area = a*a;}
	public void print()
	{
		System.out.println("Area of square: "+area);
	}
}

class Rectangle implements PrintArea
{
	private int area;
	Rectangle(int a, int b){area = a*b;}
	public void print()
	{
		System.out.println("Area of rectangle: "+area);
	}
}

public class TestInterface  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rec = new Rectangle(3, 4);
		Square sq = new Square(5);
		rec.print();
		sq.print();
	}

}
