package important;

import java.util.Scanner;

public class FindtheFine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
	    int no=scn.nextInt();
	    boolean f=true;
	    if(no%2==0){
	       f=false;}
	       int[] car=new int[n];
	       int[] fine=new int[n];
	       for(int i=0;i<n;i++)
	       car[i]=scn.nextInt();
	       int sum=0;
	       for(int i=0;i<n;i++){
	           fine[i]=scn.nextInt();
	           if(f&&car[i]%2==0){
	               sum+=fine[i];
	           }
	           else if(!f&&car[i]%2!=0){
	           sum+=fine[i];}
	       }
	       System.out.println(sum);
	}

}
