import java.util.Scanner;

public class StudentDatabaseApp {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1001;

    //Constructor: prompt user to enter the student's name and year
    public StudentDatabaseApp(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the student's First Name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter the student's Last Name: ");
        this.lastName = in.nextLine();

        System.out.println(" 1 - Freshmen\n 2 - Sophomore\n 3- Junior\n 4 - Senior\nEnter the student's Grade Level: ");
        this.gradeYear = in.nextInt();

        setStudentID();
    }

    // Generate an ID
    private void setStudentID(){
        //Grade level + ID
        id++; // adds one to the id of student
        this.studentID = gradeYear + "" + id;

    }

    //Enroll in courses
    public void enroll(){
        //get inside a loop, user hits 0
       do { 
           System.out.print("Enter a course to enroll (Q to quit): ");
           Scanner in = new Scanner(System.in);
           String course = in.nextLine();
           if(!course.equals("Q")) {
             courses = courses + "\n " + course;
             tuitionBalance += costOfCourse;
            }
           else{
                break;
            }
         } while(1 != 0);
     }
    // View Balances
    public void viewBalances(){
        System.out.println("The balance remaining is: $" + tuitionBalance);

    }

    // Pay Balances
    public void payBalances(){
        viewBalances();
        System.out.print("Enter your payment: $");
        Scanner in  = new Scanner(System.in);
        
        int payment = in.nextInt();
        tuitionBalance -= payment;
        System.out.println("Thank you for your payment of: $" + payment);
        viewBalances();

    }

    // Show status
    public String toString(){
        return "Name: " + firstName + " " + lastName +  "\nGrade Level: " + gradeYear +
        "\nStudent ID: " + studentID + "\nCourses Enrolled:" +
        courses + "\nBalance: $" + tuitionBalance;
    }
}

