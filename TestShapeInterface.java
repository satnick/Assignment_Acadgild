package interfacepac;

interface Shape
{	
	void draw();
	int getArea();

}




class Rectangle implements Shape
{
	private int len,brd,area;
	public Rectangle(int a, int b)
	{
		len = a;
		brd = b;
	}
	public void draw() {
		area = len*brd;
	}
	
	public int getArea()
	{
		return area;
		
	}
}

class Square implements Shape
{
	private int a,area;
	
	public Square(int a)
	{
		this.a = a;
		
	}
	public void draw()
	{
		area = a*a;
	}
	
	public int getArea()
	{
		return area;
	}
}


public class TestShapeInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new Rectangle(4, 6);
		s.draw();
		System.out.println("Area of rectangle: "+s.getArea());
		
		Shape s2 = new Square(7);
		s2.draw();
		System.out.println("Area of square: "+s2.getArea());
		

	}

}
