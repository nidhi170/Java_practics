package ARRAY;

public class min_max2 {

	static int getMin1(int arr[],int n)
	{
		int res=arr[0];
				for(int i=1;i<n;i++)
				res=Math.min(res, arr[i]);
				return res;
	}
	
	static int getMax(int arr[],int n)
	{
		int res=arr[0];
		for(int i=1;i<n;i++)
			res=Math.max(res, arr[i]);
		return res;
	}
	
	
	public static void main(String[] args) {
		int arr[]= {12,34,56,78,8};
		int n=arr.length;
		System.out.println("min " + getMin1(arr,n));
		System.out.println("Max is " +getMax(arr,n));
		}
	}

