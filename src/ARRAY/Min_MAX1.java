package ARRAY;

import java.util.Arrays;

public class Min_MAX1 {
	
	public static void main(String args[])
	{
		int a[]= {1,23,45,6,42,2,6};
		
		Arrays.sort(a);
		System.out.print("min"+a[0]+"max"+a[a.length-1]);
	}

}
