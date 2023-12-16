public class Fibonacci {
    public void printFibonacciSeries(int input){
        System.out.printf("The Fibonacci series of %d numbers: ", input);

        int secondToLast = 0,
        last = 1;

        System.out.printf("\n%d\n%d\n", secondToLast, last);

        for ( int counter = 2; counter < input; counter ++){
            int current = secondToLast + last;
            secondToLast = last;
            last = current;

            System.out.println(current + " ");

        }git branch -M main
    }
}
