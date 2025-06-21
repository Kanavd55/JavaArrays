package JavaArrays;
import java.util.Scanner;

public class PrintArrayElement {
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] array = new int[n];
		for(int i = 0; i< n; i++) {
			array[i] = s.nextInt();
		}
		printArray(array);
	}
}
