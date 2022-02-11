import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] array = new int[n][m];
        int[][] array2 = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        int columnOne = scanner.nextInt();
        int columnTwo = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j == columnOne) {
                    array2[i][columnOne] = array[i][columnTwo];
                } else if (j == columnTwo) {
                    array2[i][columnTwo] = array[i][columnOne];
                } else {
                    array2[i][j] = array[i][j];
                }
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }

    }
}
