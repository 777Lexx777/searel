package ru.geek.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import ru.geek.entity.Person;
import ru.geek.util.HibernateSessionFactoryUtil;

public class PersonDao {
    public Person findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Person.class, id);
    }

    public void save(Person person) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.persist(person);
        tx1.commit();
        session.close();
        System.out.println(person);
    }

    public void update(Person person) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(person);
        tx1.commit();
        session.close();
    }

    public void delete(Person person) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(person);
        tx1.commit();
        session.close();
    }
}
