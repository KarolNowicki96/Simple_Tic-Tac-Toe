import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        int counter = 1;
        int max = 1;
        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < arraySize - 1; i++) {
            if (array[i] < array[i + 1]) {
                counter++;
                max = counter;
            } else {
                if (counter > max) {
                    max = counter;
                }
                counter = 1;
            }
        }
        System.out.println(max);
    }
}