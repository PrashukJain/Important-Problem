package important;

import java.util.Scanner;

public class MaxsumWIthNoadjacent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();
		}
		int incl=arr[0];
		int excl=0;
		for(int i=1;i<arr.length;i++) {
			int t=incl;
			incl=Math.max(incl, excl+arr[i]);
			excl=t;
		}
		System.out.println(Math.max(incl, excl));
				

	}

}
