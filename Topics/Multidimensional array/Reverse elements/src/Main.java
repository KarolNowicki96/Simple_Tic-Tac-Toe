class ArrayOperations {
    public static void reverseElements(int[][] twoDimArray) {
        int arrayHeight = twoDimArray.length; // 4 rows
        int arrayWidth = twoDimArray[0].length; // 4  columns

        int array[][] = new int[arrayHeight][arrayWidth];

        for (int i = 0; i < arrayHeight; i++) {
            for (int j = 0; j < arrayWidth; j++) {
                array[i][j] = twoDimArray[i][arrayWidth - j - 1];
            }
        }
        for (int i = 0; i < arrayHeight; i++) {
            for (int j = 0; j < arrayWidth; j++) {
                twoDimArray[i][j] = array[i][j];
            }
        }

    }
}
