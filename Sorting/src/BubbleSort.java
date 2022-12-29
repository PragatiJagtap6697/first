
public class BubbleSort {

	public static int bubblesort(int arr[]) {
		int passes=arr.length-1;
		int comps=arr.length-1;
		for(int i=0;i<passes;i++) {
			int count = 0;
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int arr[]= {10,58,75,2,34,5};
int arr[]= {4,1,9,7,6,78,20};
System.out.println("passes :  "+bubblesort(arr));
for(int n:arr) {
	System.out.print(n +" ");
}System.out.println();
	}

}
