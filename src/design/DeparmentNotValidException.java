package design;

public class DeparmentNotValidException extends Exception{
    DeparmentNotValidException() {
        this("not a valid department");
    }
    DeparmentNotValidException(String message) {
        super(message);
    }
}
