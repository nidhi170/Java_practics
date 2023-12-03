package sorting;

public class Selection_Sort {
	
	static void Selection_Sort(int arr[],int n)
	{
		int min,temp,j;
	
		for(int i=0;i<n-1;i++)
		{
			min=i;
		
			for(j=i+1;j<n;j++)
			{	if(arr[j]<arr[min])
				
					min=j;
			}
			temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
			
			
		}
	}
	
	static void printArray(int arr[],int n)
	{
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,2,5,7,9,39};
		int n=arr.length;
		Selection_Sort(arr,n);
		printArray(arr,n);
		

	}

}
