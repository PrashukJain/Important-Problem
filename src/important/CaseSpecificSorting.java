package important;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CaseSpecificSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String s="defRTSersUXI";
		ArrayList<Character> lower=new ArrayList<>();
		ArrayList<Character> upper=new ArrayList<>();
		for(int i=0;i<s.length();i++){
		    if(s.charAt(i)>='a'&&s.charAt(i)<='z')
		    lower.add(s.charAt(i));
		    else
		    upper.add(s.charAt(i));
		}
		Collections.sort(lower);
		Collections.sort(upper);
		String st="";
		int l=0,r=0;
		for(int i=0;i<s.length();i++){
		    if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
		    st+=lower.get(l);
		        l++;
		    }
		    else{
		        st+=upper.get(r);
		        r++;
		    }
		    
		}
		System.out.println(st);
		
	}

}
