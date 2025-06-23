package JavaArrays;
import java.util.Scanner;
public class PairSum {
	
	public static int FindPairSum(int sum,int[] arr) {
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j =i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==sum) {
					count++;
				}
			}
		}
		return count;
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
		int n = s.nextInt();
		for(int i =0;i<n;i++) {
			int[] arr = TakeArrayInput();
			int Sum = s.nextInt();
			int count = FindPairSum(Sum,arr);
			System.out.println(count);
		}
	}
}
