package de.resasimy.EveryEasy.Glossary.Entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Element {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private String id;

    private String name; //name of the word

    private String simpleDescription; //simple and easy to understand description

    private String extendedDescription; //extended and much detail description

    private String createdByEmail; //email of the user who created this Element

    private String state; //state = "public" || state = "private" |||| If public, everyone can access. If private, just the user who created can access

}
