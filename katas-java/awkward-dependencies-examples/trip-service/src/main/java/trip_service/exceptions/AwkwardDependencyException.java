package trip_service.exceptions;

public class AwkwardDependencyException extends RuntimeException {

    private static final long serialVersionUID = -4584041339906109902L;

    public AwkwardDependencyException(String message) {
        super(message);
    }
}
