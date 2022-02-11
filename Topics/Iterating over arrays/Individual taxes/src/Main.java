import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        double[] incomesArray = new double[arraySize];
        double[] taxArray = new double[arraySize];
        double maxTax = 0;
        int maxTaxInd = 0;
        double temp;
        for (int i = 0; i < arraySize; i++) {
            incomesArray[i] = scanner.nextInt();
        }

        for (int i = 0; i < arraySize; i++) {
            taxArray[i] = scanner.nextInt();
        }

        for (int i = 0; i < arraySize; i++) {
            temp = incomesArray[i] * taxArray[i] / 100.0;
            if (temp > maxTax) {
                maxTax = temp;
                maxTaxInd = i+1;
            }
        }
        System.out.println(maxTaxInd);
    }
}