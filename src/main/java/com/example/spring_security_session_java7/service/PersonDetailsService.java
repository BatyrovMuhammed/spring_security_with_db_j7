package com.example.spring_security_session_java7.service;

import com.example.spring_security_session_java7.entities.Person;
import com.example.spring_security_session_java7.reposity.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class PersonDetailsService implements UserDetailsService {

    @Autowired
    private PersonRepository personRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Person person = personRepository.getByEmailPerson(username);
        if (person == null) {
            throw new UsernameNotFoundException("User name not found exception!");
        }
        return person;
    }
}
