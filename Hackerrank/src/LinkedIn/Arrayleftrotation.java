package LinkedIn;

import java.util.Scanner;

class Arrayleftrotation 
{
	/*Function to left rotate arr[] of size n by d*/
	void leftRotate(int arr[], int d, int n) 
	{	
		int i;
		for (i = 0; i < d; i++)
			leftRotatebyOne(arr, n);
	}

	void leftRotatebyOne(int arr[], int n) 
	{
		int i, temp;
		temp = arr[0];
		for (i = 0; i < n - 1; i++)
			arr[i] = arr[i + 1];
		arr[i] = temp;
	}

	/* utility function to print an array */
	void printArray(int arr[], int size) 
	{
		int i;
		for (i = 0; i < size; i++)
			System.out.print(arr[i] + " ");
	}

	// Driver program to test above functions
	public static void main(String[] args) 
	{
		Arrayleftrotation rotate = new Arrayleftrotation();
		Scanner sc= new Scanner(System.in);
		System.out.println("no of array element");
		int a= sc.nextInt();
		
		System.out.println("amount of left rotation");
		int r= sc.nextInt();
		
		System.out.println("element of array");
		int arr[] = new int[a];
		for(int i=0;i<a;i++){//for reading array
			arr[i]=sc.nextInt();

		}

		rotate.leftRotate(arr, r, a);
		rotate.printArray(arr, a);
	}
}