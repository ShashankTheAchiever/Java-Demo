public class PatternClass {
    private int rows;

    public int getRows() {
        return rows;
    }

    public void setPatternRows(int rows) {
        this.rows = rows;
    }

    public void getPatternRows() {
        for (int i = 1; i <= rows; i++) {
            for (int j = rows - i + 1; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PatternClass pattern = new PatternClass();
        pattern.setPatternRows(6);
        pattern.getPatternRows();
    }
}
