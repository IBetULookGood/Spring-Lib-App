package com.example.FirstSecurityApp.repository;

import com.example.FirstSecurityApp.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {
    Optional<Person> findByUsername(String username);//здесь мы получаем Optional, то есть такой человек может быть найден или не может быть найден

}
