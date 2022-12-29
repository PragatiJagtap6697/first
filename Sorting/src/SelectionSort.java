
public class SelectionSort {

	public static void SelectionSort(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			int minIndex=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[minIndex]) {
					minIndex=j;
				}
				
			}
			if(minIndex!=i) {
				int temp=arr[i];
				arr[i]=arr[minIndex];
				arr[minIndex]=temp;
			}
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,56,40,100,4,78};
SelectionSort(arr);
for(int n:arr) {
	System.out.print(n +" ");
}
System.out.println();
	}

}
