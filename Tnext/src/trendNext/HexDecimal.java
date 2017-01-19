package trendNext;
import java.util.Scanner;
public class HexDecimal {
	  public static void main(String args[])
	    {
	      Scanner input = new Scanner( System.in );
	      System.out.print("Enter a decimal number : ");
	      int num =input.nextInt();
	        
	      // calling method toHexString()
	      String str = Integer.toHexString(num);
	      System.out.println("Method 1: Decimal to hexadecimal: "+str);
	      input.close();
	    }
	}

