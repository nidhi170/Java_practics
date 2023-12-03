package ARRAY;

public class Reverse_Array {
	
	static void printArray(int arr[],int n)
	{
		for(int i=0;i<=n-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	static void reverseArray(int arr[], int start, int end)
	{
		int temp;
		while(start<end)
		{
			temp=arr[end];
			arr[end]=arr[start];
			arr[start]=temp;
			start++;
			end--;
		}
	}


	
	
	
	public static void main(String args[])
	{
		int arr[]= {1,2,3,4,5,6};
		int n=arr.length;
		printArray(arr,n);
		reverseArray(arr,0,n-1);
		printArray(arr,n);
		
	}
}
