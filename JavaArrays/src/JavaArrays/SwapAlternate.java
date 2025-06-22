package JavaArrays;

import java.util.Scanner;

public class SwapAlternate {
	public static void SwapAlternate(int[] arr) {
		for(int i=0;i<arr.length;i=i+2) {
			int j = i+1;
			if(j>=arr.length) {
				break;
			}
			int element = arr[i];
			arr[i]=arr[j];
			arr[j]=element;
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
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr=TakeArrayInput();
		SwapAlternate(arr);
		printArray(arr);
	}

}
