package Mapa;

/**
 * Created by SCIP on 14.07.2016.
 */
public class Main {
    public static void main(String[] args) {
        Zooclub zooclub = new Zooclub();
        Menu menu = new Menu();
        Scann scan = new Scann();
        Saver saver = new Saver();
        Tools tools = new Tools("importExpor.txt");
        boolean isRun = true;

        saver.addToFile("File.txt", "test22324444444gggg");
        saver.writeInFile("File.txt", "test222");
        saver.readFromFile("File.txt");

        String name = "Petro";
        int age = 20;
        zooclub.addPerson(name, age);

        tools.exportObject(zooclub);
        System.out.println(zooclub);
        System.out.println(tools.importObject());
        zooclub.getMap().clear();


        while(isRun){
            switch (menu.mainMenu()){
                case 1:{
                    zooclub.addPerson(scan.readString("Person name"), scan.readInt("Person age"));
                    break;
                }
                case 2:{
                    zooclub.print();
                    Animals [] animalses = Animals.values();
                    for (Animals temp:animalses) {
                        System.out.print(temp + " ");
                    }
                    System.out.println();
                    zooclub.addPet(scan.readString("Person name"), scan.readInt("Person age"), scan.readString("Pet name"), scan.readString("Type of Pet"));
                    break;
                }
                case 3:{
                    zooclub.print();
                    zooclub.removePerson(new Person(scan.readString("Person name"), scan.readInt("Person age")));
                    break;
                }
                case 4:{
                    zooclub.print();
                    zooclub.removePet(new Person(scan.readString("Person name"), scan.readInt("Person age")));
                    break;
                }
                case 5:{
                    zooclub.print();
                    zooclub.removeSeveralPets(scan.readString("Type of Pet"));
                    break;
                }
                case 6:{
                    zooclub.print();
                    break;
                }
                default:{
                    isRun = false;
                    break;

                }
            }
        }
    }


}
