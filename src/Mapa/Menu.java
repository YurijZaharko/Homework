package Mapa;

import Com.Scan;

/**
 * Created by SCIP on 14.07.2016.
 */
public class Menu {
    Scann scan = new Scann();

    private void print(String massage){
        System.out.println(massage);
    }

    public int mainMenu(){
        print("Main menu");
        print("1. Add person");
        print("2. Add pet");
        print("3. Remove person");
        print("4. Remove pet");
        print("5. Remove several pet");
        print("6. Print zooclub");
        print("0. exit");
        return scan.readInt("Choose number");
    }
}
