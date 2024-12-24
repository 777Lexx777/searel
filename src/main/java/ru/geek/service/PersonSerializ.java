package ru.geek.service;

import ru.geek.entity.Person;

import java.io.*;

public class PersonSerializ {

    public void  serialPerson(Person person) {
        try {
            FileOutputStream outputStream = new FileOutputStream("src/main/resources/savePersonFile.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(person);
            objectOutputStream.close();
        } catch (IOException e){
            throw new RuntimeException(e);
        }

    }

    public void  deserialPerson(Person person) {
        try {
            FileInputStream fileInputStream = new FileInputStream("src/main/resources/savePersonFile.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Person personDeserial = (Person) objectInputStream.readObject();
            System.out.println("Изначальный объект "+ person + "| десериализованный объект " + personDeserial);
        }  catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
