package src.JavaPractise.constructorPractiseOutOfList;

import java.util.Scanner;

public class ConstructorService {
    public void start() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("write name");
        String name = scanner.nextLine();

        //setting age
        System.out.println("write age ");
        int age = scanner.nextInt();

        //setting age
        System.out.println("write isStudent ");
        boolean isStudent = scanner.nextBoolean();

        ConstructorConstructor s = new ConstructorConstructor.Homer()
                .name(name)
                .build();

        String Player = s.getName();

        System.out.println(Player);

        scanner.close();
    }
}

