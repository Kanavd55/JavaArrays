package JavaArrays;

import java.util.Scanner;

public class FindDuplicate {
	
	public static int GetDuplicate(int[] arr) {
		int Duplicate = -1;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++){
				if(i!=j && arr[i]==arr[j]){
					return arr[i];
				}
			}
		}
		return Duplicate;
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
		int[] arr=TakeArrayInput();
		System.out.println(GetDuplicate(arr));
	}

}
