import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        int number;
        boolean flag = false;
        for (int i = 0; i <= arraySize - 1; i++) {
            array[i] = scanner.nextInt();
        }

        number = scanner.nextInt();

        for (int i = 0; i <= arraySize - 1; i++) {
            if (array[i] == number) {
                flag = true;
                break;
            }
        }

        System.out.println(flag);
    }
}