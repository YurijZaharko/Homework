package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by SCIP on 19.07.2016.
 */
public class Main {
    private static final ExecutorService SERVICE = Executors.newScheduledThreadPool(2);
    public static void main(String[] args) {
        Object sync = new Object();
        Scan scanner = new Scan();
        MyThread myThread = new MyThread(sync, scanner);
        RunnableThread runnable = new RunnableThread(sync, scanner);

        SERVICE.execute(myThread);
        SERVICE.execute(runnable);
        SERVICE.shutdown();




    }


}
