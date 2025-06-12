package demo;
public class RotatematrixExample {
	 public static void rotateMatrix(int[][] matrix) {
	        int n = matrix.length;
	        for (int i = 0; i < n; i++) {
	            for (int j = i + 1; j < n; j++) {
	                int temp = matrix[i][j];
	                matrix[i][j] = matrix[j][i];
	                matrix[j][i] = temp;
	            }
	        }
	        for (int i = 0; i < n; i++) {
	            int left = 0, right = n - 1;
	            while (left < right) {
	                int temp = matrix[i][left];
	                matrix[i][left] = matrix[i][right];
	                matrix[i][right] = temp;
	                left++;
	                right--;
	            }
	        }
	    }
	    public static void printMatrix(int[][] matrix) {
	        for (int[] row : matrix) {
	            for (int value : row) {
	                System.out.print(value + "\t");
	            }
	            System.out.println();
	        }
	        System.out.println();
	    }
	public static void main(String[] args) {
		int[][] matrix = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };
	        System.out.println("Original Matrix:");
	        printMatrix(matrix);
	        rotateMatrix(matrix);
	        System.out.println("Matrix after 90-degree rotation:");
	        printMatrix(matrix);
	}
}