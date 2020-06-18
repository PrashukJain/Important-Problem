package important;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int[] arr=new int[n];
for(int i=0;i<arr.length;i++)
	arr[i]=scn.nextInt();
Arrays.sort(arr);
//for(int val:arr)
//	System.out.print(val+" ");
//	}
int prev=1,c=1;
HashSet<Integer> h=new HashSet<>();
h.add(arr[0]);
for(int i=1;i<arr.length;i++){
	if(h.contains(arr[i]))
		continue;
    if(h.contains(arr[i]-1)){
    c+=1;
    h.add(arr[i]);}
    else{
        if(prev<c){
            prev=c;
            c=1;
            h.add(arr[i]);
        }
        else {
        	c=1;
        	h.add(arr[i]);}
    }
    
}
if(prev<c)
	prev=c;
System.out.println(prev);}
}
