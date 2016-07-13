package Com;

import java.util.Scanner;

/**
 * Created by SCIP on 13.07.2016.
 */
public class Scan {
    Scanner scanner = new Scanner(System.in);

    String readString(String text) {
        System.out.println(text);
        return scanner.next();
    }

    int readInt(String text) {
        System.out.println(text);
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        }
        return 0;
    }

}
