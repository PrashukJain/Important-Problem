package important;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class OccurencesofWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
String s=scn.nextLine();
String[] arr=s.split(" ");
HashMap<String,Integer> h=new HashMap<>();
TreeSet<String> ts=new TreeSet<>();
for(int i=0;i<arr.length;i++) {
	if(h.containsKey(arr[i])) {
		h.put(arr[i], h.get(arr[i])+1);
	}
	else
		h.put(arr[i], 1);
}
for(String name:h.keySet()) {
//	System.out.print(name);
	ts.add(name+":"+h.get(name));
}
Iterator<String> i=ts.iterator();
while(i.hasNext()) {
	System.out.println(i.next());
}
	}

}
