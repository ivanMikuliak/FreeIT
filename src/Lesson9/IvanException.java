package Lesson9;

public class IvanException extends Exception {
    private final String message;

    @Override
    public String getMessage() {
        return message;
    }

    public IvanException(String message) {
        this.message = message;

    }
}
