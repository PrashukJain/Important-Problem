package important;

import java.util.Scanner;
import java.util.Stack;

public class DecodeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
String s=scn.next();
Stack<Integer> in=new Stack<>();
Stack<String> ch=new Stack<>();
for(int i=0;i<s.length();i++) {
	char c=s.charAt(i);
	if(Character.isDigit(c)) {
		in.push(Integer.parseInt(String.valueOf(c)));
	}
	else if(c=='['||Character.isLetter(c)) {
		ch.push(String.valueOf(c));
	}
	else if(c==']') {
		StringBuilder sb=new StringBuilder(); 
		int t=in.pop();
		while(!ch.peek().equals("[")) {
			sb.append(ch.pop());
//			System.out.prinln(sb);
		}
		sb.reverse();
		StringBuilder st=new StringBuilder();
		st=sb;
		for(int j=1;j<t;j++) {
			sb.append(st);
		}
		ch.push(sb.toString());
	}
	
}
System.out.print(ch.pop());
	}

}
