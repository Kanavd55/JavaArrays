package JavaArrays;

import java.util.Scanner;

public class LinearSearch {
	
	public static int FindIndex(int n,int[] arr) {
		int index = -1;
		for(int i =0;i<arr.length;i++) {
			if(arr[i]==n && index==-1) {
				index=i;
			}
		}
		return index;
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
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i =0;i<n;i++) {
			int[] arr = TakeArrayInput();
			int element = s.nextInt();
			int index = FindIndex(element,arr);
			System.out.println(index);
		}
	}
}
