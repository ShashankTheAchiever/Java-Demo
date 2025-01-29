public class Main4 {
    public static void main(String[] args) {
        int[] originalArray = {11, 21, 4, 73, 85, 19, 68, 55, 39, 26};
        System.out.print("Original array: ");
        for (int i = 0; i < originalArray.length; i++) {
            System.out.print(originalArray[i] + " ");
        }
        System.out.println();
        int[] reversedArray = new int[originalArray.length];
        for (int i = 0; i < reversedArray.length; i++) {
            reversedArray[i] = originalArray[reversedArray.length - 1 - i];
        }

        System.out.print("Reversed array: ");
        for (int i = 0; i < reversedArray.length; i++) {
            System.out.print(reversedArray[i] + " ");
        }
    }
}
