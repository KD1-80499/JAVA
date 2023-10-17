import java.util.Arrays;
import java.util.Comparator;

public class SortAlgorithm {
	
	static<T>void selectionSort(T[] arr,Comparator<T>c)
	{
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
			if(c.compare(arr[i], arr[j]) > 0) {
			T temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			}
			}	
		}
			
	}

	
	public static void main(String[] args) 
	{
		
		class SortComparator implements Comparator<Double>
		{
			@Override
			public int compare(Double d1, Double d2)
			{
				if(d1>d2)
					return 1;
			    return 0;
			}			
		}
		
		Double[] arr= {11.2,30.4,90.4,12.9,22.3,33.4,44.5,55.6};
		
		SortComparator sortcomparator=new SortComparator();
		System.out.println("Before sort");
		for(Double ele:arr)
			System.out.println(ele);
		
		selectionSort(arr,sortcomparator);
		System.out.println("After sort");
		for(Double ele:arr)
			System.out.println(ele);
			
		
//		Arrays.sort(arr);
//		System.out.println("After sort:");
//		for(Double sort:arr)
//			System.out.println(sort);
			
		
//		selectionSortComparator=new selectionSortComparator();
	

	}

}
