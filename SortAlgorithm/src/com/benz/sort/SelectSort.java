package com.benz.sort;

import java.util.Arrays;

/**
 * ѡ�������Ӷ�O(n2) ���ȶ���
 * @Copyright to ShenZhen Sinosun Technology Co.,LTD 2016-2018
 * @Classname:
 * @Project: NetDisk
 * @Package: 
 * @Description:
 * @Author:Jiazhen.Ben
 * @Version: 
 * @Date�� 2016��5��15������3:05:11
 * @History��
 */
public class SelectSort {

	public static void main(String[] args) {
		int arr[] = {7,3,4,8,5,10,5};
		sort(arr, 0, arr.length);
		System.out.println(Arrays.toString(arr));
	}
	public static void sort(int[] arr,int left,int right)
	{
		for(int i = 0;i<arr.length-1;i++)
		{
			for(int j = i;j<arr.length;j++)
			{
				if(arr[i] >arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
