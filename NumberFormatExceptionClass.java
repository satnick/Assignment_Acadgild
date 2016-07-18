public class NumberFormatExceptionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			int num = Integer.parseInt("XYZ");
			System.out.println("Number: "+ num);
		}
		catch(NumberFormatException n)
		{
			System.out.println("Not a number");
		}
		catch(Exception e)
		{
			System.out.println("Some exception happened");
		}

	}
}
