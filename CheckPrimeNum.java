import java.util.*;

public class CheckPrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=2;
		
		
			for(i=2; i<n; i++)
			{
				if(n%i == 0)break;
			}
		
		if(i == n) 
			System.out.println(n+" is a prime");
		else
			System.out.println(n + " is not a prime");
	}

}
