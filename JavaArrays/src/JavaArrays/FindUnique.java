package JavaArrays;
import java.util.Scanner;

public class FindUnique {
	
	public static int GetUnique(int[] arr) {
		int unique = -1;
		for(int i=0;i<arr.length;i++) {
			boolean isUnique=true;
			for(int j =0;j<arr.length;j++) {
				if(arr[i]==arr[j] && i!=j) {
					isUnique=false;
					break;
				}
			}
			if(isUnique) {
				return arr[i];
			}
		}
		return -1;
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
		System.out.println(GetUnique(arr));
	}
}
