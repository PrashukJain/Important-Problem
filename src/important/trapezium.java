package important;

import java.util.Scanner;

public class trapezium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int row=1;
int nst=2*n,nsp=0;
int val1=1,val2=n*n+1;
while(row<=n) {
	int csp=1;
	while(csp<=nsp) {
		System.out.print(" ");
		csp++;
	}
	int cst=1;
	int a=val2;
	while(cst<=nst) {
		if(cst<=nst/2) {
			System.out.print(val1+"*");
			val1++;
		}
		else if(cst==nst) {
			System.out.print(a);
		}
		else {
			System.out.print(a+"*");
			a++;
		}
		cst++;
	}
	val2=val2-n+row;
	row++;
	nst-=2;
	nsp+=2;
	System.out.println();
	
}
	}

}
