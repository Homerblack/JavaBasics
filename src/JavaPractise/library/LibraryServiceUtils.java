package src.JavaPractise.library;

import src.JavaPractise.utilities.Utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryServiceUtils {

    LibraryRepository libraryRepository = new LibraryRepository();

    List<LibraryMember> registeredUsers = libraryRepository.getMembers();


    private List<LibraryMember> members = new ArrayList<>();


    public void addMember(LibraryMember member) {
        members.add(member);
        System.out.println(member.getName());
        System.out.println(member.getMemberId());
        System.out.println(member.getSex());
        System.out.println(member.getAge());
        System.out.println(member.getAddress());
    }


    //check if the entered value is empty
    public boolean isEmpty(String name) {
        return name.isEmpty();
    }

    //checking the entered name is empty or not
    public static String user(Scanner scanner, String loginMessage, String stars, String loginErrorMessage, String LoginCorrectMessage) {
        while (true) {
            System.out.println(loginMessage);
            System.out.println(stars);
            String enteredName = scanner.nextLine();
            if (enteredName.isEmpty()) {
                System.out.println(loginErrorMessage);
                continue;
            } else {
                System.out.println(LoginCorrectMessage + enteredName);
                System.out.println(stars);
                return enteredName;
            }

        }
    }

    //checking the entered name is empty or not
    public static int Checkid(Scanner scanner, String loginMessage, String stars, String loginErrorMessage, String LoginCorrectMessage) {
        while (true) {
            System.out.println(loginMessage);
            System.out.println(stars);
            String enteredId = scanner.next();
            if (!Utility.isInteger(enteredId)) {
                System.out.println(loginErrorMessage);
                continue;
            } else {
                System.out.println(LoginCorrectMessage + enteredId);
                System.out.println(stars);
                return Integer.parseInt(enteredId);
            }


        }
    }

    /// checking Registered user or not

    public boolean isUser(String name, int memberId){
        List<LibraryMember> members = libraryRepository.getMembers();

        for(LibraryMember member : members){
            if(member.getName().equals(name) && member.getMemberId() == memberId){
                return true;
            }
        }
        return false;
    }


    /// Setting member id
    int NewMember = registeredUsers.stream().mapToInt(LibraryMember::getMemberId).max().orElse(0)+1;




    /// displaying all the books


}







