package org.example.dao;

import org.example.model.Person;
import org.example.model.PersonIdSequencer;

import java.util.ArrayList;
import java.util.List;

public class PersonDAOImpl implements PersonDAO {

    private List<Person> personStorage;

    public PersonDAOImpl(){
        personStorage = new ArrayList<>();
    }

    public Person persist(Person person) {
        if (person == null) throw new IllegalArgumentException(" person was null");
        person.setId(PersonIdSequencer.nextId());  //101
        personStorage.add(person);
        return person;
    }

    @Override
    public Person findById(Integer id) {
        if(id == null) throw new IllegalArgumentException(" id was null");
        for(Person person : personStorage ){

        }

        return null;
    }

    @Override
    public Person findByEmail(String email) {
        return null;
    }

    @Override
    public List<Person> findAll() {
        return null;
    }

    @Override
    public void remove(Integer id) {

    }


}
