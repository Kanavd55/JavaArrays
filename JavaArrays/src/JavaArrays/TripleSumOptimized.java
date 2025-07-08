//Problem statement
//You have been given a random integer array/list(ARR) and a number X. Find and return the triplet(s) in the array/list which sum to X.
//
//Note :
//Given array/list can contain duplicate elements.
//Detailed explanation ( Input/output format, Notes, Images )
//Constraints :
//1 <= t <= 10^2
//0 <= N <= 10^3
//0 <= X <= 10^9
//
//Time Limit: 1 sec
//Sample Input 1:
//1
//7
//1 2 3 4 5 6 7 
//12
//Sample Output 1:
//5
//Sample Input 2:
//2
//7
//1 2 3 4 5 6 7 
//19
//9
//2 -5 8 -6 0 5 10 11 -3
//10
//Sample Output 2:
//0
//5
//
//
// Explanation for Input 2:
//Since there doesn't exist any triplet with sum equal to 19 for the first query, we print 0.
//For the second query, we have 5 triplets in total that sum up to 10. They are, (2, 8, 0), (2, 11, -3), (-5, 5, 10), (8, 5, -3) and (-6, 5, 11)



package JavaArrays;

import java.util.Scanner;

public class TripleSumOptimized {
	
	public static void InsertionSort(int[] arr) {
		if(arr.length==1) {
			return;
		}
		for(int i=1;i<arr.length;i++) {
			int element=arr[i];
			int j = i-1;
			while(j>=0 && element<arr[j]) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=element;
		}
		return;
	}
	
	public static int calculateCount(int[] arr,int si,int element) {
		int count =0;
		for(int i=si;i<arr.length;i++) {
			if(arr[i]!=element) {
				break;
			}
			count++;
		}
		return count;
	}
	
	public static int calculateRightCount(int[] arr,int si,int element) {
		int count =0;
		for(int i=si;i>=0;i--) {
			if(arr[i]!=element) {
				break;
			}
			count++;
		}
		return count;
	}
	
	public static int tripletSum(int[] arr, int n) {
		InsertionSort(arr);
		int count =0;
		for(int i =0;i<arr.length;i++) {
			int num=n-arr[i];
			if(i+1<arr.length && i+1!=arr.length) {
				int smallCount=pairSum(arr,num,i+1,arr.length-1);
				count=count+smallCount;
			}
			
		}
		return count;
	}
	
	public static int pairSum(int[] arr, int num,int si,int ei) {
		//Your code goes here
		int sumPair = 0;
		int i=si;
		int j =ei;
		while(i<j) {
			if((arr[i]+arr[j])>num) {
				j--;
			}else if((arr[i]+arr[j])<num) {
				i++;
			}else {
				if(arr[i]==arr[j]) {
					int n = calculateCount(arr,i,arr[i]);
					int count = (n*(n-1))/2;
					sumPair=sumPair+count;
					break;
				}else {
					int leftCount=calculateCount(arr,i,arr[i]);
					int rightCount=calculateRightCount(arr,j,arr[j]);
					sumPair=sumPair+(leftCount*rightCount);
					i=i+leftCount;
					j=j-rightCount;
				}
			}
		}
		return sumPair;
		
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
		Scanner s = new Scanner(System.in);
		int[] arr = TakeArrayInput();
		int n = s.nextInt();
	}
}
