package de.resasimy.EveryEasy.ReConnect.Repository;

import de.resasimy.EveryEasy.ReConnect.Entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepository extends JpaRepository<Message, String> {

    List<Message> findByChatId(String chatId);

}
