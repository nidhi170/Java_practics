package ARRAY;

import java.util.Scanner;

public class occurence_Array {

	static int ArraySort(int arr[],int n,int x)
	{
			int res=0;
			for(int i=0;i<=n-1;i++)
			
				if(x==arr[i])
					res++;
			 return res;
	}
	
	
	public static void main(String args[])
	{
		int arr[]= {1,3,2,2,2,2,6,0,4,4,1};
		int n=arr.length;
		//int x=2;
		Scanner ss=new Scanner(System.in);
		int x=ss.nextInt();
		System.out.println(ArraySort(arr,n,x));
	}
}
