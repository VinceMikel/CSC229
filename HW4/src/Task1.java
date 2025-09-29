public class Task1 {

        public static void countDown(int num) {

            if (num == 0) // test

                System.out.println("Blastoff!");

            else {

                if(num % 2 ==0) {
                    System.out.println(num);
                }

                countDown(num-1); // recursive call

            }

        }

       // what is the output of this code?

    /* There is no output for now because the method was never called in the initial code nor do
    we have a main file to print anything, but this code is supposed to print for how many times
    the value of num is and then print "Blastoff!"
     */

         //       - modify it so that it prints only the even numbers.
    /* First we need to get rid of the strings being printed and just replace them with num
    then we need to put conditions and an if statement around the print num command
     */

           //     - what is the time complexity of this algorithm and why?
    /*
    Line 5 runs first to check if the num is 0, then if not executes line 9's branch which consists
    of line 11 and 12 to run which will then pass on to 15, and will repeat to line 5 until the value
    reaches 0 and finally line 7 can run
     */



}


