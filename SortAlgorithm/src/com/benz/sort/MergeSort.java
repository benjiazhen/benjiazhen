package com.benz.sort;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int arr[] = {7,3,5,4,8,5,10};
		sort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void sort(int[] arr,int left,int right)
	{
		if(arr == null||arr.length ==0 ||left >=right)
		{
			return ;
		}
		if(left < right)
		{
			int mid = (left+right)/2;
			sort(arr, left,mid);
			sort(arr,mid+1, right);
			merge(arr,left,mid,right);
			
		}
	}

	private static void merge(int[] arr, int left, int mid, int right) {

		int k = 0;
		int n = right - left +1;
		int[] temp = new int[n];
		int leftStartIndex = left;
		int rightStartIndex = mid +1;
		
		while(leftStartIndex<=mid&&rightStartIndex<=right)
		{
			if(arr[leftStartIndex]<arr[rightStartIndex])
			{
				temp[k++] = arr[leftStartIndex++];
			}else
			{
				temp[k++] = arr[rightStartIndex++];
			}
		}
		
		while(leftStartIndex<=mid)
		{
			temp[k++] = arr[leftStartIndex++];
		}
		while(rightStartIndex<=right)
		{
			temp[k++] = arr[rightStartIndex++];
		}
		for(int i = 0;i<n;i++)
		{
			arr[left+i] = temp[i];
		}
		
	}
}
