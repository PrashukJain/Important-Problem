package important;

import java.util.*;

public class hourpattern{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
     int n=scn.nextInt();
     int row=1,nsp=0,nst=n;
     while(row<=n){
         int csp=1;
         while(csp<=nsp){
             System.out.print("\t");
             csp++;
         }
         int cst=1;
         while(cst<=nst){
             if(cst==1||cst==nst||row==1||row>n/2+1)
             System.out.print("*\t");
             else
             System.out.print("\t");
             cst++;
         }
         if(row<=n/2){
             nst-=2;
             nsp+=1;
         }
         else{
             nst+=2;
             nsp-=1;
         }
         row++;
         System.out.println();
         
         
         
     }

 }
}
