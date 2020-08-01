package revprac;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Equillibrium_point {
public static void main (String[] args) {
	//code
	Scanner scn=new Scanner(System.in);
	int tc=scn.nextInt();
	while(tc-->0){
	    int n=scn.nextInt();
	    int[] arr=new int[n];
	    int sum=0,lsum=0;
	    for(int i=0;i<arr.length;i++){
	    arr[i]=scn.nextInt();
	    sum+=arr[i];}
	    
	   
	    boolean f=true;
	   for(int i=arr.length-1;i>=0;i--){
	       sum-=arr[i];
	       if(lsum==sum){
	           System.out.println(i+1);
	           f=false;
	           break;
	       }
	       lsum+=arr[i];
	   }

	       if(f)
	       System.out.println(-1);
	}
}
}