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
public class Message {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private String id;

    private String chatId;

    private String content;

    Date date = new Date();

    private Timestamp timestamp = new Timestamp(date.getTime());
}
