package OOP.PracticeToString;

public class Library {
    private String libraryName;
    private String location;
    private int bookNumber;
    private String establishedDate;

    public Library(String libraryName) {
        this.libraryName = libraryName;
    }

    public Library(String libraryName, String location, int bookNumber) {
        this.libraryName = libraryName;
        this.location = location;
        this.bookNumber = bookNumber;
    }

    public Library(String libraryName, String location, int bookNumber, String establishedDate) {
        this.libraryName = libraryName;
        this.location = location;
        this.bookNumber = bookNumber;
        this.establishedDate = establishedDate;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public String getLocation() {
        return location;
    }

    public int getBookNumber() {
        return bookNumber;
    }

    public String getEstablishedDate() {
        return establishedDate;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setBookNumber(int bookNumber) {
        this.bookNumber = bookNumber;
    }

    public void setEstablishedDate(String establishedDate) {
        this.establishedDate = establishedDate;
    }


    @Override
    public String toString() {
        return "Library{" +
                "libraryName='" + libraryName + '\'' +
                ", location='" + location + '\'' +
                ", bookNumber=" + bookNumber +
                ", establishedDate='" + establishedDate + '\'' +
                '}';
    }
}
