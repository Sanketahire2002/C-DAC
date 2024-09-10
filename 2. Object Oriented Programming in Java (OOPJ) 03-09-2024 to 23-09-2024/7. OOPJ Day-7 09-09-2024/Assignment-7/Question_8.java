
public class Question_8 {

	private int[] array;
	
	public Question_8(int size) {
        array = new int[size];
    }
	
	public void setArray(int[] values) {
        for (int i = 0; i < array.length; i++) {
            array[i] = values[i];
        }
    }

    public int[] getArray() {
        return array;
    }

    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values = {10, 20, 30, 40, 50};
		Question_8 q = new Question_8(5);
		q.setArray(values);
		int[] arr = q.getArray();
		
		System.out.println("Array Elements:");
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
	}
}
