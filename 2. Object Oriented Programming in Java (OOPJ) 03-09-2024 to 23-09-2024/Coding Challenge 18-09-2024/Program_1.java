public class Program_1 {
	
	public static int gcd(int a, int b) {
		int diff = 0;
		diff = Math.abs(a-b);
		if (a>b) {
			a = diff;
		}else if(a<b){
			b = diff;
		}else {
			return a;
		}
		return gcd(a,b);
		
	}
	
	public static void main(String[] args) {
		//Declared and assigned two variables
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1 : ");
		int number1 = sc.nextInt();
		System.out.println("Enter number 2 : ");
		int number2 = sc.nextInt();
		sc.close();
		System.out.println("Gcd is "+gcd(number1,number2));
			
	}
}