package src.JavaPractise.library;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BooksRepository {

    /// path fo the full library
    private static final String FILE_PATH_FULL = "fullLibrary.csv";

    /// path fo the half library
    private static final String FILE_PATH_HALF = "guestLibrary.csv";

    public List<Books> fullBooks(){
        List<Books> books = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_PATH_FULL))) {
            String headerLine = bufferedReader.readLine();
            if(headerLine == null){
                return books;
            }
            String[] headers = headerLine.split(",");
            Map<String, Integer> columnIndex = new HashMap<>();
            for(int i = 0; i < headers.length; i++){
                columnIndex.put(headers[i].trim(), i);
            }
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] fields = line.split(",");

                // Get values dynamically by column name
                int bookId = Integer.parseInt(fields[columnIndex.get("BookID")]);
                String title = fields[columnIndex.get("Title")];
                String author = fields[columnIndex.get("Author")];
                String category = fields[columnIndex.get("Category")];
                int publishedYear = Integer.parseInt(fields[columnIndex.get("PublishedYear")]);
                String pages = fields[columnIndex.get("Pages")];
                int isbn = Integer.parseInt(fields[columnIndex.get("ISBN")]);
                String availability = fields[columnIndex.get("Availability")];
                String description = fields[columnIndex.get("Description")];

                Books book = new Books( bookId,
                        title,
                        author,
                        category,
                        publishedYear,
                        pages,
                        isbn,
                        availability,
                        description);
                books.add(book);
            }

        }catch (IOException e) {
            e.printStackTrace();
        }
        return books;

    }

}
