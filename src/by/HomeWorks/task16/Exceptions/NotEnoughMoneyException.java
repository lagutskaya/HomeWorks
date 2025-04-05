package by.HomeWorks.task16.Exceptions;

public class NotEnoughMoneyException extends RuntimeException {
    private String errorCode;

    public NotEnoughMoneyException(String errorCode) {
        super("Not enough money");
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
