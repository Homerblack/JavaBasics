package src.JavaPractise.library;

import src.JavaPractise.utilities.Utility;

import java.util.Scanner;

public class LibraryMember {

    String message = "welcome to homers Library";

    private final String name;
    private final int age;
    private final int sex;
    private final String address;
    private final int memberId;

    /// library member mapping
    public LibraryMember(Member member) {
        this.name = member.name;
        this.age = member.age;
        this.sex = member.sex;
        this.address = member.address;
        this.memberId = member.memberId;
    }

    //getters for the members
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSex() {
        return sex;
    }

    public String getAddress() {
        return address;
    }

    public int getMemberId() {
        return memberId;
    }

    //setters for the library
    public static class Member {
        private String name;
        private int age;
        private int sex;
        private String address;
        private int memberId;

        public Member name(String name) {
            this.name = name;
            return this;
        }

        ;

        public Member age(int age) {
            this.age = age;
            return this;
        }

        ;

        public Member sex(int sex) {
            this.sex = sex;
            return this;
        }

        public Member address(String address) {
            this.address = address;
            return this;
        }

        public Member memberId(int memberId) {
            this.memberId = memberId;
            return this;
        }

        //building a library
        public LibraryMember build() {
            return new LibraryMember(this);
        }
    }

}

