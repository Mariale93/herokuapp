package co.com.choucair.certification.herokuapp.exceptions;

public class Error extends AssertionError {
    public static final String REGIST_USER = "El usuario ya se encuentra registrado";
    public Error(String message, Throwable cause) {
        super(message, cause);
    }
}
