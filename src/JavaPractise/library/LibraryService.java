package src.JavaPractise.library;

import java.util.List;
import java.util.Scanner;

public class LibraryService {

    //messages at the beginning
    String message = "               welcome to homers Library";
    String dots = "-------------------------------------------------------------------";
    String stars = "*******************************************************************";
    String hash = "#####################################################################";


    String loginMessage = "               Enter Your Name:";
    String loginErrorMessage = "          Name cannot be empty:";
    String LoginCorrectMessage = "the name you entered is:  ";
    String memberID = "               Enter Your Member ID:";
    String loginErrorMemberID = "          Member ID has to be Integer OR double number";
    String LoginCorrectMemberID = "the Member ID you entered is:  ";
    String logInerror = "Wrong Credentials";

    Scanner scanner = new Scanner(System.in);

LibraryRepository libraryRepository = new LibraryRepository();

    /// getting welcome message
    public void getWelcomeMessage() {
        System.out.println(dots);
        System.out.println(message);
        System.out.println(dots);
    }


    /// options or the users and the guest
    public void runProgram() {
        System.out.println(dots);
        System.out.println("Type 1 to Login");
        System.out.println(hash);
        System.out.println(dots);
        System.out.println("Type 2 to Register");
        System.out.println(hash);
        System.out.println(dots);
        System.out.println("Type 2 to Continue as Guest, Guest have only limited Books");
        System.out.println(hash);

        System.out.println(stars);
        System.out.println("Please enter your Choice: ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            loginEntry();

        }else if (choice == 2) {
            registerUser();
        }else {
            System.out.println("Welcome guest:  ");
            System.out.println("There is no book now you will see all the books as long as we have all the books   ");
            displayAllBooks();
        }

    }

    /// For registration of member
    private void registerUser(){
        LibraryServiceUtils ls = new LibraryServiceUtils();
        System.out.println(hash);
        System.out.println("Please enter your information for registration: ");
        System.out.println(hash);
        System.out.println(dots);
        System.out.println(hash);
        System.out.println("Please enter your name: ");
        String name = scanner.next();
        System.out.println(hash);
        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();
        System.out.println(hash);
        System.out.println("Please enter your Address: ");
        String address = scanner.next();
        System.out.println(hash);
        System.out.println("Please enter your sex ");
        int sex = scanner.nextInt();

        int newMember = ls.NewMember;
        //using the Member list
        LibraryMember member = new LibraryMember.Member()
                .name(name)
                .age(age)
                .sex(sex)
                .address(address)
                .memberId(newMember)
                .build();

        // Now you can use the member object:
       LibraryServiceUtils libraryServiceUtils = new LibraryServiceUtils();
        LibraryRepository libraryRepository = new LibraryRepository();


        //adding member to the constructor
       libraryServiceUtils.addMember(member);

        //exporting csv
        libraryRepository.printCsv(member);

    }


    /// getting scanner input

    private void loginEntry() {

        LibraryMember.Member member = new LibraryMember.Member();

        LibraryServiceUtils libraryServiceUtils = new LibraryServiceUtils();

        //Setting the user's name
        String userName = libraryServiceUtils.user(scanner, loginMessage, stars, loginErrorMessage, LoginCorrectMessage);

        //Setting the Member ID
        int memberId =  libraryServiceUtils.Checkid(scanner, memberID, stars, loginErrorMemberID, LoginCorrectMemberID);

        /// login in logic

        LibraryRegisterdUsers ls = new LibraryRegisterdUsers(userName, memberId);

        if (!libraryServiceUtils.isUser(ls.getName(), ls.getMemberID())) {
            System.out.println(logInerror);
            System.out.println("You are not yet User");
            System.out.println("Welcome Guest");

        } else {
            System.out.println("Welcome :  " + userName);
        }


    }

    public void displayAllBooks() {
        BooksRepository booksRepository = new BooksRepository();
        List<Books> books = booksRepository.fullBooks();

        for (Books book : books) {
            System.out.println(hash);
            System.out.println(book.getBookId());
            System.out.println(book.getTitle());
            System.out.println(book.getAuthor());
            System.out.println(book.getCategory());
            System.out.println(book.getDescription());
            System.out.println(hash);

        }
    }
}
