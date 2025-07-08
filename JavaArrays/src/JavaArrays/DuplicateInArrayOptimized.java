package JavaArrays;

import java.util.Scanner;

public class DuplicateInArrayOptimized {
	
	public static int findDuplicate(int[] arr) {
		//Your code goes here
		InsertionSort(arr);
		int Duplicate = -1;
		for(int i=0;i<arr.length;i++) {
			if(i+1==arr.length) {
				break;
			}
			if(arr[i]==arr[i+1] ){
				Duplicate=arr[i];
				break;
			}
		}
		return Duplicate;
	}
	
	public static void InsertionSort(int[] arr) {
		if(arr.length==1) {
			return;
		}
		for(int i=1;i<arr.length;i++) {
			int element=arr[i];
			int j = i-1;
			while(j>=0 && element<arr[j]) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=element;
		}
		return;
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
		int[] arr = TakeArrayInput();
	}
}
