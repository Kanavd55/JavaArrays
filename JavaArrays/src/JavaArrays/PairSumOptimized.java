//Problem statement
//You have been given an integer array/list(ARR) and a number 'num'. Find and return the total number of pairs in the array/list which sum to 'num'.
//
//Note:
//Given array/list can contain duplicate elements. 
//Detailed explanation ( Input/output format, Notes, Images )
//Constraints :
//1 <= t <= 10^2
//0 <= N <= 10^4
//0 <= num <= 10^9
//
//Time Limit: 1 sec
//Sample Input 1:
//1
//9
//1 3 6 2 5 4 3 2 4
//7
//Sample Output 1:
//7
//Sample Input 2:
//2
//9
//1 3 6 2 5 4 3 2 4
//12
//6
//2 8 10 5 -2 5
//10
//Sample Output 2:
//0
//2
//
//
// Explanation for Input 2:
//Since there doesn't exist any pair with sum equal to 12 for the first query, we print 0.
//
//For the second query, we have 2 pairs in total that sum up to 10. They are, (2, 8) and (5, 5).




package JavaArrays;

import java.util.Scanner;

public class PairSumOptimized {
	
	
	
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
	
	public static int pairSum(int[] arr, int num) {
		//Your code goes here
		int sumPair = 0;
		InsertionSort(arr);
		int i=0;
		int j =arr.length-1;
		while(i<j) {
			if((arr[i]+arr[j])>num) {
				j--;
			}else if((arr[i]+arr[j])<num) {
				i++;
			}else {
				sumPair++;
				i++;
				j--;
			}
		}
		return sumPair;
		
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
		int[] arr = TakeArrayInput();
		int n = s.nextInt();
		System.out.println(pairSum(arr,n));
	}
}
