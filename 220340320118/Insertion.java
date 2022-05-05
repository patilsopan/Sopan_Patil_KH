import java.util.Arrays;
import java.util.Scanner;
class Insertion{
	
	void insertionSort(int arr[]){
		int size = arr.length;
		
		for(int i=1;i<size;i++){
			int key = arr[i];
			int j = i-1;
			
		while(j>=0 && key < arr[j]){
			arr[j+1] = arr[j];
			--j;
		}
		arr[j+1] = key;
		}
	}
	
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements of the array");
		int n = sc.nextInt();
		int arr[] = new int[5];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Array Elements are");
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}
		Insertion ss = new Insertion();
		ss.insertionSort(arr);
		System.out.println("Sorted Array is in Ascending Order");
		System.out.println(Arrays.toString(arr));
	}	
}