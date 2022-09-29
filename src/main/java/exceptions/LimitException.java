public class LimitException extends RuntimeException {

    int attempts;

    public LimitException(final String message, final int attempts ) {
        super(message);
        this.attempts  = attempts ;
    }

    public String getDetailMessage() {
        return "Превышен лимит ошибок ввода: " + String.valueOf(attempts);
    }
}