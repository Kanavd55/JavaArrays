//Problem statement
//You are given a 2D list (array) with dimensions N rows and M columns, filled with integers. Your task is to find the row or column that has the largest sum of its elements.
//
//Important Rules:
//- If two or more rows/columns have the same sum, choose the one that comes first.
//- If a row and a column have the same largest sum, choose the row.
//Goal: Return which row or column has the largest sum.
//
//Detailed explanation ( Input/output format, Notes, Images )
//Constraints:
//1 <= t <= 10^2
//1 <= N <= 10^3
//1 <= M <= 10^3
//Time Limit: 1sec
//Sample Input 1:
//1
//3 2
//6 9 
//8 5 
//9 2 
//Sample Output 1:
//column 0 23
//Sample Input 2:
//1
//4 4
//6 9 8 5 
//9 2 4 1 
//8 3 9 3 
//8 7 8 6 
//Sample Output 2:
//column 0 31



package JavaArrays;

import java.util.Scanner;

public class LargestRowOrColumn2d {
	
	public static void LargesRowColumn(int[][] arr) {
		int HighestColumnSum = Integer.MIN_VALUE;
		int columnNum = -1;
		int HighestRowSum = Integer.MIN_VALUE;
		int rowNum = -1;
		if(arr.length==0){
			System.out.println("row "+0+" "+Integer.MIN_VALUE);
			return;
		}
		for(int i=0;i<arr.length;i++) {
			int rowSum=0;
			for(int j=0;j<arr[0].length;j++) {
				rowSum=rowSum+arr[i][j];
			}
			if(rowSum>HighestRowSum) {
				HighestRowSum=rowSum;
				rowNum=i;
			}
		}
		
		for(int i=0;i<arr[0].length;i++) {
			int colSum = 0;
			for(int j=0;j<arr.length;j++) {
				colSum = colSum+ arr[j][i];
			}
			if(colSum>HighestColumnSum) {
				HighestColumnSum=colSum;
				columnNum=i;
			}
		}
		if(HighestColumnSum > HighestRowSum) {
			System.out.println("column "+columnNum+" "+HighestColumnSum);
		}else {
			System.out.println("row "+rowNum+" "+HighestRowSum);
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
			LargesRowColumn(arr);
		}
	}
}
