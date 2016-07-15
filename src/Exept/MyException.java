package Exept;

/**
 * Created by SCIP on 15.07.2016.
 */
public class MyException extends Exception {

    public MyException(String massage) {
        System.out.println("Catch MyException: " + massage);
    }
}
