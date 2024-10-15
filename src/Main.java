import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int f0 = 1;
        int f1 = 1;
        int nextFib;
        while (f1 <= n) {
            nextFib = f0 + f1;
            f0 = f1;
            f1 = nextFib;
        }
            System.out.println("первое число фибоначчи " + n + ": " + f1);



    }
}