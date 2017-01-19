import java.util.Scanner;
class Calculator {

    
    static int power(int n,int p) throws Exception{
    
        if (n<0||p<0){
            throw new Exception("n and p should be non-negative");
        }
        
        
    
        if (p==0){
            return 1;
        }
  
        if (n==0){
            return 0;
        }
        
    
        return power(n, p-1)*n;
    }
}
class Solution{

    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int T=in.nextInt();
        while(T-->0)
        {
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try
            {
                int ans=myCalculator.power(n,p);
                System.out.println(ans);
                
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }

    }
}
