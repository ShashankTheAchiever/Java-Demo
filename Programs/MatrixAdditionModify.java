public class MatrixAdditionModify {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 24, 13}, {94, 75, 6}, {27, 8, 19}};
        int[][] matrix2 = {{39, 88, 7}, {62, 51, 4}, {63, 52, 11}};
        int[][] result = new int[3][3];

        System.out.println(matrix2.length);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = matrix1[i][j] + matrix2[matrix2.length - i - 1][matrix2.length - j - 1];
            }
        }

        System.out.println("Resultant Matrix:");
        for (int i = 0; i < 3; i++) {
            System.out.print("[");
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j]);
                if (j < 2) {
                    System.out.print(", ");
                }
            }
            System.out.print("]");
            System.out.println();
        }
    }
}
