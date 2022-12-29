
public class Practice {

	public static int bubblesort(int arr[]) {
		int passes=arr.length-1;
		int comps=arr.length-1;
		for(int i=0;i<passes;i++) {
		int count=0;
		for(int j=0;j<(comps-i);j++) {
			if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				count++;
			}
		}
		if(count==0) {
			return i+1;
		}
		
		}
		return arr.length;
	}
	
	
	public static void ssort(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			int minIndex=i;
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[minIndex]) {
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
	
	public static void isort(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j!=i;j++) {
				if(arr[j]>arr[i]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
	
	
	private static int partition(int[] arr, int low, int high) {
		int pivot=arr[high];
		int i=low-1;
		for(int j=low;j<high;j++) {
			if(arr[j]<pivot) {
				i++;
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
	public static void qsort(int arr[],int low,int high) {
		if(low<high) {
			int pidx=partition(arr,low,high);
			qsort(arr,low,pidx-1);
			qsort(arr,pidx+1,high);
			
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,1,9,7,6,78,20};
		
//		System.out.println("passes :" +bubblesort(arr));
//		bubblesort(arr);
		//
		//ssort(arr);
		//isort(arr);
		int n=arr.length;
		qsort(arr,0,n-1);
		
		for(int k:arr) {
			System.out.print(n +" ");
		}
System.out.println();
	}

}
