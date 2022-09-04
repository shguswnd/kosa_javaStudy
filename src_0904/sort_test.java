
public class sort_test {

	static void swap(int arr[], int first, int last)
	{
		int tmp = arr[last];
		arr[last] = arr[first];
		arr[first] = tmp;
		
 	}
	
	static void bubleSort(int arr[]) {
		for(int i=0 ; i<arr.length ; i++)
		{
			for(int j=0; j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
					swap(arr, j, j+1);
			}
		}
		
	}
	
	static void selectSort(int arr[]) {
		int min=0;
		for(int i=0 ; i<arr.length-1 ; i++)
		{
			min = i;
			for(int j=i+1 ; j<arr.length ; j++)
			{

				if(arr[min] > arr[j])
				{
					//System.out.printf("index : %d min : %d, arr[j] : %d ", min,arr[min], arr[j]);
					min = j;
				}
			}
			System.out.printf("index : %d min : %d ", min,arr[min]);
//			System.out.println("i°ª : " + i);
			swap(arr, i, min);
			for(int k=0 ; k<arr.length; k++)
				System.out.print(arr[k]);
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7,3,2,8,9,4,6,1,5};
		
		//bubleSort(arr);
		selectSort(arr);
		
		for(int i=0 ; i<arr.length; i++)
			System.out.println(arr[i]);
		
		
	}

}
