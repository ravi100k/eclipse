/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
//import for Scanner and other utility classes
import java.util.*;
import java.io.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
   
        Scanner s = new Scanner(System.in);
        int n=s.nextInt(); 
		String a=s.next();
		//String n=a.substring(0, 0);
		if(a.charAt(0)==a.lastIndexOf(a))
		{
			System.out.println(0);
		}
		s.close();
	
    }
}
