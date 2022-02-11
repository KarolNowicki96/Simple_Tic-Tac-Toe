import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int array[] = new int[count];
        int max = -2147483647;
        int maxInd = 0;
        for (int i = 0; i <= count - 1; i++) {
            array[i] = scanner.nextInt();
            if (array[i] > max && array[i] != max) {
                max = array[i];
                maxInd = i;
            }
        }
        System.out.println(maxInd);
    }
}