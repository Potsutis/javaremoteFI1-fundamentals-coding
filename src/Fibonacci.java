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
            /*
            1. Create Branch
            2. Make Changes
            3. Commit and Push
            4. If want to merges changes to other branch(main), then create PR (Pull Request)
            5. After approval, merge PR.
            6. Update Project/Pull/Fetch in IntelliJ
             */


        }
    }
}
