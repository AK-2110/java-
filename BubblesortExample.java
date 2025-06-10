package demo;

public class BubblesortExample {

	public static void main(String[] args) {
		int[] num = {5,6,8,9,2,7,1,10,18,19};
		for(int i=0;i<num.length-1;i++) {
			for(int j=0;j<num.length-1;j++) {
				if(num[j] > num[j+1]) {
					int temp = num[j];
					num[j] = num[j++];
					num[j++] = temp;
				}
			}
		}
		System.out.println("sorted list:");
		for(int n:num) {
			System.out.println(n);
		}
	}

}
