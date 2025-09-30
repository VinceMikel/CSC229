import static java.util.Arrays.binarySearch;

public class Homework {


        public static String sayHello(int num) {
        if(num ==0) {
           return " ";
        }


            System.out.println("Hello World!");

        return sayHello(num - 1);

        }

        public static int seven(int a, int b) {

            if(a>b) {
                return 0;
            }

            if(a% 7 == 0) {
                return a + seven(a + 1, b);

            } else {
                return seven(a + 1, b);
            }

            /*
            assuming ints are already arranged?
             */
            public static int binarySearch(int[] array, int start, int end, int target) {

                 if(start > end) {
                     return -1;
                 }

                int mid = (start + end) / 2;
                //best case scenario
                 if(array[mid] == target) {
                     System.out.println("found" + mid);
                     return mid;

                 }
                 //move left if target was less than mid
                 else if(target < array[mid]) {
                     return binarySearch(array, mid-1, end, target);
                 }

                 else { //move right
                     return binarySearch(array,start,mid + 1, target);
                 }

            }
        }











    }

