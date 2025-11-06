package JavaPractise.studentGradeTrakerSinjuku;

import java.util.Scanner;

public class StudentGradeTrackerSinjukuMain {

    public static void main(String[] args) {
        System.out.println("hello World");

        String message1 = "please set how many student  you want to put: ";
        String message2 = "please make that in double: ";
        String message3 = "please Set how many subjects you want to set : ";
        int numOfStudents = 0;
        int numOfsubjects = 0;
        int[][] marks;

        Scanner scanner = new Scanner(System.in);

        numOfStudents = StudentInfor.getRow(scanner, message1, message2);

        String[] students = new String[numOfStudents];

        // Setting name of a students

        for (int i = 0; i < students.length; i++) {
            System.out.println("plese put the name of student: ");
            String student = scanner.next();
            students[i] = student;
        }

        numOfsubjects = StudentInfor.getRow(scanner, message3, message2);

        String[] subjects = new String[numOfsubjects];

        for (int i = 0; i < subjects.length; i++) {
            System.out.println("plese put the name of Subject: ");
            String subject = scanner.next();
            subjects[i] = subject;
        }

        System.out.println("the subject you have entered is :");

        for (String sub : subjects) {
            System.out.println(sub);
        }

        /// now this is all about 2d array

        marks = new int[numOfStudents][numOfsubjects];
        // for getting all the value required for marks related to subjects
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < subjects.length; j++) {
                System.out.println("please insert " + students[i] + "'s " + subjects[j] + "  score");
                marks[i][j] = scanner.nextInt();
            }
            System.out.println("input for " + students[i] + "  done");
        }

        // to print all the data stored in the marks
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < subjects.length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println(); // move to next line after each student
        }

        double[] studentAverages = StudentInfor.calculateAverageOfStudents(students, subjects, marks);

        System.out.println("Average marks for each student:");
        for (int j = 0; j < students.length; j++) {
            System.out.println(students[j] + ": " + studentAverages[j]);
        }


        double[] subjectAverages = StudentInfor.calculateAverageOfSubject(students, subjects, marks);

        System.out.println("Average marks for each subject:");
        for (int j = 0; j < subjects.length; j++) {
            System.out.println(subjects[j] + ": " + subjectAverages[j]);
        }



        scanner.close();

    }

}