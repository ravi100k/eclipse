import java.util.Scanner;

public class Shorting {
	public static int numberOfSwaps = 0;

	static void swap(int[] a,int pos1 , int pos2){
	    int temp = a[pos1];
	    a[pos1]=a[pos2];
	    a[pos2]=temp;
	}

	static int[] bubble(int[] a){
	    for (int i = 0; i < a.length; i++) {

	for (int j = 0; j < a.length - 1; j++) {
	    if (a[j] > a[j + 1]) {
	        swap(a,j,j + 1);
	        numberOfSwaps++;
	    }
	}
	}
	    return a;

	}

	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    int a[] = new int[n];
	    for(int a_i=0; a_i < n; a_i++){
	        a[a_i] = in.nextInt();
	    }
	    a=bubble(a);
	    System.out.println("Array is sorted in "+numberOfSwaps+" swaps.");
	    System.out.println("First Element: "+a[0]);
	    System.out.println("Last Element: "+a[n-1]);
	    in.close();
	}
	}
