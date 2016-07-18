public class StrIndOutOfBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Acadgild";
		
		
		try
		{
			System.out.println(s.charAt(10));
		}
	
		catch(StringIndexOutOfBoundsException str)
		{
			System.out.println("Index is out of bound.");
		}
		

	}

}
