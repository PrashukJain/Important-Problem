package important;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class ScondMostReaeatedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int tc=scn.nextInt();
		while(tc-->0){
		    int n=scn.nextInt();
		    String[] arr=new String[n];
		    HashMap<String,Integer> h=new HashMap<>();
		    for(int i=0;i<arr.length;i++){
		        arr[i]=scn.next();
		        if(h.containsKey(arr[i])){
		            h.put(arr[i],h.get(arr[i])+1);
		        }
		        else
		        h.put(arr[i],1);
		    }
		    ArrayList<Integer> a=new ArrayList<>();
		    for(int val:h.values()){
		        a.add(val);
		    }
		    Collections.sort(a);
		    int t=a.get(a.size()-2);
		    for(String val:h.keySet()){
		        if(h.get(val)==t){
		            System.out.println(val);
		            break;
		        }
		    }
		}

	}

}
