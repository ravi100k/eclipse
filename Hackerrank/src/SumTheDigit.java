import java.util.Scanner;

public class SumTheDigit
{
    public static void main(String args[])
    {
        int num, rem=0, sum=0, temp;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter a Number : ");
        num = scan.nextInt();
		
        temp = num;
		
        while(num>0)
        {
            rem = num%10;
            sum = sum+rem;
            num = num/10;
        }
		
        System.out.print("Sum of Digits of " +temp+ " is " +sum);        
    }
}