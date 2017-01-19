import java.util.Scanner;

public class Sumall {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner sc=new Scanner(System.in);
      
      int sum=0;
     System.out.println("enter how many number you wantto sum: ");
      int size = sc.nextInt();
     
      System.out.println("enter the numbers: ");
      for(int x =0;x<size;x++){
          sum+=sc.nextInt();
      }
      System.out.println("The sum is: "+sum);
      sc.close();
	}
}
