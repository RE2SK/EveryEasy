package de.resasimy.EveryEasy.ReConnect.Repository;

import de.resasimy.EveryEasy.ReConnect.Entity.UserData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserData, String> {



}
