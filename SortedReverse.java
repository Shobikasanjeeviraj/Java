class SortedReverse 
{
	public static void main(String[] args) 
	{
		int arr[]={1,2,3,4,5,6,7,8};
		int temp=0;
		System.out.println("Original Array: ");
		for( int i=0;i<arr.length;i++){
          System.out.print(arr[i]+" ");
		}
		System.out.println();

		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}

		System.out.println();

		System.out.println("Sorted Array: ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}

		System.out.println();System.out.println();


		System.out.println("Reverse Array: ");
	    for(int i=arr.length-1;i>=0;i--){
			System.out.print(arr[i]+" ");
		}
		System.out.println();

	}
}
