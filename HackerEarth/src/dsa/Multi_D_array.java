package dsa;

import java.util.Scanner;

public class Multi_D_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int row = 0,coll = 0;
		row=sc.nextInt();
		coll=sc.nextInt();
		int[][] Array = new int[row][coll];
		
		for(int i=0;i<row;i++){
			for(int j=0;j<coll;j++){
				System.out.println(i+" "+j);
			}
		}		

	}

}
