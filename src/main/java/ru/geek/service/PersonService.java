package ru.geek.service;

import jakarta.transaction.Transactional;
import ru.geek.dao.PersonDao;
import ru.geek.entity.Person;

public class PersonService {
    PersonDao personDao = new PersonDao();

    public Person findPerson(int id) {
        return personDao.findById(id);
    }

    public void savePerson(Person person) {
        personDao.save(person);
    }

    public void updatePerson(Person person) {
        personDao.update(person);
    }

    public void deleteUser(Person person) {
        personDao.delete(person);
    }


}
