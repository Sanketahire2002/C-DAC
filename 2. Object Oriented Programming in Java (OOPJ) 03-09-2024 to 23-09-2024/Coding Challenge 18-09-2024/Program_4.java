import java.util.Scanner;

public class Program_4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=sc.nextInt();
		int[] arr = new int[n];  
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int i=0,j=n-1;
		while(i<=j)
		{
			 if (arr[i] < 0 && arr[j] >= 0) {
	                i++;
	                j--;
	            } 
			 else if(arr[i]>=0 && arr[j]<0)
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			 else if(arr[i]<0)
			 {
				 i++;
			 }
			 else {
				 j--;
			 }
		}
		for(int t=0;t<n;t++)
		{
			System.out.println(arr[t]);
		}
		
	}

}