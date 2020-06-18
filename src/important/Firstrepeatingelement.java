package important;

import java.util.HashMap;
import java.util.Scanner;

public class Firstrepeatingelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int[] arr=new int[n];
for(int i=0;i<arr.length;i++)
	arr[i]=scn.nextInt();
System.out.println(find(arr));
	}
	public static int find(int[] arr){
	    int f=-2;
	    HashMap<Integer,Integer> h=new HashMap<>();
			    for(int i=0;i<arr.length;i++){
			        if(h.containsKey(arr[i]))
			        {
		int a=h.get(arr[i]);
			            h.put(arr[i],a+1);
			        }
			        else {
			        h.put(arr[i],1);}
			        }
			    for(int i=0;i<arr.length;i++){
			        if(h.get(arr[i])>=2){
			            f=i;
			            break;
			        }
			        
			    }
			    f=f+1;
	return f;
	    
	}
}
