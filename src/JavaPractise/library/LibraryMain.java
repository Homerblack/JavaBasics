package src.JavaPractise.library;


import java.io.IOException;
import java.util.Scanner;

public class LibraryMain {
    public static void main(String[] args)  {


        LibraryService libraryService = new LibraryService();

        /// displaying home messages
        libraryService.getWelcomeMessage();

        /// running the program
        libraryService.runProgram();

    }
}