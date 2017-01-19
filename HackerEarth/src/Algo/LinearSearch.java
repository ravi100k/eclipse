package Algo;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;*/
 
//import for Scanner and other utility classes
import java.util.*;
 
 
class TestClass {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
         * Use either of these methods for input
 
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);*/
 
       
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
		long M=s.nextLong();
		long arr[]=new long[N];
        for (int i = 0; i < N; i++) {
            arr[i]=s.nextLong();
        }
        boolean found=false;
      	int i=N-1;
        while(found!=true&&i!=0){
        	if(arr[i]==M){
        		found=true;
        	}
        	i--;
        }
        if(found==true){
        	 System.out.println(i+2);
        }
        else{
        	 System.out.println(-1);
        	}
    }
}