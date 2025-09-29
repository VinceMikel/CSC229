public class Task3 {

    int fib(int n) {
        if (n <= 0) // base case

            return 0;

        else if (n == 1) // base case

            return 1;

        else

            return fib(n - 1) + fib(n - 2);

    }
}

//what is the time complexity of this algorithm and why?

/*
line 3 will always run once for any number. If n is 0 only the 4th and 6 line will run. if n is 1
then line 3 will run once, line 4 runs to check if conditions are met, then line 8 will cause line
10 to run. now if its any number but 1 or 0 then it will first start with line 3, followed by else
and if conditions from line 4 and 8. line 12 would then run because conditions werent met with line 4 and 8
which in turns run line 14
 */
