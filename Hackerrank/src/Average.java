import java.util.Scanner;

public class Average
{
    public static void main(String args[])
    {
        int mark[] = new int[5];
        int i;
        float sum=0;
        float avg, perc;
        Scanner scan = new Scanner(System.in);
        int noOfSubject;
		System.out.println("Enter No Of Subject");
		noOfSubject= scan.nextInt();
        System.out.print("Enter marks Obtained in Subjects : ");
        for(i=0; i<noOfSubject; i++)
        {
            mark[i] = scan.nextInt();
            sum = sum + mark[i];
        }
		
        avg = sum/5;
        perc = (sum/500) * 100;
		
        System.out.print("Average Marks = " +avg);
		
        System.out.print("\nPercentage = " +perc+ "%");
    }
}