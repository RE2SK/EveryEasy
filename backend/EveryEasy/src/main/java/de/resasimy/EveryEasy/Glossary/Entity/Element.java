package de.resasimy.EveryEasy.Glossary.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Element {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    private String name;

    private String simpleDescription;

    private String extendedDescription;

}
