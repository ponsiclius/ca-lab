package use_case.logout;

/**
 * The Logout Interactor.
 */
public class LogoutInteractor implements LogoutInputBoundary {
    private LogoutUserDataAccessInterface userDataAccessObject;
    private LogoutOutputBoundary logoutPresenter;


    public LogoutInteractor(LogoutUserDataAccessInterface userDataAccessInterface,
                            LogoutOutputBoundary logoutOutputBoundary) {
        this.userDataAccessObject = userDataAccessInterface;
        this.logoutPresenter = logoutOutputBoundary;
        // TODO: save the DAO and Presenter in the instance variables.
    }

    @Override
    public void execute() {
        LogoutOutputData logoutputdata;
        String username = userDataAccessObject.getCurrentUsername();
        userDataAccessObject.setCurrentUsername("");

        logoutputdata = new LogoutOutputData(username);
        logoutPresenter.prepareSuccessView(logoutputdata);
        // TODO: implement the logic of the Logout Use Case
        // * set the current username to null in the DAO
        // * instantiate the `LogoutOutputData`, which needs to contain the username.
        // * tell the presenter to prepare a success view.
    }
}

