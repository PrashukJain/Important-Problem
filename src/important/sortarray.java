package important;

import java.util.Arrays;
import java.util.Scanner;

public class sortarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++)
			arr[i]=scn.nextInt();
		Arrays.sort(arr);
		for(int val: arr)
			System.out.println(val+" ");

	}

}
