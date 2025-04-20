package utils;

public class NoThisUserException extends RuntimeException{
    public NoThisUserException(String msg) {
        super(msg);
    }
}
