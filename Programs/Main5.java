import java.util.Scanner;
class A {
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Creating and using an anonymous object
        int result = new A() {{
            System.out.print("Enter a value: ");
            int val = scanner.nextInt();
            setValue(val);
        }}.getValue();

        System.out.println("Value: " + result);
    }
}
