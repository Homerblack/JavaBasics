package src.JavaPractise.library;

public class LibraryRegisterdUsers {

    private final String name;
    private final int memberID;

    public String getName() {
        return name;
    }

    public int getMemberID() {
        return memberID;
    }

    public LibraryRegisterdUsers(String name, int age) {
        this.name = name;
        this.memberID = age;
    }
}
