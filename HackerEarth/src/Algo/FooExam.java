package Algo;

import java.util.Scanner;

/*Foo was not amongst the most brilliant students of his class. So, he has some pending exams to clear. As the exams are approaching, this time he vowed to pass in all of them. This will only happen if he is not under stress. Foo's stress can be calculated using a simple function called Foo_function which depends upon the time for which Foo studies continuously .

Foo_funtion is defined as follows:

F(t)=A(t^3)+B(t^2)+C*(t)+D, F(t)<=10^18

where A,B,C,D belong to the set of prime numbers. t is the time in minutes for which foo studies continuously.

As foo is not very good at solving cubic equations, he seeks your help to find out the maximum number of minutes for which he can study continuously without taking stress. Help him find t such that F(t+1) > K, and F(t) <= K, where K is the maximum stress Foo can bear.

Input:

The first line of the input contains a single integer T denoting the number of test cases. each test case consists of a single line containing 5 space seperated positive numbers a, b, c, d, K.

Output:

for each test case, output a single integer t denoting the maximum time for which foo can study continuously without taking stress.

Constraints:

1 <= T <= 10^4 
A, B, C, D belong to a set of prime numbers such that F(t) would never exceed 10^18
t >= 0 
1 <= K <= 10^18*/
public class FooExam {

	public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        
        while(T--!=0){
        	long A = s.nextLong();
        	long B = s.nextLong();
        	long C = s.nextLong();
        	long D = s.nextLong();
        	long K = s.nextLong();
        	Foo_funtion(A,B,C,D,K);
        }
        s.close();
    }
    
    static void Foo_funtion(long A,long B,long C,long D,long K){
    	long res=0,temp=0;
    	int t;
    	for(t=1;;t++){
    		temp=(A*t*t*t) + B*t*t + C*t + D;
    		if(temp > K){
    			res=t-1;
    			break;
    		}
    	}
    	System.out.println(res+"....KUCHH ATA BHI BSDK....");
    
    }
    
  }