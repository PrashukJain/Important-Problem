package important;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class RemovecommonCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String s1=scn.next();
	    String s2=scn.next();
	    HashSet<Character> h1=new HashSet<>();
	    HashSet<Character> h2=new HashSet<>();
//	    HashSet<Character> res=new HashSet<>();
	    String ans="";
	    for(int i=0;i<s1.length();i++){
	        h1.add(s1.charAt(i));
	    }
	    for(int i=0;i<s2.length();i++){
	        h2.add(s2.charAt(i));
	    }
	    for(int i=0;i<s1.length();i++){
	        if(!h2.contains(s1.charAt(i)))
	        ans+=s1.charAt(i);
	        }
	        for(int i=0;i<s2.length();i++){
	            if(!h1.contains(s2.charAt(i)))
	           ans+=s2.charAt(i);
	        }
//	    Iterator<Character> i=res.iterator();
//	    while(i.hasNext()){
//	        ans+=i.next();
//	    }
	    if(ans.equals(""))
	    System.out.println(-1);
	    
	    System.out.println(ans);

	}

}
