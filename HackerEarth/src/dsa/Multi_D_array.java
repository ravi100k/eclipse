package dsa;

import java.util.Scanner;

public class Multi_D_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int row;
		int coll;
		
		row = sc.nextInt();
		coll = sc.nextInt();
		int[][] Array = new int[row][coll];


		for (row= 0; row < Array.length; row++) {
			for(coll = 0; coll < Array[row].length; coll++) {
			    //System.out.println(i+j);
			    Array[row][coll] = sc.nextInt(); //Storing input value here    
			    System.out.println((Array[row][coll]));//Output the input value
			}
			System.out.println();
		}
		

	}

}
