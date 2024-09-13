
public class Question_6 {

	public static void main(String[] args) {
		int[] array = {1, 2, 4, 5, 6};
        int n = array.length + 1;  // Since one number is missing

        int sum = n * (n + 1) / 2;  // Sum of first n natural numbers
        int temp = 0;

        for (int i = 0; i < array.length; i++) {
            temp += array[i];
        }

        int miss = sum - temp;
        System.out.println("Missing number is: " + miss);
	}

}
