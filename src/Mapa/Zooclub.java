package Mapa;

import java.util.*;

/**
 * Created by SCIP on 14.07.2016.
 */
public class Zooclub {
    private Map<Person, List<Pet>> map = new HashMap<>();

    public void addPerson(String name, int age){
        map.put(new Person(name, age), new ArrayList<>());
    }

    public void addPet(String name, int age,  String petName, String typePet){
        map.get(new Person(name, age)).add(new Pet(petName, Animals.valueOf(typePet)));
    }

    public void removePet(Person person){
        if (nullTest(person)) {
            map.get(person).clear();
        }else {
            System.out.println("No such Person");
        }
    }

    public void removePerson(Person person){
        if (nullTest(person)) {
            map.remove(person);
        }else {
            System.out.println("No such Person");
        }

    }

    public void removeSeveralPets(String typePet){
        Animals animals =  Animals.valueOf(typePet);
        Iterator<Map.Entry<Person, List<Pet>>> temp = map.entrySet().iterator();
        while (temp.hasNext()){
            Map.Entry<Person, List<Pet>> tempEntry = temp.next();
            List<Pet> tempList = tempEntry.getValue();
            Iterator<Pet> iterator = tempList.iterator();
            while (iterator.hasNext()){
                Pet pet = iterator.next();
                if(pet.getType().equals(animals)){
                    iterator.remove();
                }
            }
        }
    }

    public void print(){
        for (Map.Entry<Person, List<Pet>> entry: map.entrySet()){
            System.out.println(entry.getKey());
            if (!entry.getValue().isEmpty()){
                System.out.println("His pet list:");
                for (Pet pet: entry.getValue()) {
                    System.out.println(pet);
                }
            }else {
                System.out.println("He has no pet");
            }
            System.out.println();
        }
    }

    public boolean nullTest(Person person){
        return map.get(person) != null;
    }
}
