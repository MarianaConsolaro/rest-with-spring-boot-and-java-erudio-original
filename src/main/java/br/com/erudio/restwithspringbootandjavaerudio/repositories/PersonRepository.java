package br.com.erudio.restwithspringbootandjavaerudio.repositories;



import br.com.erudio.restwithspringbootandjavaerudio.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;

//@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
// O JpaRepository irá nos prover um CRUD básico, com suas principais operações, exigindo um tipo que é o objeto e o id dele.
@Modifying
@Query("UPDATE Person p SET p.enabled = false WHERE p.id =:id")
void disablePerson(@Param("id") Long id);
}
