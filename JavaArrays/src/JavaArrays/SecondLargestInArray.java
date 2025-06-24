package JavaArrays;

import java.util.Scanner;

public class SecondLargestInArray {
	
	public static int SecondLargestArray(int[] arr) {
		int maximum = Integer.MIN_VALUE;
		int secondMaximum = Integer.MIN_VALUE;
		for(int i =0;i<arr.length;i++) {
			if(arr[i]>maximum ) {
				secondMaximum=maximum;
				maximum=arr[i];
			}else if(arr[i]<maximum && arr[i]>secondMaximum) {
				secondMaximum=arr[i];
			}
		}
		return secondMaximum;
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
		int n =SecondLargestArray(arr);
		System.out.println(n);
	}

}
