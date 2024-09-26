import java.util.Scanner;

public class Program_3 {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the array size");
	int n=sc.nextInt();
	int[] arr = new int[n];  
	System.out.println("Enter the array elements");
	int sum=0;
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
		sum+=arr[i];
	}
	int avg=sum/n;
	System.out.println(avg);
	System.out.println("Numbers above average");
	for(int i=0;i<n;i++)
	{
		if(arr[i]>avg)
		{
			System.out.println(arr[i]);
		}
	}
	sc.close();
	}

}