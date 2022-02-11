import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] array = new int[n][m];
        int[][] rotatedArray = new int[m][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                rotatedArray[j][n - 1 - i] = array[i][j];
            }
        }

        /*

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                ret[j][M-1-i] = mat[i][j];
        }
    }


         */

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(rotatedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}