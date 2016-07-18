
import java.util.Scanner;

public class ArrayIndOutOfBoundExcHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<5; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("enter index to be displayed");
		int ind = sc.nextInt();
		try{
			if(ind>4 || ind < 0)
				throw new ArrayIndexOutOfBoundsException(ind);
			System.out.println("Array at index: "+ind+" is "+ arr[ind]);
		}
		catch(ArrayIndexOutOfBoundsException ar)
		{
			System.out.println("Index: "+ind + " not in range 0 to 4");
		}
		
		
		System.out.println("ended");
		sc.close();
		
		
		

	}

}
