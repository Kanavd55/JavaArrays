package JavaArrays;
import java.util.Scanner;

public class FindingLargestElement {
	public static int LargestElement(int[] arr) {
		int Largest = Integer.MIN_VALUE;
		for(int i =0;i<arr.length;i++) {
			if(arr[i]>Largest) {
				Largest=arr[i];
			}
		}
		return Largest;
	}
	
	public static int[] TakeArrayInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] array = new int[n];
		for(int i =0;i<n;i++) {
			array[i]=s.nextInt();
		}
		return array;
	}
	
	public static void main(String[] args) {
		int[] arr=TakeArrayInput();
		int Largest = LargestElement(arr);
		System.out.println(Largest);
	}
}
