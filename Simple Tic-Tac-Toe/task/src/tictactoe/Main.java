package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int xOrY = 0;
        int gameOver = 1;
        int x = 0;
        int y = 0;
        char[][] array = new char[3][3];
        array = printEmptyArray(array);

        while (gameOver == 1) {
            System.out.print("Enter the coordinates: ");
            try {
                x = scanner.nextInt() - 1;
                y = scanner.nextInt() - 1;
            }
            catch (Exception e) {
                System.out.println("You should enter numbers!");
                scanner.nextLine();
            }
            if (x > 2 || y > 2) {
                System.out.println("Coordinates should be from 1 to 3!");
            } else {
                if (array[x][y] == 'X' || array[x][y] == 'O' ) {
                    System.out.println("This cell is occupied! Choose another one!");
                } else {
                    if (xOrY % 2 == 0) {
                        array[x][y] = 'X';
                        printArray(array);
                        xOrY ++;
                        gameOver = checkIfGameOver(array, 'X');
                    } else {
                        array[x][y] = 'O';
                        printArray(array);
                        xOrY++;
                        gameOver = checkIfGameOver(array, 'O');
                    }
                }
            }

        }
    }

//=====================================================================================================================

    public static int checkIfGameOver(char[][] array, char input) {
        int xCounter = 0;
        int oCounter = 0;
        char lastInput = input;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3; j++) {
                if (array[i][j] == 'X') {
                    xCounter++;

                } else if (array[i][j] == 'O') {
                    oCounter++;
                }
            }
        }
        int gameOver = 0;
        char winningSign = '-';
        for (int i = 0; i < 3; i++) {
            if (array[i][0] == array[i][1] && array[i][1] == array[i][2]) {
                winningSign = array[i][0];
                if (winningSign != ' '){
                    gameOver++;
                }
            }
            if (array[0][i] == array[1][i] && array[1][i] == array[2][i]) {
                winningSign = array[0][i];
                if (winningSign != ' ') {
                    gameOver++;
                }
            }
        }
        if (array[0][0] == array[1][1] && array[1][1] == array[2][2]) {
            winningSign = array[1][1];
            if (winningSign != ' ') {
                gameOver++;
            }
        }
        if (array[0][2] == array[1][1] && array[1][1] == array[2][0]) {
            winningSign = array[1][1];
            if (winningSign != ' ') {
                gameOver++;
            }
        }

        int movesDone = xCounter + oCounter;

        if (gameOver != 0) {
            System.out.println(lastInput + " wins");
            return 0;
        } else if (gameOver == 0 && movesDone == 9) {
            System.out.println("Draw");
            return 0;
        }
        System.out.println("game over ->" + gameOver);
        System.out.println("MovesDone ->" + movesDone);
        return 1;
    }
//=====================================================================================================================

    public static char[][] printEmptyArray(char array[][]) {
        char[][] arrayReturn = new char[3][3];
        System.out.println("---------");
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 4;j++) {
                if (j == 0 || j == 4) {
                    System.out.print("| ");
                } else {
                    array[i][j-1] = ' ';
                    System.out.print(array[i][j-1] + " ");
                }
            }
            System.out.println();
        }
        System.out.println("---------");
        return array;
    }

//=====================================================================================================================

    public static void printArray ( char array[][]) {
        System.out.println("---------");
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 4;j++) {
                if (j == 0 || j == 4) {
                    System.out.print("| ");
                } else {
                    System.out.print(array[i][j-1] + " ");
                }
            }
            System.out.println();
        }
        System.out.println("---------");
    }
}
