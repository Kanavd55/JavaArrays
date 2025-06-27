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
