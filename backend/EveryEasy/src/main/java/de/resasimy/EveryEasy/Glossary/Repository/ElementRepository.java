package de.resasimy.EveryEasy.Glossary.Repository;

import de.resasimy.EveryEasy.Glossary.Entity.Element;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ElementRepository extends JpaRepository<Element, String>{

    List<Element> findByCreatedByEmail(String email);

    List<Element> findByState(String status);
}
