package important;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class minimumcost_ofropes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int tc=scn.nextInt();
		while(tc-->0){
		    int n=scn.nextInt();
		    int[] arr=new int[n];
		    for(int i=0;i<arr.length;i++)
		    	arr[i]=scn.nextInt();
		    mincost(arr,0);
	}}
		public static void mincost(int[] arr,int ans){
		    if(arr.length==1){
		        System.out.println(ans);
		        return;
		    }
		    Arrays.sort(arr);
		    int[] ar=new int[arr.length-1];
		    ar[0]=arr[0]+arr[1];
		    ans+=ar[0];
		    for(int i=2;i<arr.length;i++){
		        ar[i-1]=arr[i];
		    }
		    PriorityQueue<Integer> p=new PriorityQueue<>();
		    p.poll();
		    mincost(ar,ans);
		    return;
		}

}
