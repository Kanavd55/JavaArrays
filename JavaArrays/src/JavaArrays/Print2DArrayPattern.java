//Problem statement
//Given a 2D integer array with n rows and m columns. Print the 0th row from input n times, 1st row n-1 times…..(n-1)th row will be printed 1 time.
//
//Detailed explanation ( Input/output format, Notes, Images )
//Sample Input 1:
//3 3
//1 2 3
//4 5 6
//7 8 9
//Sample Output 1 :
//1 2 3
//1 2 3
//1 2 3
//4 5 6
//4 5 6
//7 8 9

package JavaArrays;

import java.util.Scanner;

public class Print2DArrayPattern {
	
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void print2DArraypatter(int[][] arr) {
		if(arr.length==0) {
			return;
		}
		for(int i=0;i<arr.length;i++) {
			int num = arr.length-i-1;
			while(num>=0) {
				printArray(arr[i]);
				num--;
			}
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
		int[][] arr = TakeArrayInput2d();
		print2DArraypatter(arr);
	}
}
