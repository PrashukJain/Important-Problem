package important;

import java.util.Scanner;

public class spiralprinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int m=scn.nextInt();
		int[][] arr=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++)
				arr[i][j]=scn.nextInt();
		}
int sr=0,er=arr.length-1,sc=0,ec=arr[0].length-1,row=0,col=0;
int count=0,nel=arr.length*arr[0].length;
while(sr<=er&&sc<=ec) {
 col=sc;
while(col<=ec&&count<nel) {
	System.out.print(arr[sr][col]+" ");
	col++;
	count++;
}
sr+=1;
row=sr;
while(row<=er&&count<nel) {
	System.out.print(arr[row][ec]+" ");
	row++;
	count++;
}
ec-=1;

col=ec;
while(col>=sc&&count<nel) {
	System.out.print(arr[er][col]+" ");
	col--;
	count++;
}
er-=1;
row=er;
while(row>=sr&&count<nel) {
	System.out.print(arr[row][sc]+" ");
	row--;
	count++;
}
sc+=1;
//while()

	}
//while(sr<=er) {
//	System.out.print(arr[sr][sc]+" ");
//	sr++;
//}
//while(sc<ec) {
//	System.out.print(arr[sr][sc]+" ");
//	sc++;
//}
	}
}
