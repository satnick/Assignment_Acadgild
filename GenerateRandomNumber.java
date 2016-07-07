import java.util.Random;
import java.util.Scanner;
 
 public class GenerateRandomNumber {
	 public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		Random rand = new Random();
		System.out.println(rand.nextInt(n));
		}
}
