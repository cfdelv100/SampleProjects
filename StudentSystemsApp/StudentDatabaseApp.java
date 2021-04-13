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
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the student's First Name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter the student's Last Name: ");
        this.lastName = in.nextLine();

        System.out.println(" 1 - Freshmen\n 2 - Sophomore\n 3- Junior\n 4 - Senior\nEnter the student's Grade Level: ");
        this.gradeYear = in.nextInt();
        System.out.println(firstName +  " " + lastName + " " + gradeYear);


    }

    // Generate an ID

    //Enroll in courses

    // View Balances

    // Pay Balances

    // Show status

    

}
