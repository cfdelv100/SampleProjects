package com.company;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private int studentID;
    private String courses;
    private String tuitionBalance;
    private int costOfCourse = 600;
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
        System.out.println(firstName +  " " + lastName + " " + gradeYear  + " " + studentID);

    }

    // Generate an ID
    private void setStudentID(){
        //Grade level + ID
        id++; // adds one to the id of student
        this.studentID = gradeYear + "" + id;

    //Enroll in courses
    public void enroll(){
        //get inside a loop, user hits 0
       do { 
           System.out.println("Enter a course to enroll (Q to quit): ");
           Scanner in = new Scanner(System.in);
           String course = in.nextLine();
           if(!course.equals("Q")) {
             courses = course + "\n" + course;
             tuitionBalance = tuitionBalance + costOfCourse;
            }
           else{
                break;
            }
         } while(1 != 0);
           
         System.out.print("ENROLLED IN: " + courses);
         System.out.println("TUITION BALANCE: " + tuitionBalance);
    }

    // View Balances

    // Pay Balances

    // Show status

    

}
