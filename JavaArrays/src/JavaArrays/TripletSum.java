package JavaArrays;

import java.util.Scanner;
public class TripletSum {
	public static int FindTripletSum(int sum,int[] arr) {
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j =i+1;j<arr.length;j++) {
				for(int k = j+1;k<arr.length;k++) {
					if(arr[i]+arr[j]+arr[k]==sum) {
						count++;
					}
				}
			}
		}
		return count;
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
			int Sum = s.nextInt();
			int count = FindTripletSum(Sum,arr);
			System.out.println(count);
		}
	}
}
