package test;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility  classes*/
import java.util.*;


import java.util.stream.LongStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class AddBig{

    public static void main(String args[]) throws Exception {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          String line = br.readLine();
          int N = Integer.parseInt(line);
          int sum = 0;
          ArrayList<Integer> inputs = new ArrayList<Integer>();
          for (int i = 0; i < N; i++) {
             inputs.add(Integer.valueOf(br.readLine()));
              sum = i+N;
          }
          
          
          System.out.println(sum);
          
     }

}