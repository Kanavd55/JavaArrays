//You have been given two integer arrays/list(ARR1 and ARR2) of size N and M, respectively. You need to print their intersection; An intersection for this problem can be defined when both the arrays/lists contain a particular value or to put it in other words, when there is a common value that exists in both the arrays/lists.
//
//Note :
//Input arrays/lists can contain duplicate elements.
//
//The intersection elements printed would be in the order they appear in the first array/list(ARR1)

package JavaArrays;
import java.util.Scanner;
public class IntersectionofTwoArrays {
	
	public static void ArrayIntersection(int[] arr,int[] arr2) {
		for(int i=0;i<arr.length;i++) {
			for(int j =0;j<arr2.length;j++) {
				if(arr[i]==arr2[j]) {
					System.out.println(arr2[j]+" ");
					arr2[j] = -1;
					break;
				}
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
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i =0;i<n;i++) {
			int[] arr = TakeArrayInput();
			int[] arr2 = TakeArrayInput();
			ArrayIntersection(arr,arr2);
		}
		
	}
}
