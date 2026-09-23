package ExceptionsLearning;

public class SadUserException extends RuntimeException {
    public SadUserException(String message) {
        super(message);
    }
}
