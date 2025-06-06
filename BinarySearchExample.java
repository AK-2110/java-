package demo;

public class BinarySearchExample {

	public static void main(String[] args) {
		int[] numbers = {5,7,2,9,8,4};
		
		int  target = 8;
		int left = 0;
		int right = numbers.length-1;
		
		boolean found = false;
		
		while(left<=right) {
			int mid = (left+right)/2;
			
			if(numbers[mid]==target) {
				System.out.println("FOUND" + target + "at index" + mid);
				found = true;
				break;
			}else if(target<numbers[mid]) {
				right=mid-1;
			}else {
				left= mid+1;
			}
		}
		if(!found ) {
			System.out.println("NUMBER"+target+"not found");
		}
	}

}
