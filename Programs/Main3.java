public class Main3 {
    public static void main(String[] args) {
        int[][] arr = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};

        for (int i = 0; i < 3; i++) {
            System.out.print("[");
            for (int j = 0; j < 3; j++) {

                System.out.print(arr[i][j]);
                if (j < 2) {
                    System.out.print(", ");
                }
            }
            System.out.print("]");
            System.out.println();
        }
    }
}