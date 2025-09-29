public class Task2 {

    static int gcd(int x, int y) {

        if (x % y == 0) //base case

            return y;

        else if(x > y) {
                return gcd(x -y, y);
            }

            else
                return gcd(x, y - x);


    }

}

    //what is the output of this code?
    /*
    The output of this code is supposed to find the greatest common denominator around
    the two numbers the user provides
     */

      // - modify it to find the gcd using subtraction instead of %.


