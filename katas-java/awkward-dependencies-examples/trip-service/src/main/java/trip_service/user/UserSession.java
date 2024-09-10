package trip_service.user;

import trip_service.exceptions.AwkwardDependencyException;

public class UserSession {

    private static final UserSession userSession = new UserSession();

    private UserSession() {
    }

    public static UserSession getInstance() {
        return userSession;
    }

    public User getLoggedUser() {
        //  It gets a logged User from the session.
        // This shouldn't be executed in a unit test.
        // We throw an exception instead to avoid complicating the example with the real implementation code.
        throw new AwkwardDependencyException("UserSession.getLoggedUser() should not be called in an unit test");
    }
}

