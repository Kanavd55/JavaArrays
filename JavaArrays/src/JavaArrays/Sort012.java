//Problem statement
//You are given an integer array/list(ARR) of size N. It contains only 0s, 1s and 2s. Write a solution to sort this array/list in a 'single scan'.
//
//'Single Scan' refers to iterating over the array/list just once or to put it in other words, you will be visiting each element in the array/list just once.
//
//Note:
//1. You need to change in the given array/list itself. Hence, no need to return or print anything. 
//2. You are not allowed to sort the list/array directly.
//Detailed explanation ( Input/output format, Notes, Images )
//Constraints :
//1 <= t <= 10^2
//0 <= N <= 10^5
//Time Limit: 1 sec
//Sample Input 1:
//1
//7
//0 1 2 0 2 0 1
//Sample Output 1:
//0 0 0 1 1 2 2 
//Explanation:  The array contains three 0s, two 1s, and two 2s. After sorting the array in a single scan, the 0s should come first, then the 1s, and finally the 2s. So the output is 0 0 0 1 1 2 2.
//Sample Input 2:
//2
//5
//2 2 0 1 1
//7
//0 1 2 0 1 2 0
//Sample Output 2:
//0 1 1 2 2 
//Explanation: The array contains one 0, two 1s, and two 2s. After sorting, the 0 comes first, then the 1s, and finally the 2s. So the output is 0 1 1 2 2.
//0 0 0 1 1 2 2
//Explanation: The array contains three 0s, two 1s, and two 2s. After sorting, the 0s come first, then the 1s, and finally the 2s. So the output is 0 0 0 1 1 2 2.
//
//



package JavaArrays;
import java.util.Scanner;
public class Sort012 {
	public static void SortArray(int[] arr) {
		int i=0;
		int PZ=0;
		int PT=arr.length-1;
		while(i<=PT) {
			if(arr[i]==2) {
				int element=arr[i];
				arr[i]=arr[PT];
				arr[PT]=element;
				PT--;
			}else if(arr[i]==0) {
				int element=arr[i];
				arr[i]=arr[PZ];
				arr[PZ]=element;
				PZ++;
				i++;
			}else {
				i++;
			}
		}
	}

	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
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
		Scanner s = new Scanner(System.in);
		int[] arr=TakeArrayInput();
		SortArray(arr);
		printArray(arr);
	}

}
