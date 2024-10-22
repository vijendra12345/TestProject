package com.syed.corejava.practise;

public class SeparateOddEven {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8};
		
		int start=0;
		int end=arr.length-1;
		
		while(start<=end)
		{
			while(arr[start]%2!=0)
			{
				
				start++;
			}
			while(arr[end]%2==0)
			{
				
				end--;
			}
			
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
			
						
		}
		for(int a: arr)
		{
			System.out.print(a);
		}

	}

}
