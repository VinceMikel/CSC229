
public class NewClass {
    public static int getLargest(int arr[], int sz) {
        int iterate1 = 0; //starts at 0
        int iterate2 = 0;
        int largest = 0;
        while (iterate1 < sz - 1) { //will run on how many indexes sz has and in this case sz would be n
            iterate2++; //keeps a count on how many positive integers sz has

            /* we know that the below if statements only run as long as the while conditions are met so
            while statements > if statements and since we declared sz = n, sz - 1 = n-1
            */


            if (iterate2 == sz) {
                iterate1++;
                iterate2 = iterate1;
                continue;
            }

            /* Like ive claimed that the while statement is sz - 1 = n-1 and that the "if" statement should only execute
            when the while conditions are met these if statements run at n-2

             */

            int product = arr[iterate1] * arr[iterate2];
            if (product > largest)
                largest = product;
        }
        return largest; //runs only once after the loop ends


    }
}
