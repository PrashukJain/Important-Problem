package important;

import java.util.Scanner;

public class lookandsaySequenc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		String str="1";
//		String s="";
		if(n==1)
			str="1";
		
for(int i=2;i<=n;i++) {
	int count=1;
	str+="#";
	String s="";
	for(int j=1;j<str.length();j++) {
		if(str.charAt(j-1)!=str.charAt(j)) {
			s+=count;
			s+=str.charAt(j-1);
		}
		else
			count++;
			
	}
	str=s;
}
System.out.println(str);
	}

}
