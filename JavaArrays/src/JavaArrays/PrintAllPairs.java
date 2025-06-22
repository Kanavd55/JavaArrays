package JavaArrays;
import java.util.Scanner;

public class PrintAllPairs {
	
	public static void PrintAllPair(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				System.out.println(arr[i] +","+arr[j]);
			}
		}
	}
	public static int[] TakeArrayInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr=TakeArrayInput();
		PrintAllPair(arr);
	}
}
