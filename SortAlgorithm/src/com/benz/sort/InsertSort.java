package com.benz.sort;

import java.util.Arrays;

public class InsertSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7,3,4,8,5,10,5,4};
		sort(arr, 0, arr.length);
		System.out.println(Arrays.toString(arr));
	}
	public static void sort(int[] arr,int left,int right)
	{
		for(int i = left+1;i < right;i++)
		{
			int j = i-1;
			int temp = arr[i];
			for(;j>0&&temp<arr[j];j--)
			{
				arr[j+1] = arr[j];
			}
			
			arr[j+1] = temp;
		}
	}
}
