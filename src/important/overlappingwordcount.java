package important;

import java.util.Scanner;

public class overlappingwordcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String s=scn.next();
		String pt=scn.next();
		int c=0;
		for(int i=0;i<s.length()-pt.length();i++) {
			String st=s.substring(i,i+pt.length());
			if(st.equals(pt))
				c++;
		}
		System.out.println(c);
	}

}
