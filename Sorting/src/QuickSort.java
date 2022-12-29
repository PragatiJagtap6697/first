
public class QuickSort {
	public static int partition(int arr[],int low,int high) {
		int pivot=arr[high];
		int i=low-1;
		for(int j=low;j<high;j++) {
			if(arr[j]<pivot) {
				i++;
				//swap
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		i++;
		int temp=arr[i];
		arr[i]=pivot;
		arr[high]=temp;
		return i;
	}
public static void QuickSort(int arr[],int low,int high) {
	if(low<high) {
		int pidx=partition(arr,low,high);
		QuickSort(arr,low,pidx-1);
		QuickSort(arr,pidx+1,high);
	
		}
	
	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {4,8,75,12,1,9};
int n=arr.length;
QuickSort(arr,0,n-1);
for(int k:arr) {
	System.out.print(k +" ");
}System.out.println();
	}

}
