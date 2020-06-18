package important;

import java.util.Scanner;
import java.util.Stack;

public class count101pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
//		int tc=scn.nextInt();
//		while(tc-->0){
		  //  int n=scn.nextInt();
		    String s=scn.next();
		    Stack<Character> st=new Stack<>();
int c=0;
		    for(int i=0;i<s.length();i++){
		        if(s.charAt(i)=='1'&&st.isEmpty()){
		            st.push(s.charAt(i));   
		        }
		        else if(s.charAt(i)=='1'&&st.size()>=2){
		            c++;
		            while(!st.isEmpty())
		            st.pop();
		            st.push(s.charAt(i));
		        }
		        else if(s.charAt(i)=='0'&&st.size()>=1){
		            st.push(s.charAt(i));
		        }
		        
		        else{
		            while(!st.isEmpty())
		            st.pop();
		            if(s.charAt(i)=='1')
		            	st.push(s.charAt(i));
		        }
		    }
		    System.out.println(c);
//		}
	}

}
