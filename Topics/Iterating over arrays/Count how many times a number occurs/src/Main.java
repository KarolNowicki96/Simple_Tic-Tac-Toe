import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int[] array = new int[input];
        int counter = 0;
        for (int i = 0; i <= input - 1; i++) {
            array[i] = scanner.nextInt();
        }
        int number = scanner.nextInt();
        for (int i = 0; i <= input - 1; i++) {
            if (array[i] == number) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}