public class MatrixOperations {
    public static void main(String[] args) {
        int[][] A = {{1, 2}, {3, 4}};
        int[][] B = {{5, 6}, {7, 8}};
        
        System.out.println("Matrix A:");
        printMatrix(A);
        System.out.println("Matrix B:");
        printMatrix(B);
        
        int[][] sum = addMatrices(A, B);
        System.out.println("A + B:");
        printMatrix(sum);
        
        int[][] product = multiplyMatrices(A, B);
        System.out.println("A * B:");
        printMatrix(product);
        
        int[][] transposeA = transposeMatrix(A);
        System.out.println("Transpose of A:");
        printMatrix(transposeA);
    }
    
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int[][] result = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }
    
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int[][] result = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }
    
    public static int[][] transposeMatrix(int[][] A) {
        int[][] result = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[j][i] = A[i][j];
            }
        }
        return result;
    }
    
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}