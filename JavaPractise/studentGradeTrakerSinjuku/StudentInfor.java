package JavaPractise.studentGradeTrakerSinjuku;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import JavaPractise.utilities.Utility;


public class StudentInfor {
    
    
    public static  int getRow(Scanner scanner , String message1 ,String message2 ){
        while (true) {
            System.out.println(message1);

             String input = scanner.next();

             if(Utility.isInteger(input)){
                return Integer.parseInt(input);
             }else{
                System.out.println(message2);
             }
        }
    }

        //calculate average per student 
    public static double[] calculateAverageOfStudents (String[] students,String[] subjects,int[][] marks){
        double[] studentAverages = new double[students.length];
        for(int i = 0; i < students.length; i++ ){
            int sum = 0;

            for(int j = 0; j < subjects.length; j++ ){
             sum +=  marks[i][j];
                
            }
             studentAverages[i] = (double) sum / subjects.length;
        }


        return studentAverages ;
    }

            //calculate average per subject 

    public static double[] calculateAverageOfSubject (String[] students,String[] subjects,int[][] marks){
        double[] subjectAverages = new double[subjects.length];
        for(int i = 0; i < subjects.length; i++ ){
            int sum = 0;
            for(int j = 0; j < students.length; j++ ){
             sum +=  marks[j][i];
                
            }
             subjectAverages[i] = (double) sum / students.length;
        }

        return subjectAverages ;
    }

    //get max marks obtained by students   

    public static  List<String> getMaxMarks(String[] students,String[] subjects,int[][] marks){
         List<String> maxAchievers = new ArrayList<>(); 
        for(int i= 0; i < students.length; i++ ){
            for(int j= 0; j < students.length; i++ ){

            }
        }


        return maxAchievers;
    }

}
