import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        int div = 4;
        int maxNumber = 0;
        int counter = 0;

        while (scanner.hasNext()) {
            input = scanner.nextInt();
            if (input % div == 0 && input > maxNumber) {
                maxNumber = input;
            }
        }

        System.out.println(maxNumber);
    }
}