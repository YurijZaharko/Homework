package Threads;

import java.util.Scanner;

/**
 * Created by SCIP on 13.07.2016.
 */
public class Scan {
    public int value = 0;
    static Scanner scanner = new Scanner(System.in);

    static synchronized int readInt(String text) {
        System.out.println(text);
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        }
        return 0;
    }

    synchronized void print(String text){
        System.out.print(text + " ");
    }

}
