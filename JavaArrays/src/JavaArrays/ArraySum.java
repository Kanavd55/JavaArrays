package JavaArrays;
import java.util.Scanner;

public class ArraySum {
	public static int ArraySum(int[] arr) {
		int sum = 0;
		for(int i =0 ; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}
	
	public static int[] TakeArrayInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] array = new int[n];
		for(int i =0; i<n;i++) {
			array[i]=s.nextInt();
		}
		return array;
	}
	
	
	public static void main(String[] args) {
		int[] array= {1,2,3,4,5};
		int sum = ArraySum(array);
		System.out.println(sum);
	}
}
