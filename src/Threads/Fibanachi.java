package Threads;

/**
 * Created by SCIP on 19.07.2016.
 */
public class Fibanachi {
    static synchronized int fibanachi(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        return fibanachi(n - 2) + fibanachi(n - 1);
    }
}
