package lesson7;

public class IncorrectSideException extends Exception {
    public IncorrectSideException() {
    }

    public IncorrectSideException(String message) {
        super(message);
    }

    public IncorrectSideException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectSideException(Throwable cause) {
        super(cause);
    }

    public IncorrectSideException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
