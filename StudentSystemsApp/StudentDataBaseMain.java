import java.util.Scanner;

public class StudentDatabaseMain {
    public static void main(String[]args){
        
        //Ask how many users we want to add
        System.out.println("Enter the number of students you want to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        StudentDatabaseApp [] students = new StudentDatabaseApp[numOfStudents]; 


        //Create a number of new students
        for(int i = 0; i < numOfStudents; i++){
            students[i] = new StudentDatabaseApp();
            students[i].enroll();
            students[i].payBalances();
           
         }
       
        for(int i = 0; i < numOfStudents; i++){
        System.out.println(students[i].toString());
        }

    }
}
