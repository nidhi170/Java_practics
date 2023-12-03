package sorting;

public class Bubble_Sort {
	
	static void bubbleSort(int arr[],int n) {
		int temp;
		boolean swapped;
		for(int i=0;i<n-1;i++)
		{
			swapped=false;
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1]) {
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				swapped=true;
			}
		}
			if(swapped==false)
			
			break;
			
		}
	}
	
	static void display(int arr[],int n) {
		for(int i=0;i<n-1;i++)
		{
			System.out.print(arr[i]+" ");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {40,20,10,50,60,8};
		int n=arr.length;
		bubbleSort(arr,n);
		System.out.print("Sorted arrays are");
		display(arr,n);

	}

}
