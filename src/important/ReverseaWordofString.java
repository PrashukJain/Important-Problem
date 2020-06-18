package important;

import java.util.Scanner;

public class ReverseaWordofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
String s=scn.next();

	String ar[]=s.split("\\.");
for(int i=ar.length-1;i>=0;i--)
	System.out.print(ar[i]+".");
	}

}
