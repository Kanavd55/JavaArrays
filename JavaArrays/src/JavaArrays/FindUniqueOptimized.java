package JavaArrays;

import java.util.Scanner;

public class FindUniqueOptimized {
	
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
	
	public static int findUniqueAnother(int[] arr) {
		if(arr.length==1) {
			return arr[0];
		}
		InsertionSort(arr);
		int i=0;
		int unique = -1;
		while(i<arr.length) {
			if(i+1==arr.length) {
				unique=arr[i];
				break;
			}
			if(arr[i]!=arr[i+1]) {
				unique=arr[i];
				break;
			}else {
				i=i+2;
			}
		}
		return unique;
		
	}
	public static int findUnique(int[] arr) {
		//Your code goes here
		//5^ 5 =0 (EXOR)
		int unique=0;
		for(int i=0;i<arr.length;i++) {
			unique=unique ^ arr[i];
		}
		return unique;
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
		System.out.println(findUnique(arr));
	}
}
