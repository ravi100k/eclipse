package begineer;

import java.util.*;

 class InputOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int input,count = 0;
		for(int i=0;i<n;i++){
			 input = sc.nextInt();
			 if(input%k==0){
					count++;
					
				}
			 
		}System.out.println(count);
		
	 
		sc.close();
		

	}

}
