package JavaArrays;

import java.util.Scanner;

public class RotateArrayOptimized {
	 public static void rotate(int[] arr, int d) {
		int[] arr2 = new int[d];
		for(int i=0;i<d;i++) {
			arr2[i]=arr[i];
		}
		int index=d;
		for(int i=0;i<arr.length-d;i++) {
			arr[i]=arr[index];
			index++;
		}
		int index2=0;
		for(int i=arr.length-d;i<arr.length;i++) {
			arr[i]=arr2[index2];
			index2++;
		}
	}
	
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static int[] TakeArrayInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i =0; i<n;i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] arr=TakeArrayInput();
		int n = s.nextInt();
		rotate(arr,n);
		printArray(arr);
	}
}
