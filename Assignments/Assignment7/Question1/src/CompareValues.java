import java.util.Arrays;

public class CompareValues {

	public static void main(String[] args) 
	{
//		String arr[]= {"swa","Yash","mum","Baba"};
////		Arrays.sort(arr);
//		System.out.println(arr);
//       	System.out.println(Arrays.toString(arr));
//		
//		String arr1[]= {"swa","Yash","mum","Baba"};
////		Arrays.sort(arr1);
//		System.out.println(arr1);
//		System.out.println(Arrays.toString(arr1));
//		
//		System.out.println("arr=arr1:"+Arrays.equals(arr, arr1));
		
	
	
	String arr1[]= {"swa","mum","yash","baba","ajji","mum","baba"};
	String arr2=new String();
	

	for(int i=0;i<arr1.length;i++)
	{
		for(int j=i+1;j<arr1.length;j++)
		{
			if(arr1[i]==arr1[j])
			{
				arr2+=arr1[i];
			}
		}
	}
	System.out.println("Duplicate values are"+arr2);
	}
}
