package com.benz.sort;

import java.util.Arrays;

/**
 * �������� logn logn2 ���ȶ�
 * @Copyright to ShenZhen Sinosun Technology Co.,LTD 2016-2018
 * @Classname:
 * @Project: NetDisk
 * @Package: 
 * @Description:
 * @Author:Jiazhen.Ben
 * @Version: 
 * @Date�� 2016��5��8������9:25:23
 * @History��
 */
public class QuickSort {

	public static void main(String[] args) {
		int arr[] = {7,3,4,8,5,10,4};
		sort(arr, 0, arr.length-1);
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
			int mid = getMiddle(arr, left, right);
			sort(arr, left, mid-1);
			sort(arr, mid+1, right);
			
		}
		
	}
	private static int getPivot(int[] arr,int left,int right)
	{
		int pivot = arr[left];
		int storeIndex = left;
		for(int i = left+1;i<right;i++)
		{
			if(arr[i]<pivot)
			{ 
				int temp =arr[++storeIndex];
				arr[storeIndex] = arr[i];
				 arr[i] = temp;
			}
		}
		int temp = arr[left];
		arr[left] = arr[storeIndex];
		arr[storeIndex] = temp;
		return storeIndex;
	}
	
	public static int getMiddle(int[] numbers, int low,int high)
    {
        int temp = numbers[low]; //����ĵ�һ����Ϊ����
        while(low < high)
        {
        while(low < high && numbers[high] >= temp)
        {
            high--;
        }
        numbers[low] = numbers[high];//������С�ļ�¼�Ƶ��Ͷ�
        while(low < high && numbers[low] < temp)
        {
            low++;
        }
        numbers[high] = numbers[low] ; //�������ļ�¼�Ƶ��߶�
        }
        numbers[low] = temp ; //�����¼��β
        return low ; // ���������λ��
    }

}
