package JavaArrays;

import java.util.Scanner;

public class PrintArrayTwoD {

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
	
	public static void printArray2d(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j =0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[][] arr = TakeArrayInput2d();
		printArray2d(arr);
	}
}
