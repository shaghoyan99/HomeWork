package work.company.exception;

public class CompanyNotFoundException extends Exception {
    public CompanyNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public CompanyNotFoundException(Throwable cause) {
        super(cause);
    }

    public CompanyNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public CompanyNotFoundException(String message) {
        super(message);
    }

    public CompanyNotFoundException() {
    }
}
