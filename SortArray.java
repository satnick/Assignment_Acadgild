 import java.util.Arrays;
 import java.util.Scanner;

public class SortArray {
    static public void main(String[] args) {
		int arr1[] = { 60, 13, 42, 23, 84, 15 };
	   int arr2[] = new int[arr1.length+1];//{12, 10, 20, 30, 40, 50, 6 };
		
	   
	   Arrays.sort(arr1);
	   System.out.println(Arrays.toString(arr1));
	   //System.out.println(Arrays.toString(arr2));
	   System.arraycopy(arr1, 0, arr2, 0, arr1.length);
	   //System.out.println(Arrays.toString(arr2));
	   Scanner sc = new Scanner(System.in);
	   
	   arr2[arr1.length] = sc.nextInt();
	   System.out.println(Arrays.toString(arr2));
    }
}
