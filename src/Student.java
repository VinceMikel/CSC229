/**
 *
 * @author MoaathAlrajab
 */
    // ToDo 1: Make this class a child of Person
    //we just add the word extends to meet this requirement
public class Student extends Person {
        private String address;
        private double gpa;


        // ToDo 2: Fix the resulting errors
    public Student(String name, short age) {
    super(name, age);
        /**
         *  after that we create the Student and create the blueprint and call upon the superclass
         *  (Person) with the super keyword
         */


    }

    /**
     * Got errors here because address is private, so I should just make
     * it into a new address field in this Student class for now
     */
    //setters and getters for address
    public void setAddress(String address) {
        this.address = address;
    }



    public String getAddress() {
        return address;
    }



    // ToDo 3: Add a field for GPA and create setter and getter
    /**
     *     gpa is not in person and is new but we should put it in
     *     student class because all students have grades and are "Persons
     *     but not all Persons are students
      */
    //setters and getters for GPA
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

	// ToDo 4: Add comments to your code
    @Override
    //need to override because toString is already a built in method in java
    //sets the students info into a readable string for users to read
    public String toString() {
        return "Student: " + getName() + "\n Age: " + getAge() + "\n Address: "
                + getAddress() + "\n GPA: " + getGpa();
    }

}