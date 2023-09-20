package Basic;

import java.time.LocalDate; // import the LocalDate class
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Date {
        public static void main(String[] args) {
            LocalDate myObj1 = LocalDate.now(); // Create a date object
            System.out.println(myObj1); // Display the current date



            LocalTime myObj2 = LocalTime.now();
            System.out.println(myObj2);



            LocalDateTime myObj = LocalDateTime.now();
            System.out.println(myObj);



            LocalDateTime myDateObj = LocalDateTime.now();
            System.out.println("Before formatting: " + myDateObj);
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

            String formattedDate = myDateObj.format(myFormatObj);
            System.out.println("After formatting: " + formattedDate);



            LocalDateTime myDateObj2 = LocalDateTime.now();
            System.out.println("Before formatting: " + myDateObj2);


            DateTimeFormatter myFormatObj3 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

            String formattedDate3 = myDateObj2.format(myFormatObj);
            System.out.println("After formatting: " + formattedDate3);

        }
    }


