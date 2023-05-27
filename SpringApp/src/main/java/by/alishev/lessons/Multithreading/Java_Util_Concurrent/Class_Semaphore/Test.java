package by.alishev.lessons.Multithreading.Java_Util_Concurrent.Class_Semaphore;

import java.util.concurrent.*;


public class Test {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(200);
        Connection connection = Connection.getConnection();
        for (int i = 0; i <200 ; i++) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        connection.work();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.DAYS);

    }
}
//pattern Singleton
class Connection{
    private static Connection connection = new Connection();
    private int connectionsCount;
    private Semaphore semaphore = new Semaphore(10);
    private Connection(){
    }

    public static Connection getConnection(){
        return connection;
    }
    public void work() throws InterruptedException {
       semaphore.acquire();
       try {
           doWork();
       }finally {

           semaphore.release();
       }
    }

    private void doWork() throws InterruptedException {
    synchronized (this){
        connectionsCount++;
        System.out.println(connectionsCount);
    }
    Thread.sleep(5000);
    synchronized (this){
        connectionsCount--;
    }
    }

}
