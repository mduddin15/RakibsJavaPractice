package OOP.PracticeMethodAndConstructor;

public class Book {

    public String bookName;
    public String authorName;
    public String publisher;
    public int isbn;

    public void printBookName() {
        System.out.println("Book Name: "+ bookName);
    }

    public void printAuthorName() {
        System.out.println("Author: "+ authorName);
    }

    public String printAllInfor(Book obj){
        return obj.bookName + " " + obj.authorName + " "+ obj.isbn;
    }

    public static boolean isDuplicateBook(Book obj1, Book obj2) {
        if (obj1.bookName == obj2.bookName) {
            return true;
        } else {
            return false;
        }
    }

    public int getISBN() {
        return isbn;
    }

    public static void main(String[] args) {

        Book myBook = new Book();
        myBook.bookName = "Padma Nadir Majhi";
        myBook.authorName = "Manik Bandhapaddhay";
        myBook.isbn = 2343243;


        Book myBook2 = new Book();
        myBook2.bookName = "Padma Nadir Majhi 2";
        myBook2.authorName = "Manik Bandhapaddhay";
        myBook2.isbn = 2343243;

        System.out.println(myBook.getISBN());
        myBook.printBookName();
        myBook.printAuthorName();

        System.out.println(myBook.printAllInfor(myBook));

        System.out.println(Book.isDuplicateBook(myBook, myBook2));


    }

}
