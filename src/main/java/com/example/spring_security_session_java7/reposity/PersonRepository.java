package com.example.spring_security_session_java7.reposity;

import com.example.spring_security_session_java7.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    @Query("select p from Person p where p.email = :email")
    Person getByEmailPerson(@Param("email") String email);

}