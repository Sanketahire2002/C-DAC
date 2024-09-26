class Program_5{
public static void  evenMedian(int []arr,int k) {
        int median=k/2;
		int n=arr.length;
		int count=1;
		for(int i=0;i<=n-k;i++) {
			int sum=arr[i+median]+arr[i+median+1];
			double avg=sum/2;
			
			System.out.println("median " +sum+": "+avg);
			++count;
			
		}
		System.out.println();
	}
}
