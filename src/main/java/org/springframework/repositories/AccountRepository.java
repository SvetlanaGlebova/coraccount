package org.springframework.repositories;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.entityes.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository{

    @Query("SELECT a FROM Account a WHERE a.bic IN :bics")

    List <Account> findByBicIn(@Param("bics") List <String> bic);
}
