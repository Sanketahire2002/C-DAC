public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {1,4,17,7,25,3,100};
		int[] res = new int[3];
		int k = 3;
		int index;
		
		for(int i=0;i<res.length;i++) { //k array
			int temp = arr[0];
			index = 0;
			for(int j=0;j<arr.length;j++) {  //input array
				if (arr[j]>temp) {
					temp = arr[j];
					index = j;
				}
			}
			arr[index] = -1;
			res[i] = temp;
		}
		for(int ele: res)
		System.out.print(" "+ele);
		System.out.println();
		for(int ele: arr)
			System.out.print(" "+ele);
	}