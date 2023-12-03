package sorting;

public class Insertion_Sort {
	
	static void InsertionSort(int arr[],int n) {
		int current,j;
		for(int i=1;i<n;i++)
		{
			current=arr[i];
			j=i-1;
			
			while(j>=0&& current<arr[j])
			{
				arr[j+1]=arr[j];
				j--;
			}
			
			arr[j+1]=current;
			
			
		}
	}
	
	static void printArray(int arr[],int n){
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+"  ");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,11,13,5,6};
		int n=arr.length;
	InsertionSort(arr,n);
	
	printArray(arr,n);

	}

}
