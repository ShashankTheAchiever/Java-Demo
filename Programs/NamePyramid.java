public class NamePyramid {
    public static void main(String[] args) {
        String name = "SHASHANK";
        int n = name.length();

        for (int i = 0; i < n; i++) {

            for (int j = n - i; j > 1; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(name.charAt(j) + " ");
            }

            System.out.println();
        }
    }
}
