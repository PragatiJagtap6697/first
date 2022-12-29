
public class InsertionSort {
public static void InsertionSort(int arr[]) {
for(int i=0;i<arr.length;i++) {
	for(int j=0;j!=i;j++) {
		if(arr[i]<arr[j]) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
}
	
}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {45,12,6,23,42,9};
InsertionSort(arr);
for(int n:arr) {
	System.out.print(n +" ");
}System.out.println();
	}
}
