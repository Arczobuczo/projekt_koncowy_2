package pl.sda.borat.projekt_koncowy.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Setter
@Getter
@Table(name = "meetings")
@Entity
public class MeetingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 1000)
    private String title;

    private LocalDateTime sinceDate;

    private LocalDateTime toDate;

    @Column(length = 999999)
    private String  body;

    @ManyToOne(fetch = FetchType.LAZY)                                   //https://kobietydokodu.pl/15-relacje-jeden-do-wielu-wiele-do-jednego/
    @JoinColumn(name = "user_entity_id")
    private UserEntity userEntity;

    @OneToMany(mappedBy = "meetingEntity")                              //https://www.baeldung.com/jpa-many-to-many
    private Set<UserSubscribeForMeeting> registrations = new HashSet<>();

}
