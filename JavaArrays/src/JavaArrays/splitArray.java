//Problem statement
//Given an integer array A of size N, check if the input array can be divided in two groups G1 and G2 with following properties-
//
//- Sum of both group elements are equal
//- Group 1: All elements in the input, which are divisible by 5 
//- Group 2: All elements in the input, which are divisible by 3 (but not divisible by 5). 
//- Elements which are neither divisible by 5 nor by 3, can be put in either group G1 or G2 to satisfy the equal sum property. 
//Group 1 and Group 2 are allowed to be unordered and all the elements in the Array A must belong to only one of the groups.
//
//
//
//Return true, if array can be split according to the above rules, else return false.
//
//Note: You will get marks only if all the test cases are passed.
//Detailed explanation ( Input/output format, Notes, Images )
//Constraints :
//1 <= N <= 50
//Sample Input 1 :
//2
//1 2
//Sample Output 1 :
//false
//Sample Input 2 :
//3
//1 4 3
//Sample Output 2 :
//true



package JavaArrays;

import java.util.Scanner;

public class splitArray {
	
	public static boolean check(int[] arr,int size,int startIndex, int leftSum,int rightSum) {
		if(startIndex==size) {
			return leftSum==rightSum;
		}
		if(arr[startIndex]%5==0) {
			leftSum=leftSum+arr[startIndex];
		}else if(arr[startIndex]%3==0) {
			rightSum=rightSum+arr[startIndex];
		}else {
			boolean leftAns=check(arr,size,startIndex+1,leftSum+arr[startIndex],rightSum);
			boolean rightAns=check(arr,size,startIndex+1,leftSum,rightSum+arr[startIndex]);
			return leftAns || rightAns;
		}
		return check(arr,size,startIndex+1,leftSum,rightSum);
	}
	
	public static boolean splitArray(int[] arr) {
		return check(arr,arr.length,0,0,0);
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
		int[] arr = TakeArrayInput();
		System.out.println(splitArray(arr));
	}
}
