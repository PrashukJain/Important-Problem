package important;

import java.util.Scanner;

public class incdecinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int tc=scn.nextInt();
		while(tc-->0) {
			String s=scn.next();
			seq(s);
		}

	}
	public static void seq(String s) {
		int[] arr=new int[s.length()+1];
		int c=1;
		for(int i=0;i<=s.length();i++) {
			if(i==s.length()||s.charAt(i)=='I') {
				arr[i]=c;
				c+=1;
				for(int j=i-1;j>=0&&s.charAt(j)!='I';j--)
					arr[j]=c++;
			}
		
		}
		for(int val:arr)
			System.out.print(val);
	}

}
