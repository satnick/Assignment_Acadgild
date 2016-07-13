package shapepac;

class Shape
{	
	public Shape(int a, int b)
	{
		 System.out.println("Area of rectangle: " + a*b);
	}
	public Shape(int a)
	{
		System.out.println("Area of square: " +a*a);
	}
	
	

}





class Rectangle extends Shape
{
	public Rectangle(int a, int b)
	{
		super(a,b);
	}
}

class Square extends Shape
{
	public Square(int a)
	{
		super(a);
	}
}
public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rec = new Rectangle(1,3);
		Square sq = new Square(2);
		

	}

}
