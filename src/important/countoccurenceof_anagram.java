package important;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class countoccurenceof_anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
//int tc=scn.nextInt();
//while(tc-->0){
    String s=scn.next();
    String p=scn.next();
//    int c=0;
//    HashSet<String> h=Permutations(p);
//    for(int i=0;i<=s.length()-p.length();i++){
//        String a=s.substring(i,i+p.length());
//        if(h.contains(a))
//        c++;
//    }
    System.out.println(anagram(s,p));
//}
}
public static HashSet<String> Permutations(String p){
if(p.length()==0){
    HashSet<String> ar=new HashSet<>();
    ar.add("");
    return ar;
}
char ch=p.charAt(0);
String roq=p.substring(1);
HashSet<String> rr=Permutations(roq);
HashSet<String> mr=new HashSet<>();
Iterator<String> itr=rr.iterator();
while(itr.hasNext()){
    String a=itr.next();
    for(int i=0;i<=a.length();i++){
        String ans=a.substring(0,i)+ch+a.substring(i);
        mr.add(ans);
    }
}
return mr;
		
	}
//Alternate Method
public static int anagram(String t,String p) {
	int[] text=new int[256];
	int[] patt=new int[256];
	for(int i=0;i<p.length();i++) {
		text[t.charAt(i)]++;
		patt[p.charAt(i)]++;
	}
	int c=0;
	for(int i=p.length();i<t.length();i++) {
		if(compare(text,patt))
			c++;
		text[t.charAt(i)]++;
		text[t.charAt(i-p.length())]--;
		
	}
	if(compare(text,patt))
		c++;
	return c;
}
public static boolean compare(int[] text,int[] patt) {
	for(int i=0;i<text.length;i++) {
		if(text[i]!=patt[i])
			return false;
	}
	return true;
}

}
