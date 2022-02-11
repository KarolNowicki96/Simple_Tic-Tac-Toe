class ArrayOperations {
    public static void printCorners(int[][] twoDimArray) {
        int size = 2;
        int counter = 0;
        int[][] cornersArray = new int[size][size];
        int inputArrayRows = twoDimArray.length; // 3 lub 3
        int inputArrayColumns = twoDimArray[0].length; // 3 1
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (counter == 0) {
                    cornersArray[i][j] = twoDimArray[0][0];
                } else if (counter == 1) {
                    cornersArray[i][j] = twoDimArray[0][inputArrayColumns - 1];
                } else if (counter == 2) {
                    cornersArray[i][j] = twoDimArray[inputArrayRows - 1][0];
                } else if (counter == 3) {
                    cornersArray[i][j] = twoDimArray[inputArrayRows - 1][inputArrayColumns - 1];
                }
                counter++;
                System.out.print(cornersArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
