	package javapgm19;

import java.util.Arrays;

public class quicksort {
	
	public static void quickSort(int arr[], int low, int high)
	{
		int mid = (low + high)/2;
		int i = low;
		int j = high;
		int pivot = arr[mid];
		while(i <= j)
		{
			while(arr[i] < pivot)
			{
				i++;
			}
			while(arr[j] > pivot)
			{
				j--;
			}
			if(i <= j)
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		if(low < j)
			quickSort(arr, low, j);
		if(high > i)
			quickSort(arr, j+1, high);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("quick sort");
		int[] array = {50, 70,10, 40, 50,70};
		int arr_start = 0;
		int arr_end = array.length-1;
		System.out.println("Before sorting");
		System.out.println(Arrays.toString(array));
		System.out.println("After sorting");
		quickSort(array, arr_start, arr_end);
		System.out.println(Arrays.toString(array));

	}
	
}
