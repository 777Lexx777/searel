package ru.geek.entity;

import static jakarta.persistence.GenerationType.IDENTITY;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.proxy.HibernateProxy;

@Entity
@Table(name = "person")
@Getter
@Setter
public class Person implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @EqualsAndHashCode.Include
    private int id;
    private int age;
    @Column(name = "FULL_NAME")
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Person() {

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        return id == person.id && age == person.age && Objects.equals(name, person.name);
    }
//    @Override
//    public final boolean equals(Object o) {
//        if (this == o) {
//            return true;
//        }
//        if (o == null) {
//            return false;
//        }
//        Class<?> oEffectiveClass = o instanceof HibernateProxy
//            ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass()
//            : o.getClass();
//        Class<?> thisEffectiveClass = this instanceof HibernateProxy
//            ? ((HibernateProxy) this).getHibernateLazyInitializer()
//            .getPersistentClass() : this.getClass();
//        if (thisEffectiveClass != oEffectiveClass) {
//            return false;
//        }
//        Person person = (Person) o;
//        return getId() != null && Objects.equals(getId(), person.getId());
//    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy
            ? ((HibernateProxy) this).getHibernateLazyInitializer()
            .getPersistentClass().hashCode() : getClass().hashCode();
    }
}
