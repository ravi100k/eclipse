package LinkedIn;

import java.util.Scanner;

	public class conscutive1inBinary {

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int max=0,count=0;
	        while(n>0){
	            if(n%2==1){
	                count++;
	            }else{
	                max=Math.max(count,max);
	                count=0;
	            }
	            n=n>>1; // same as n=n/2
	        }
	        System.out.println(Math.max(count,max));
	        in.close();
	    }
	}