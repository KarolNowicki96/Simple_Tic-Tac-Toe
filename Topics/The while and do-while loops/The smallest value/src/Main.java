import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        int counter = 0;
        long factorial = 1;


        do {
            counter++;
            factorial *= counter;
        } while (factorial <= m);

        System.out.println(counter);
    }
}