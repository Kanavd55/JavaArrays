//Problem statement
//Given an integer array A of size n. Find and print all the leaders present in the input array. An array element A[i] is called Leader, if all the elements following it (i.e. present at its right) are less than or equal to A[i].
//
//Print all the leader elements separated by space and in the same order they are present in the input array.
//
//Detailed explanation ( Input/output format, Notes, Images )
//Constraints :
//1 <= n <= 10^6
//
//Sample Input 1 :
//6
//3 12 34 2 0 -1
//Sample Output 1 :
//34 2 0 -1
//Sample Input 2 :
//5
//13 17 5 4 6
//Sample Output 2 :
//17 6

package JavaArrays;
import java.util.Scanner;
public class LeadersInArray {

	public static void leaders(int[] input) {
		for(int i=0;i<input.length;i++) {
			boolean isLeader = true;
			for(int j=i+1;j<input.length;j++){
				if(input[j]>input[i]) {
					isLeader=false;
					break;
				}
			}
			if(isLeader) {
				System.out.print(input[i]+" ");
			}
		}
	}
	public static int[] TakeArrayInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] arr= TakeArrayInput();
		leaders(arr);
	}
}
