
public class Question_3 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int[] arr = new int[5];
	
		System.out.println("Enter array Elements: "+arr.length);
		for(int i = 0; i < arr.length ; i++)
			arr[i] = new java.util.Scanner(System.in).nextInt();
		
		System.out.print("Array: ");
		for(int ele : arr)
			System.out.print(ele+" ");
		
		
		int temp = arr[0];
		for (int i : arr) {
			if(temp < i)
				temp = i;
		}
		
		System.out.println("\nMaximum: " + temp);
		for (int i : arr) {
			if(temp > i)
				temp = i;
		}
		System.out.println("Minimum: " + temp);
	}

}
