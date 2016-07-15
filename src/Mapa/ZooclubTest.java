package Mapa;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by SCIP on 15.07.2016.
 */
public class ZooclubTest {
    Zooclub zooclub = new Zooclub();

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
        zooclub.getMap().clear();
    }

    @Test
    public void addPerson() throws Exception {
        String name = "Petro";
        int age = 20;
        Person expexted = new Person(name, age);
        zooclub.addPerson(name, age);
        assertTrue(zooclub.getMap().containsKey(expexted));
    }

    @Test
    public void addPet() throws Exception {
        String name = "Petro";
        int age = 20;
        Person person = new Person(name, age);
        zooclub.addPerson(name, age);

        String petName = "Frogy";
        String typePet = "DOG";
        Pet expected = new Pet(petName, Animals.DOG);
        zooclub.addPet(name, age, petName, typePet);
        assertTrue(zooclub.getMap().get(person).contains(expected));
    }

    @Test
    public void removePet() throws Exception {
        String name = "Petro";
        int age = 20;
        Person person = new Person(name, age);
        zooclub.addPerson(name, age);

        String petName = "Frogy";
        String typePet = "DOG";
        Pet expected = new Pet(petName, Animals.DOG);
        zooclub.addPet(name, age, petName, typePet);
        zooclub.removePet(person);
        assertFalse(zooclub.getMap().get(person).contains(expected));
    }

    @Test
    public void removePerson() throws Exception {
        String name = "Petro";
        int age = 20;
        Person person = new Person(name, age);
        zooclub.addPerson(name, age);
        zooclub.removePerson(person);
        assertTrue(zooclub.getMap().isEmpty());
    }

}