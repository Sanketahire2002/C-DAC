public class Question_1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		System.out.print("Default array: ");
		for(int ele : arr)
			System.out.print(ele+" ");
		
		System.out.println("\nEnter array Elements: ");
		for(int i = 0; i < arr.length ; i++)
			arr[i] = new java.util.Scanner(System.in).nextInt();
		
		System.out.print("Updated array: ");
		for(int ele : arr)
			System.out.print(ele+" ");
	}
}