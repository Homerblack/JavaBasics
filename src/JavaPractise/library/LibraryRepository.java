package src.JavaPractise.library;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class LibraryRepository {

    private static final String FILE_PATH = "members.csv";

    /// //Register Member
    /// Member's are registered in csv file
    public void printCsv(LibraryMember member) {

        File user = new File(FILE_PATH);

        boolean writeHeader = !user.exists() || user.length() == 0;
        ;

        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_PATH, true))) {
            if (writeHeader) {
                writer.println("MemberID,Name,Age,Sex,Address");
            }
            writer.printf("%d,%s,%d,%d,%s%n",
                    member.getMemberId(),
                    member.getName(),
                    member.getAge(),
                    member.getSex(),
                    member.getAddress());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /// exporting member list from the Csv

    public List<LibraryMember> getMembers() {
        List<LibraryMember> members = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_PATH))) {
            String headerLine = bufferedReader.readLine();
            if (headerLine == null) return members;
            // Split header and create a map: column name -> index
            String[] headers = headerLine.split(",");
            Map<String, Integer> columnIndex = new HashMap<>();
            for (int i = 0; i < headers.length; i++) {
                columnIndex.put(headers[i].trim(), i);
            }
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] fields = line.split(",");

                // Get values dynamically by column name
                int memberId = Integer.parseInt(fields[columnIndex.get("MemberID")]);
                String name = fields[columnIndex.get("Name")];
                int age = Integer.parseInt(fields[columnIndex.get("Age")]);
                int sex = Integer.parseInt(fields[columnIndex.get("Sex")]);
                String address = fields[columnIndex.get("Address")];

                LibraryMember libraryMember = new LibraryMember.Member()
                        .name(name)
                        .age(age)
                        .sex(sex)
                        .address(address)
                        .memberId(memberId)
                        .build();

                members.add(libraryMember);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
        return members;
        }
    }
