package org.springframework.repositories;
import org.springframework.data.jpa.repository.*;
import org.springframework.entityes.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository{

    List <Account> findByBicIn(List <String> bic);
}
