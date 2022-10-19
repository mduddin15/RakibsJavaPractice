package PracticeMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Book {
    public String name;
    public String authors;
    public String publisher;
}


public class ObjectAsParameterAndReturnType {

    public static void main(String[] args) {

      //  int a = sum(10, 5);

        Book webDevelopmentBook = createBookRecord(
          "Mastering Web Development",
          "Mahbubur Rahman, A. K M. Hasan",
                "Systech Publication"
        );

        String authorsOfWebDevelopmentBook = getAuthors(webDevelopmentBook);

        System.out.println(authorsOfWebDevelopmentBook);

    }

    public static String getAuthors(Book bookObj) {
        String authorsList = bookObj.authors;
        return authorsList;
    }

    public static Book createBookRecord(String bookName, String authors, String publisher) {
        Book bookObj = new Book();
        bookObj.name = bookName;
        bookObj.authors = authors;
        bookObj.publisher = publisher;

        return bookObj;
    }

}
