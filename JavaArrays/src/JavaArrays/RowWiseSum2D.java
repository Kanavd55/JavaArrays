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
