package de.resasimy.EveryEasy.Glossary.Repository;

import de.resasimy.EveryEasy.Glossary.Entity.Element;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElementRepository extends JpaRepository<Element, String>{

}
