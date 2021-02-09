package pl.sda.borat.projekt_koncowy.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@Table(name = "users_subscribe_for_meeting")
@Entity
public class UserSubscribeForMeeting{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @ManyToOne                                              //https://www.baeldung.com/jpa-many-to-many
    @JoinColumn(name = "user_id")
    private UserEntity userEntity;

    @ManyToOne                                              //https://www.baeldung.com/jpa-many-to-many
    @JoinColumn(name = "meetings_id")
    private MeetingEntity meetingEntity;

    private LocalDateTime localDateTime = LocalDateTime.now();

}
