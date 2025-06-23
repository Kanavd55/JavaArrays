package JavaArrays;

import java.util.Scanner;

public class Sort01 {
	
	public static void SortArray(int[] arr) {
		int i =0;
		int j =arr.length-1;
		while(i<j) {
			if(arr[i]==0) {
				i++;
			}else if(arr[j]==1) {
				j--;
			}else {
				int element = arr[i];
				arr[i]=arr[j];
				arr[j]=element;
			}
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
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i =0;i<n;i++) {
			int[] arr = TakeArrayInput();
			SortArray(arr);
			printArray(arr);
		}
	}
}
