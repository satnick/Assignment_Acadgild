
public class NullPointerExceptionHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s=null;
		
		try
		{
			System.out.println(s.length());
		}
		catch(NullPointerException np)
		{
			System.out.println("String is not initialized");
		}
		

	}

}
