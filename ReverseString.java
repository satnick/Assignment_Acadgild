import java.util.Scanner;

public class ReverseString {
    static public void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		System.out.println(s);
		String rev = "";
		for(int i=s.length()-1; i>=0; i--)
		{
			rev += s.charAt(i);
		}

		System.out.println(rev);
    }
}
