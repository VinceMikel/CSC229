/**
 *
 * @author MoaathAlrajab
 */
import java.util.Scanner;
public class DriverClass {
	
	public static void main(String[] args) {
		// ToDo 5: Fix the error
        //done

		// ToDo 6: Fix the constructor of Student class
		//done
        Student std1= new Student("James",(short) 20);
        //this didnt work because of the type casting which in the original did not include "(short)"


        // ToDo 7: Add a toString method for Student class
       //done





		// ToDo 8: Set the gpa of the student using the scanner and user
		// 			input and then print the output.
        //import scanner class for this
        //this section will ask for the Student's GPA and enter it into the Student's database along
        //with the info it already had like the age and address
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter student's GPA: ");
        double gpa = scnr.nextDouble();
        std1.setGpa(gpa);


		
		System.out.println(std1);
		
		// ToDo 9: add comments and explain your code
		
		// ToDo 10: submit using a pull request.
	}

}