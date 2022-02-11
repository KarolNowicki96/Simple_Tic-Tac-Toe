import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int array[] = new int[count];
        int minimum = 2147483647;
        for(int i = 0; i <= count - 1; i++) {
            array[i] = scanner.nextInt();
            if (array[i] < minimum) {
                minimum = array[i];
            }
        }
        System.out.println(minimum);
    }
}