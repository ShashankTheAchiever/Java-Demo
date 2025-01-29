class Pattern {
    public void printPattern(int i, int j) {
        // Print the triangle
        for (int a = 1; a <= i; a++) {
            for (int b = i - a; b > 0; b--) {
                System.out.print(" ");
            }
            for (int b = 1; b <= a; b++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        // Print the reverse triangle
        for (int a = j; a >= 1; a--) {
            for (int b = j - a; b > 0; b--) {
                System.out.print(" ");
            }
            for (int b = 1; b <= a; b++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

public class Main6 {
    public static void main(String[] args) {
        Pattern p = new Pattern();
        p.printPattern(11, 6); // Change the values as needed
    }
}
