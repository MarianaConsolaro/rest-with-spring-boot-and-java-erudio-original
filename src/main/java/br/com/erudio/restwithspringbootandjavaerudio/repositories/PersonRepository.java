package br.com.erudio.restwithspringbootandjavaerudio.repositories;



import br.com.erudio.restwithspringbootandjavaerudio.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

//@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {}
// O JpaRepository irá nos prover um CRUD básico, com suas principais operações, exigindo um tipo que é o objeto e o id dele.

