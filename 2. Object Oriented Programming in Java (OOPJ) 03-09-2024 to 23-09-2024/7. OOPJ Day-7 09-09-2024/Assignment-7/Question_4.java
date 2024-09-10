
public class Question_4 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.print("Enter size of array: ");
		int size = new java.util.Scanner(System.in).nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter array Elements: ");
		for(int i = 0; i < arr.length ; i++)
			arr[i] = new java.util.Scanner(System.in).nextInt();
		
		System.out.print("Array: ");
		for(int ele : arr)
			System.out.print(ele+" ");
		
		System.out.print("\nRepeated elements: ");
		int comp = 111111;
		boolean flag = false;
		for (int i = 0 ; i < arr.length - 1; i++) {
			flag = false;
			for (int j = i+1 ; j < arr.length ; j++) {
				if(arr[i] == arr[j] && arr[j] != comp) {
					arr[j] = comp;
					flag = true;
				}
			}
			if(flag == true && arr[i] != comp)
				System.out.print(arr[i] + " ");
		}
	}

}
