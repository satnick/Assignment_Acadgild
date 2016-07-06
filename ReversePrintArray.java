import java.util.Scanner;

class ReversePrintArray
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []ar = new int[n];
        for(int i=0; i<n; i++)
        ar[i] = sc.nextInt();
        
        System.out.println();
        for(int i=0; i<n; i++)
        {
        System.out.print(ar[i] + " ");
        }
        System.out.println();
        for(int i=n-1; i>=0; i--)
        {
        System.out.print(ar[i] + " ");
        }
	}
}
