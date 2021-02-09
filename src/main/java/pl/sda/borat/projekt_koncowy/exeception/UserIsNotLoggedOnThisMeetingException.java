package pl.sda.borat.projekt_koncowy.exeception;

public class UserIsNotLoggedOnThisMeetingException extends RuntimeException {

    private String email;
    private Long meetingId;

    public UserIsNotLoggedOnThisMeetingException(String email, Long meetingId) {
        this.email = email;
        this.meetingId = meetingId;
    }

    @Override
    public String getMessage() {
        return String.format("User: %s isn't subscribe on this meeting %d.", email, meetingId);
    }



    public  Long getMeetingId() {
        return meetingId;
    }
}
