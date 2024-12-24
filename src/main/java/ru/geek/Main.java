package ru.geek;

import ru.geek.entity.Person;
import ru.geek.service.PersonSerializ;
import ru.geek.service.PersonService;

public class Main {
    public static void main(String[] args) {
        PersonService personService = new PersonService();
        Person person = new Person(36,"Ариф");
        PersonSerializ personSerializ = new PersonSerializ();
        //personSerializ.serialPerson(person);
        personSerializ.deserialPerson(person);
        //System.out.println("Hello world!");
        personService.savePerson(person);
    }
}