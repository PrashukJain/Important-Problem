package important;

import java.util.Scanner;

public class Nqueen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		boolean[][] board=new boolean[n][n];
		placeofqueen(board,0,0,n,0,"");
}
	public static void placeofqueen(boolean[][] board,int row,int col,int tq,int cq,String ans) {
		if(cq>tq) {
			System.out.print(ans);
			return;
		}
		if(row==board.length||col==board.length) {
			return;
		}
		if(isitsafetoplace(board,row,col)) {
			board[row][col]=true;
			placeofqueen(board,row+1,col,tq,cq+1,ans+'{'+row+'-'+col+'}');
		}
		
	}
	public static boolean isitsafetoplace(boolean[][] board,int row,int col) {
		if(row<0||col<0) {
			return false;
		}
		while(r>0)
	}

}
