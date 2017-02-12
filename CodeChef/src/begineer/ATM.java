package begineer;

import java.util.Scanner;

class ATM {

/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		float wid = sc.nextFloat();
		float bal = sc.nextFloat();
		
		if(bal>wid && wid%5==0){
			float res = (float) ((float) (bal-wid)-(float)0.500000000);
			System.out.printf("%.2f",res);
		}else if(wid%5!=0||wid>bal){
			System.out.printf("%.2f",bal);
		}
	}*/
	public static void main(String args[])
	{
		Scanner kb=new Scanner(System.in);
		float a=kb.nextFloat();
		float balance,initbalance=kb.nextFloat();
		balance=initbalance;
		if(a%5==0){
			if((float)a<=initbalance-0.500000){
				balance=(float)((float)initbalance-(float)a-(float)0.500000);
			}
		}
		System.out.printf("%.2f",balance);
	}

}
