import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] array = new int[n][m];
        int xMax = 0;
        int yMax = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = scanner.nextInt();
                if (i == 0 && j == 0) {
                    max = array[i][j];
                } else {
                    if (array[i][j] > max) {
                        max = array[i][j];
                        xMax = i;
                        yMax = j;
                    }
                }
            }
        }
        System.out.println(xMax + " " + yMax);
    }
}