package Threads;

import java.util.Objects;

/**
 * Created by SCIP on 19.07.2016.
 */
public class RunnableThread implements Runnable {
    final private Object sync;
    private Scan scanner;

    public RunnableThread(Object sync, Scan scanner) {
        this.sync = sync;
        this.scanner = scanner;
    }

    @Override
    public void run() {
        int from = Scan.readInt("Enter From ");
        Thread.currentThread().setName("RunnableThread");
        scanner.print(Thread.currentThread().getName() + ": ");
        synchronized (sync) {
            for (int i = from - 1; i >= 0; i--) {
                scanner.print(Fibanachi.fibanachi(i) + " ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            scanner.value = 1;
            sync.notify();
        }
        System.out.println();
    }

}
