//Problem statement
//You have been given a random integer array/list(ARR) of size N. Write a function that rotates the given array/list by D elements(towards the left).
//
// Note:
//Change in the input array/list itself.You don't need to return or print the elements.
//Detailed explanation ( Input/output format, Notes, Images )
//Constraints :
//1 <= t <= 10^4
//0 <= N <= 10^6
//0 <= D <= N
//Time Limit: 1 sec
//Sample Input 1:
//1
//7
//1 2 3 4 5 6 7
//2
//Sample Output 1:
//3 4 5 6 7 1 2
//Sample Input 2:
//2
//7
//1 2 3 4 5 6 7
//0
//4
//1 2 3 4
//2
//Sample Output 2:
//1 2 3 4 5 6 7
//3 4 1 2









package JavaArrays;

import java.util.Scanner;

public class RotateArray {
	
//Brute Force Solution
//	public static int[] RotateArray(int[] arr,int element) {
//		int[] arr2 = new int[arr.length];
//		int k =0;
//		for(int i = element;i<arr.length;i++) {
//			arr2[k]=arr[i];
//			k++;
//		}
//		for(int i=0;i<element;i++) {
//			arr2[k]=arr[i];
//			k++;
//		}
//		return arr2;
//	}
	
	public static void RotateArray(int[] arr,int element) {
		int[] arr2=new int[element];
		int d=element;
		for(int i=0;i<element;i++) {
			arr2[i]=arr[i];
		}
		for(int i=0;i<arr.length && d<arr.length;i++) {
			arr[i]=arr[d];
			d++;
		}
		d=0;
		for(int i = arr.length-element;i<arr.length;i++) {
			arr[i]=arr2[d];
			d++;
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
		RotateArray(arr,n);
		printArray(arr);
	}
}
