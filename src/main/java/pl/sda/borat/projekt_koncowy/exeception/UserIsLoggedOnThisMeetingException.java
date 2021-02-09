package pl.sda.borat.projekt_koncowy.exeception;

public class UserIsLoggedOnThisMeetingException extends RuntimeException {

    private final String email;
    private final Long meetingId;

    public UserIsLoggedOnThisMeetingException(String email, Long meetingId) {
        this.email = email;
        this.meetingId = meetingId;
    }

    @Override
    public String getMessage() {
        return String.format("User: %s already is subscribe on this meeting %d.", email, meetingId);
    }
    public Long getMeetingId() {
        return meetingId;
    }
}
