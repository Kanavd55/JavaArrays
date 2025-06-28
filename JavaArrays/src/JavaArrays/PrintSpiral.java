//Problem statement
//For a given two-dimensional integer array/list of size (N x M), print it in a spiral form. That is, you need to print in the order followed for every iteration:
//
//a. First row(left to right)
//b. Last column(top to bottom)
//c. Last row(right to left)
//d. First column(bottom to top)
// Mind that every element will be printed only once.
//
//Refer to the Image:
//Spiral path of a matrix
//
//Detailed explanation ( Input/output format, Notes, Images )
//Constraints :
//1 <= t <= 10^2
//0 <= N <= 10^3
//0 <= M <= 10^3
//Time Limit: 1sec
//Sample Input 1:
//1
//4 4 
//1 2 3 4 
//5 6 7 8 
//9 10 11 12 
//13 14 15 16
//Sample Output 1:
//1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 
//Sample Input 2:
//2
//3 3 
//1 2 3 
//4 5 6 
//7 8 9
//3 1
//10
//20
//30
//Sample Output 2:
//1 2 3 6 9 8 7 4 5 
//10 20 30 

package JavaArrays;

import java.util.Scanner;

public class PrintSpiral {
	
	public static void spiralPrint(int matrix[][]){
		//Your code goes here
		if(matrix.length==0) {
			return;
		}
		int count = matrix.length * matrix[0].length;
		int colStart = 0;
		int colEnd = matrix[0].length-1;
		int rowStart = 0;
		int rowEnd = (matrix.length-1);
		while(count>0) {
			//Print 1st row
			for(int i=colStart;i<=colEnd;i++) {
				System.out.print(matrix[rowStart][i]+" ");
				count--;
			}
			rowStart++;
			//Print last column
			for(int i =rowStart;i<=rowEnd;i++) {
				System.out.print(matrix[i][colEnd]+" ");
				count--;
			}
			colEnd--;
			//Print last row
			for(int i=colEnd;i>=colStart;i--) {
				System.out.print(matrix[rowEnd][i]+" ");
				count--;
			}
			rowEnd--;
			for(int i=rowEnd;i>=rowStart;i--) {
				System.out.print(matrix[i][colStart]+" ");
				count--;
			}
			colStart++;
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
			spiralPrint(arr);
		}
	}

}
