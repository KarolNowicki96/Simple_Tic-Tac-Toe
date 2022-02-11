import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        int n;
        int m;
        boolean flag = true;
        for (int i = 0; i <= arraySize -1; i++) {
            array[i] = scanner.nextInt();
        }

        n = scanner.nextInt();
        m = scanner.nextInt();

        for (int i = 0; i <= arraySize - 1; i++) {
            if (i != arraySize - 1){
                if (array[i] == n && array[i + 1] == m || array[i] == m && array[i + 1] == n) {
                    flag = false;
                }
            }
        }
        System.out.println(flag);
    }
}