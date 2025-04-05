package by.HomeWorks.task16.Exceptions;

public class AccountNotFoundException extends RuntimeException {
    private String errorCode;

    public AccountNotFoundException(String errorCode) {
        super("Account not found");
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}