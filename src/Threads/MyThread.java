package Threads;

/**
 * Created by SCIP on 19.07.2016.
 */
public class MyThread extends Thread{
    private final Object sync;
    private final Scan scanner;
    public MyThread(Object sync, Scan scanner){
        this.sync = sync;
        this.scanner = scanner;
    }

    @Override
    public void run(){
        int to = Scan.readInt("Enter To ");
        Thread.currentThread().setName("MyThread");
        synchronized (sync) {
            if (scanner.value == 0) {
                try {
                    sync.wait();
                } catch (InterruptedException ex) {
                    System.err.println("own:: Interrupted: "+ex.getMessage());
                }
            }
            scanner.print(Thread.currentThread().getName() + ": ");
            for (int i = 0; i < to; i++) {
                scanner.print(Fibanachi.fibanachi(i) + " ");
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println();
    }
}
