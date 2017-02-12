package begineer;

import java.util.Scanner;

 class Factorial{
	/*public static int power(int N){
		int sum=0,n=1;
		while(N/(Math.pow(5,n))!=0){
			sum+=(N/Math.pow(5,n));
			n+=1;
		}
		return sum;
	}
	public static void main(String []args){
		int T=0,N=0;
		Scanner sc=new Scanner(System.in);
		T=sc.nextInt();
	        if(T>=1 && T<100000){
	            while(T!=0){
			N=sc.nextInt();
			if(N>=1 && N<=1000000000){
				System.out.println(power(N));
			}
			T-=1;
		    }
		}
	        sc.close();
	}*/
	// your code goes here
	 public static void main(String args[]){
			long n,k,index=0;
	 
			Scanner sc = new Scanner(System.in);
			
			n = k = sc.nextLong();
	 
			long [] an = new long[(int)n];
			
			while(k>0)
			{
			    long num = sc.nextLong();
			    int ans=0,i=1;
		        while(Math.pow(5,i)<=num)
		        {
		            ans+=(num/Math.pow(5,i));
		            i++;
		        }
		        
		        an[(int)index++]=ans;
		        k--;
			}
			
			for(int i=0;i<n;i++){
				System.out.println(an[i]);
			}
		} 
}