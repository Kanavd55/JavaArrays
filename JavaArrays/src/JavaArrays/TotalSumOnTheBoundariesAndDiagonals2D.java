//Problem statement
//You are given a two-dimensional square matrix of size N×N. You need to find the sum of the elements on:
//
//The main diagonal (from the top-left corner to the bottom-right corner).
//The secondary diagonal (from the top-right corner to the bottom-left corner).
//All the boundary elements of the matrix
//Make sure that no element is counted more than once, even if it belongs to both diagonals or is a boundary element. Your task is to compute the sum of all these unique elements.
//
//Detailed explanation ( Input/output format, Notes, Images )
//Constraints:
//1 <= t <= 10^2
//0 <= N <= 10^3
//Time Limit: 1sec
//Sample input 1:
//1
//3
//1 2 3
//4 5 6
//7 8 9
//Sample Output 1:
//45
//Explanation for Sample Output 1:
//The boundary elements are 1, 2, 3, 6, 9, 8, 7 and 4. 
//
//The first-diagonal elements are 1, 5 and 9. 
//
//The second-diagonal elements are 3, 5 and 7.
//
//We just need to add all these numbers making sure that no number is added twice. For example, '1' is both a boundary element and a first-diagonal element similarly, '5' contributes to both the diagonals but they won't be added twice.
//
//Hence, we add up, [1 + 2 + 3 + 6 + 9 + 8 + 7 + 4 + 5] to give 45 as the output.
//Sample input 2:
//2
//5
//1 2 3 4 5
//6 7 8 9 10
//11 12 13 14 15
//16 17 18 19 20
//21 22 23 24 25
//4
//1 2 3 10
//4 5 6 11
//7 8 9 12
//13 14 15 16
//Sample Output 2:
//273
//136

package JavaArrays;

import java.util.Scanner;

public class TotalSumOnTheBoundariesAndDiagonals2D {
	public static void totalSum(int[][] mat) {
		int rows=mat.length;
		int sum = 0;
		if(rows==0) {
			System.out.println(sum);
			return;
		}
		int cols=mat[0].length;
		for(int i=0;i<rows;i++) {
			for(int j =0;j<cols;j++) {
				if(i==0) {
					sum=sum+mat[i][j];
				}else if(i==rows-1) {
					sum=sum+mat[i][j];
				}else {
					if(j==0) {
						sum=sum+mat[i][j];
					}else if(j==cols-1) {
						sum=sum+mat[i][j];
					}else {
						if(i==j) {
							sum=sum+mat[i][j];
						}else if(j==cols-i-1) {
							sum=sum+mat[i][j];
						}
					}
				}
			}
		}
		System.out.println(sum);
	}

	public static int[][] TakeArrayInput2d(){
		Scanner s = new Scanner(System.in);
		int rows = s.nextInt();
		int cols = rows;
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
			totalSum(arr);
		}
	}
}
