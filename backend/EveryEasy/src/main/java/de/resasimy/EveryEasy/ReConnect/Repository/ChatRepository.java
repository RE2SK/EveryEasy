package de.resasimy.EveryEasy.ReConnect.Repository;

import de.resasimy.EveryEasy.ReConnect.Entity.Chat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChatRepository extends JpaRepository<Chat, String> {

    List<Chat> findByParticipantId1(String userId);
    List<Chat> findByParticipantId2(String userId);

}
