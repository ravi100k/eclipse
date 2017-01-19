import java.util.Scanner;

public class Diagonalsum {
	public static void main(String[] args) { 
		Scanner in = new Scanner(System.in); 
		int n = in.nextInt(); 
		int a[][] = new int[n][n];
		int primDiagonal = 0;
		int secDiagonal = 0;
		for(int a_i=0; a_i < n; a_i++){
			for(int a_j=0; a_j < n; a_j++){
				a[a_i][a_j] = in.nextInt();
				if(a_i == a_j){
					primDiagonal += a[a_i][a_j];
				}
				if((a_i + a_j) == n-1){
					secDiagonal += a[a_i][a_j];
				}
			}
		}
		System.out.println(Math.abs(primDiagonal - secDiagonal));
		in.close();
	}

}
