import java.util.Scanner;

public class Question_9 {
	
	int[][] arr;
	
	public Question_9(int row, int col) {
		arr = new int[row][col];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of rows: ");
		int row = sc.nextInt();
		System.out.print("Number of coloumns: ");
		int col = sc.nextInt();
		
		Question_9 qqq = new Question_9(row,col);
		
		while(true)
		{
			System.out.println("1. View available seat.");
			System.out.println("2. Book Ticket");
			System.out.println("3. Cancel Ticket.");
			System.out.println("0. Exit");
			System.out.print("Enter your choie: ");
			
			int key = sc.nextInt();
			
			switch (key) {
			case 1:
				for (int i = 0; i < row; i++) {
					for (int j = 0; j < col; j++)
					{
						System.out.print(qqq.arr[i][j]+" ");
					}
					System.out.println();
				}
				break;
			
			case 2:
				System.out.print("Number of row: ");
				int r = sc.nextInt();
				System.out.print("Number of coloumn: ");
				int c = sc.nextInt();
				qqq.arr[r][c] = 1;
				break;
				
			case 3:
				System.out.print("Number of row: ");
				r = sc.nextInt();
				System.out.print("Number of coloumn: ");
				c = sc.nextInt();
				qqq.arr[r][c] = 0;
				break;
				
			case 0:
				System.out.println("Thank you ...");
				System.exit(0);
				break;
				
			default:
				System.out.println("Enter valid choice.");
				break;
			}
		}
	}

}
