package demo;

public class QuicksortExmple {

	static void Quicksort(int arr[],int low,int high) {
		if(low<high) {
			int pivotIndex = partition(arr,low,high);
			Quicksort(arr,low,pivotIndex-1);
			Quicksort(arr,pivotIndex+1,high);
		}
	}
	static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low-1;
		for(int j=low;j<high;j++) {
			if(arr[j]<pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		return i+1;
	}
	public static void printArray(int[] arr) {
		for(int num:arr) {
			System.out.println(num+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int arr[] = {4,7,9,8,5,1,10,3};
		System.out.println("original array:");
		printArray(arr);
		Quicksort(arr, 0 ,arr.length-1);
		System.out.println("sorted quick array:");
		printArray(arr);
	}
}