
public class Question_2 {

	@SuppressWarnings("resource")
	private static void acceptRecord(int[] arr)
	{
		System.out.println("Enter array Elements: ");
		for(int i = 0; i < arr.length ; i++)
			arr[i] = new java.util.Scanner(System.in).nextInt();
	}
	
	private static void printRecord(int[] arr)
	{
		System.out.print("Array: ");
		for(int ele : arr)
			System.out.print(ele+" ");
	}
	
	public static void main(String[] args) {
		int[] arr = new int[5];
		Question_2.acceptRecord(arr);
		Question_2.printRecord(arr);
	}

}
