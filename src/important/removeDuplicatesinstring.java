package important;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class removeDuplicatesinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
int tc=scn.nextInt();
while(tc-->0) {
	String s=scn.next();
	String sr="";
	
	LinkedHashSet<Character> h=new LinkedHashSet<>();
	for(int i=0;i<s.length();i++) {
		h.add(s.charAt(i));
	}
	for(char c:h) {
		sr+=c;
	}
	
	System.out.println(sr);
}
	}

}
