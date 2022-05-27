package de.resasimy.EveryEasy.ReConnect.Entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Getter
@Setter
public class Chat {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private String id;

    private String participantId1; //First user of chat
    private String participantId2; //Second user of chat

    Date date = new Date();

    private Timestamp timestamp = new Timestamp(date.getTime());

}
