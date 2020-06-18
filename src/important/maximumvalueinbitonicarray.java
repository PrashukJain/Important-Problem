package important;

import java.util.Scanner;

public class maximumvalueinbitonicarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
        int row=1,nst=2*n-1,nsp=2*n-3;
        while(row<=n){
            int cst=1;
            int val=0;
            while(cst<=nst){
                val++;
                System.out.print(val+"\t");
                cst++;
              }
            int csp=1;
            while(csp<=nsp){
                System.out.print("\t");
                csp++;
            }
            cst=1;
            if(row==n){
            cst=2;
                val--;
            }
            while(cst<=nst){
                System.out.print(val+"\t");
                val--;
                cst++;
            }
            nsp-=2;
            nst+=1;
            row++;
            System.out.println();
        }
	}

}
