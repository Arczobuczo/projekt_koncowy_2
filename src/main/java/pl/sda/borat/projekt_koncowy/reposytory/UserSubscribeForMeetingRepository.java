package pl.sda.borat.projekt_koncowy.reposytory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sda.borat.projekt_koncowy.entity.UserSubscribeForMeeting;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserSubscribeForMeetingRepository extends JpaRepository<UserSubscribeForMeeting, Long> {

    List<UserSubscribeForMeeting> findUserSubscribeForMeetingByMeetingEntityId(Long id);

    List<MeetingEntityRepository> findUserSubscribeForMeetingByUserEntityEmail(String email);



    boolean existsByMeetingEntityIdAndUserEntityEmail(Long idMeetingEntity, String userEntityEmail);

    void deleteByMeetingEntityIdAndUserEntityEmail(Long idMeeting, String userEntityEmail);
}
