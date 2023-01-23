package design;

public class NameNotValidException extends Exception{
    NameNotValidException() {
        this("Your name cannot have any numbers in it");
    }
    NameNotValidException(String message) {
        super(message);
    }
}
