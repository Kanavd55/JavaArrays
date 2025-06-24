//Problem statement
//Two random integer arrays/lists have been given as ARR1 and ARR2 of size N and M respectively. Both the arrays/lists contain numbers from 0 to 9(i.e. single digit integer is present at every index). The idea here is to represent each array/list as an integer in itself of digits N and M.
//
//You need to find the sum of both the input arrays/list treating them as two integers and put the result in another array/list i.e. output array/list will also contain only single digit at every index.
//
//Note:
//The sizes N and M can be different. 
//
//Output array/list(of all 0s) has been provided as a function argument. Its size will always be one more than the size of the bigger array/list. Place 0 at the 0th index if there is no carry. 
//
//No need to print the elements of the output array/list.
//Using the function "sumOfTwoArrays", write the solution to the problem and store the answer inside this output array/list. The main code will handle the printing of the output on its own.
//Detailed explanation ( Input/output format, Notes, Images )
//Constraints :
//1 <= t <= 10^2
//0 <= N <= 10^5
//0 <= M <= 10^5
//Time Limit: 1 sec 
//Sample Input 1:
//1
//3
//6 2 4
//3
//7 5 6
//Sample Output 1:
//1 3 8 0
//Sample Input 2:
//2
//3
//8 5 2
//2
//1 3
//4
//9 7 6 1
//3
//4 5 9
//Sample Output 2:
//0 8 6 5
//1 0 2 2 0 

package JavaArrays;
import java.util.Scanner;
public class SumOfTwoArrays {
	
	public static int ArraySum(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum*10+arr[i];
		}
		return sum;
	}
	
	public static int[] SumOfTwoArray(int[] arr1,int[] arr2,int[] arr3) {
		int sum1=ArraySum(arr1);
		int sum2=ArraySum(arr2);
		int sum=sum1+sum2;
		int i =arr3.length-1;
		while(i>=0) {
			int mod=sum%10;
			arr3[i]=mod;
			sum=sum/10;
			i--;
		}
		return arr3;
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
		int [] arr2=TakeArrayInput();
		int newLength= arr.length>arr2.length ? arr.length+1 : arr2.length+1;
		int[] arr3 = new int[newLength];
		SumOfTwoArray(arr,arr2,arr3);
		printArray(arr3);
	}
}
