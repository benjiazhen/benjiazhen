package com.benz.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 * @Copyright to ShenZhen Sinosun Technology Co.,LTD 2016-2018
 * @Classname:
 * @Project: NetDisk
 * @Package: 
 * @Description:
 * @Author:Jiazhen.Ben
 * @Version: 
 * @Date： 2016年5月11日下午10:28:11
 * @History：
 */
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7,3,5,4,8,5,10};
		sortBest(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void sort(int[] arr)
	{
		for(int i = 0 ;i<arr.length-1;i++)
		{
			for(int j = 0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
	}
	/**
	 *当数组为有序时，冒泡排序复杂度为O（n）
	 * @param arr
	 */
	public static void sortBest(int[] arr)
	{
		int unsortedIndex = arr.length-1;
		boolean isOrdered =false;
		do
		{
		    isOrdered = false;	
			
			for(int i=0;i<unsortedIndex;i++)
			{
				if(arr[i]>arr[i+1])
				{
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					isOrdered = true;
				}
				
			}
			unsortedIndex--;
		}while(isOrdered);
		
	}

}
