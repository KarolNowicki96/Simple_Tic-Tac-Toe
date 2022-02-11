class ArrayOperations {
    public static int[][][] createCube() {
        int size = 3;
        int counter = 0;
        int[][][] array = new int[size][size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    array[i][j][k] = counter;
                    counter++;
                }
            }
            counter = 0;
        }
        return array;
    }
}
