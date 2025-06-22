package JavaArrays;

import java.util.Scanner;

public class ArrangeElementsInArray {
	public static void ArrangeArray(int n) {
		int limit = n%2==0 ? n/2 : (n/2) + 1;
		int[] array = new int[n];
		int odd=0;
		int even=n-1;
		int num = 1;
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				array[odd]=num;
				odd++;
			}else {
				array[even]=num;
				even--;
			}
			num++;
		}
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
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
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i =0;i<n;i++) {
			int num = s.nextInt();
			ArrangeArray(num);
		}
		
	}
}
