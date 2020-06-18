package important;

import java.util.Scanner;

public class possiblepaths {
//static int c=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int tc=scn.nextInt();
//		while(tc-->0){
		    int n=scn.nextInt();
		    int m=scn.nextInt();
//		    int[][] arr=new int[n][m];
//		    System.out.println(nopaths(arr,0,0));
	System.out.println(paths(n,m));
	}
	public static int nopaths(int[][] arr,int row,int col){
		   int c=0;
		    if(row==arr.length-1&&col==arr[0].length-1){
		   	        return 1;
		    }
		    if(row>=arr.length||col>=arr[0].length)
		    return 0;
		   // arr[row][col]=1;
		  c+=nopaths(arr,row+1,col);
		 c+= nopaths(arr,row,col+1);
		  return c;  
		    
		}
	// Alternative method using dynamic programming
	public static int paths(int n,int m) {
		int[][] count=new int[n][m];
		for(int i=0;i<n;i++) {
			count[i][0]=1;
		}
		for(int i=0;i<m;i++) {
			count[0][i]=1;
		}
		for(int i=1;i<n;i++) {
			for(int j=1;j<m;j++) {
				count[i][j]=count[i-1][j]+count[i][j-1];
			}
		}
		return count[n-1][m-1];
	}
}
