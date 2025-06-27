//Problem statement
//For a given two-dimensional integer array/list of size (N x M), find and print the sum of each of the row elements in a single line, separated by a single space.
//
//Detailed explanation ( Input/output format, Notes, Images )
//Constraints :
//1 <= t <= 10^2
//0 <= N <= 10^3
//0 <= M <= 10^3
//Time Limit: 1sec
//Sample Input 1:
//1
//4 2 
//1 2 
//3 4 
//5 6 
//7 8
//
//
//Sample Output 1:
//3 7 11 15 
//Sample Input 2:
//2
//2 5 
//4 5 3 2 6 
//7 5 3 8 9
//
//
//4 4
//1 2 3 4
//9 8 7 6
//3 4 5 6
//-1 1 -10 5
//
//
//Sample Output 2:
//20 32 
//10 30 18 -5


package JavaArrays;

import java.util.Scanner;

public class RowWiseSum2D {
	public static void RowWiseSum(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			int sum = 0;
			for(int j =0;j<arr[0].length;j++) {
				sum=sum+arr[i][j];
			}
			System.out.print(sum+" ");
		}
	}
	
	public static int[][] TakeArrayInput2d(){
		Scanner s = new Scanner(System.in);
		int rows = s.nextInt();
		int cols = s.nextInt();
		int [][] arr = new int[rows][cols];
		for(int i=0;i<rows;i++) {
			for(int j =0;j<cols;j++) {
				arr[i][j] = s.nextInt();
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i =0;i<n;i++) {
			int[][] arr = TakeArrayInput2d();
			RowWiseSum(arr);
		}
		
	}
}
