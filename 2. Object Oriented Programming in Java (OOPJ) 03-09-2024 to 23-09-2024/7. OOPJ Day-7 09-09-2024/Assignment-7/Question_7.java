
public class Question_7 {

	private int[] array;
	
	public Question_7(int size) {
        array = new int[size];
    }
	
	public void acceptRecord(int[] values) {
        for (int i = 0; i < array.length; i++) {
            array[i] = values[i];
        }
    }

    public void printRecord() {
        System.out.println("Array Elements:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values = {10, 20, 30, 40, 50};
		Question_7 q = new Question_7(5);
		q.acceptRecord(values);
		q.printRecord();
	}
}
