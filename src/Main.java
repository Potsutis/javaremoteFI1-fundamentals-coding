import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Fibonacci Series:  \n Enter an Integer: ");
        Scanner scanner = new Scanner(System.in);
        int inputF = scanner.nextInt();
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.printFibonacciSeries(inputF);

    }
}