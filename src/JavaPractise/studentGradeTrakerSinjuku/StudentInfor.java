package src.JavaPractise.studentGradeTrakerSinjuku;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import src.JavaPractise.utilities.Utility;


public class StudentInfor {

// to get the number of
    public static int getRow(Scanner scanner, String message1, String message2) {
        while (true) {
            System.out.println(message1);

            String input = scanner.next();

            if (Utility.isInteger(input)) {
                return Integer.parseInt(input);
            } else {
                System.out.println(message2);
            }
        }
    }

    //calculate average per student
    public static double[] calculateAverageOfStudents(String[] students, String[] subjects, int[][] marks) {
        double[] studentAverages = new double[students.length];
        for (int i = 0; i < students.length; i++) {
            int sum = 0;

            for (int j = 0; j < subjects.length; j++) {
                sum += marks[i][j];

            }
            studentAverages[i] = (double) sum / subjects.length;
        }


        return studentAverages;
    }

    //calculate average per subject

    public static double[] calculateAverageOfSubject(String[] students, String[] subjects, int[][] marks) {
        double[] subjectAverages = new double[subjects.length];
        for (int i = 0; i < subjects.length; i++) {
            int sum = 0;
            for (int j = 0; j < students.length; j++) {
                sum += marks[j][i];

            }
            subjectAverages[i] = (double) sum / students.length;
        }

        return subjectAverages;
    }

    //get max marks obtained by students   

    public static List<String> getMaxMarks(String[] students, String[] subjects, int[][] marks) {
        List<String> maxAchievers = new ArrayList<>();
        int maxNumber = -1;
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < subjects.length; j++) {
                int currentMark = marks[i][j];
                if (currentMark > maxNumber) {
                    maxNumber = currentMark;

                    String max = Integer.toString(maxNumber);

                    maxAchievers.clear();

                    String acheivedStudent = students[i];
                    String acheivedSubject = subjects[j];

                    maxAchievers.add("The highest acheiving Student is  " + acheivedStudent + " in" + " Subject " + acheivedSubject + " with maximun number of " + max);


                } else if (currentMark == maxNumber) {
                    String max = Integer.toString(maxNumber);

                    String acheivedStudent = students[i];
                    String acheivedSubject = subjects[j];
                    maxAchievers.add("The highest acheiving Student is  " + acheivedStudent + " in" + " Subject " + acheivedSubject + " with maximun number of " + max);

                }
            }
        }


        return maxAchievers;
    }


    /// lowest achievers

    public static List<String> getLowScorers(String[] students, String[] subjects, int[][] marks) {
        List<String> lowScorers = new ArrayList<>();
        int lowestMark = 101;
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < subjects.length; j++) {

                //logic to check find low scores
                int currentMarks = marks[i][j];
                if (currentMarks < lowestMark) {
                    lowScorers.clear();
                    lowestMark = currentMarks;
                    String lowestStudent = students[i];
                    String lowestSubject = subjects[j];

                    String lowestScore = Integer.toString(lowestMark);

                    lowScorers.add("The lowest acheiving Student is  " + lowestStudent + " in" + " Subject " + lowestSubject + " with lowest number of " + lowestScore);
                } else if (lowestMark == currentMarks) {

                    String lowestStudent = students[i];
                    String lowestSubject = subjects[j];

                    String lowestScore = Integer.toString(lowestMark);

                    lowScorers.add("The lowest acheiving Student is  " + lowestStudent + " in" + " Subject " + lowestSubject + " with lowest number of " + lowestScore);

                }
            }
        }

        return  lowScorers;

    }

}
