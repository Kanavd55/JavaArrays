////Problem statement
//You have been given a random integer array/list(ARR) of size N. You have been required to push all the zeros that are present in the array/list to the end of it. Also, make sure to maintain the relative order of the non-zero elements.
//
//Note:
//Change in the input array/list itself. You don't need to return or print the elements.
//
//You need to do this in one scan of array only. Don't use extra space.
//
//
//Detailed explanation ( Input/output format, Notes, Images )
//Constraints :
//1 <= t <= 10^2
//0 <= N <= 10^5
//Time Limit: 1 sec
//Sample Input 1:
//1
//7
//2 0 0 1 3 0 0
//Sample Output 1:
//2 1 3 0 0 0 0
// Explanation for the Sample Input 1 :
//All the zeros have been pushed towards the end of the array/list. Another important fact is that the order of the non-zero elements have been maintained as they appear in the input array/list.
//Sample Input 2:
//2
//5
//0 3 0 2 0
//5
//9 0 0 8 2
//Sample Output 2:
//3 2 0 0 0
//9 8 2 0 0 




package JavaArrays;
import java.util.Scanner;
public class PushZerosToEnd {
// Brute force solution with O(n2) time complexity
//	public static void PushZerosToEnd(int[] arr) {
//		for(int i=0;i<arr.length;i++) {
//			for(int j =i+1;j<arr.length;j++) {
//				if(arr[i]!=0) {
//					break;
//				}else if(arr[j]!=0) {
//					int element = arr[j];
//					arr[j]=arr[i];
//					arr[i]=element;
//					break;
//				}
//			}
//		}
//	}
	
	public static void PushZerosToEnd(int[] arr) {
		int i=0;
		int j =0;
		while(i<arr.length && j<arr.length) {
			if(arr[i]!=0 && i==j) {
				i++;
				j++;
			}else if(arr[i]!=0) {
				i++;
			}else if(arr[i]==0 && arr[j]==0) {
				j++;
			}else if(arr[i]==0 && arr[j]!=0) {
				int element=arr[j];
				arr[j]=arr[i];
				arr[i]=element;
				i++;
				j++;
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
		int[] arr=TakeArrayInput();
		PushZerosToEnd(arr);
		printArray(arr);
	}
}
