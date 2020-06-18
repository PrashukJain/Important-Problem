package important;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class printdiagonallyarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[][] arr=new int[n][n];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++)
				arr[i][j]=scn.nextInt();
		}
		
	printdiag(arr);
	System.out.println();
	

	}
public static void printdiag(int[][] arr) {
	for(int i=0;i<arr.length;i++) {
		int c=i;
		int r=0;
		System.out.print(arr[r][c]+" ");
		while(r+1<arr.length&&c-1>=0) {
			System.out.print(arr[r+1][c-1]+" ");
			r+=1;
			c-=1;
		}
		if(i+1==arr.length) {
			for(int j=1;j<arr.length;j++) {
				r=j;
				c=i;
				System.out.print(arr[r][c]+" ");
				while(r+1<arr.length&&c-1>=0) {
					System.out.print(arr[r+1][c-1]+" ");
					r+=1;
					c-=1;
				}
			}
		}
	}
}
}
