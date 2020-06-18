package important;

import java.util.Scanner;
import java.util.Stack;

public class validparanthesislength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String s=scn.next();
		/************
		 * Wrong Approach
		 */
//		Stack<Character> st=new Stack<>();
//		int len=0;
//		int c=0;
//		for(int i=0;i<s.length();i++) {
//			char ch=s.charAt(i);
//			if(st.empty()&&ch==')')
//				c=0;
//			if(ch=='(')
//				st.push(ch);
//			else if(!st.isEmpty()&&st.peek()=='(') {
//				st.pop();
//				c+=2;
//				if(len<c)
//					len=c;
//			}
//		}
//		System.out.println(len);

		/*****************************
		  Correct  Approach
		 
		 ****************************/
		int len=0;
		Stack<Integer> sti=new Stack<>();
		sti.push(-1);
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			
			if(ch=='(')
				sti.push(i);
			else if(ch==')') {
				sti.pop();
				if(sti.isEmpty())
					sti.push(i);
				else
					len=Math.max(len, i-sti.peek());
			}
		
	}
		System.out.println(len);
		String str="abd";
		if(str.no)
	}
	

}
