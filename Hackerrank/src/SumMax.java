import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SumMax {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1 digit:");
        long a = in.nextLong();
        System.out.println("Enter 2 digit:");
        long b = in.nextLong();
        System.out.println("Enter 3 digit:");
        long c = in.nextLong();
        System.out.println("Enter 4 digit:");
        long d = in.nextLong();
        System.out.println("Enter 5 digit:");
        long e = in.nextLong();
        
        
        long[] array = {a,b,c,d,e};
        Arrays.sort(array);
        long min = 0; 
        long max = 0;
        for(int i = 0; i<4;i++)
        {
        min+=array[i];

        max+= array[i+1];
        }
        System.out.print(min + " " + max);
        /*
        //exclude b
        if((a>b && c>b && d>b && e>b)||(a<b && c<b && d<b && e<b)){
        	sum=a+c+d+e;
            System.out.println(sum);
        }
        //exclude a
        else if((b>a && c>a && d>a && e>a)|| (b<a && c<a && d<a && e<a)){
        	sum=b+c+d+e;
        	System.out.println(sum);
        }
        //exclude c
        else if((a>c && b>c && d>c && e>c)||((a<c && b<c && d<c && e<c))){
        	sum= a+b+d+e;
        	System.out.println(sum);
        }
        //exclude d
        else if((a>d && b>d && c>d && e>d)||(a<d && b<d && c<d && e<d)){
        	sum=a+b+c+e;
        	System.out.println(sum);
        }
        //exclude e
        else if((a>e && b>e && c>e && d>e)||(a<e && b<e && c<e && d<e)){
        	sum=a+b+c+e;
        	System.out.println(sum);
        }*/
        		
        		
    }
    
}
