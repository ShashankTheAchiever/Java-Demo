public class Main2 {
    public static void main(String[] args) {
        int num = 345678;
        int sum = 0;

        int reverseNum = 0;
        while(num!=0) {
            int remainder = num % 10;
            reverseNum = reverseNum * 10 + remainder;
            num /= 10;
            
            sum += remainder;
            System.out.println(sum);

        }
        System.out.println("Reverse num: " + reverseNum);
        System.out.println("Sum of digits: " + sum);
    }
}
