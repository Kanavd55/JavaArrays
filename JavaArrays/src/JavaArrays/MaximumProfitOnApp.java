package JavaArrays;
import java.util.Scanner;
public class MaximumProfitOnApp {
	public static void InsertionSort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int element=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>element) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=element;
		}
	}
	
	public static int[] TakeArrayInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] array = new int[n];
		for(int i =0; i<n;i++) {
			array[i]=s.nextInt();
		}
		return array;
	}
	
	public static int maximumProfit(int budget[]) {
		// Write your code here
		if(budget.length==1) {
			return budget[0];
		}
		InsertionSort(budget);
		int maximumProfit=Integer.MIN_VALUE;
		for(int i=0;i<budget.length;i++) {
			int profit = (budget.length-i)*budget[i];
			if(profit > maximumProfit) {
				maximumProfit = profit;
			}
		}
		return maximumProfit;
	}
	
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		int[] arr = TakeArrayInput();
		System.out.println(maximumProfit(arr));
	}
}
