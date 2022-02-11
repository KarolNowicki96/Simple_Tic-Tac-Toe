import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char[][] array = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Math.abs(i - j) == 0 || i+j == n - 1 || i == (n - 1) / 2 || j == (n - 1) /2 ) {
                    array[i][j] = '*';
                } else {
                    array[i][j] = '.';
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}