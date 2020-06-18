package important;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class SpecificSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int tc=scn.nextInt();
		while(tc-->0){
		    int n=scn.nextInt();
		    int[] arr=new int[n];
		    ArrayList<Integer> even=new ArrayList<>();
		    ArrayList<Integer> odd=new ArrayList<>();
		    for(int i=0;i<arr.length;i++){
		        arr[i]=scn.nextInt();
		        if(arr[i]%2==0)
		        even.add(arr[i]);
		        else
		        odd.add(arr[i]);
		    }
		    Collections.sort(even);
		    Collections.sort(odd);
int l=0;
for(int i=odd.size()-1;i>=0;i--)
{		arr[l]=odd.get(i);
		l++;}
		for(int i=0;i<even.size();i++){
		    arr[l]=even.get(i);
		    l++;
		}
	for(int val:arr){
	    System.out.print(val+" ");
	    System.out.println();
	    
	}
	Stack<Integer> s=new Stack<>();
	s.s
		}
	}

}
