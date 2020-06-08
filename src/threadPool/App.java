package threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author I335484
 * 
 * Thread is a pool of threads.
 * 
 *  Executors are capable of running asynchronous tasks and typically manage 
 *  a pool of threads, so we don't have to create new threads manually. All threads of the internal pool will be reused under the hood for
 *  revenant tasks, so we can run as many concurrent tasks as we want throughout the life-cycle of  our application with a single executor service
 *
 */

class Processor implements Runnable {

    private int id;

    public Processor(int id) {
        this.id = id;
    }

    public void run() {
        System.out.println("Starting: " + Thread.currentThread()+ id);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ignored) {
        }
        System.out.println("Completed: " + Thread.currentThread()+id);
    }
}

/**
 * @author I335484
 *
 */
public class App {

    /**
     * @param args
     */
    public static void main(String[] args) {
        /**
         * Created 2 threads, and assign tasks (Processor(i).run) to the threads
         */
        ExecutorService executor = Executors.newFixedThreadPool(2);//2 Threads
    
        //no of thread = 2
        //no of tasks = 5
        for (int i = 1; i <= 5; i++) { // call the (Processor(i).run) 2 times with 2 threads
            executor.submit(new Processor(i));// submit a task
        }
        
        /*
         Executors have to be stopped explicitly - otherwise they keep listening for new tasks.
         shutdown() waits for currently running tasks to finish 
         shutdownNow() interrupts all running tasks and shut the executor down immediately.
         * */
        executor.shutdown();// stop accepting any new task.
        System.out.println("All tasks submitted.");
       
        
        /*
         The executor shuts down softly by waiting a certain amount of time for termination of currently running tasks.
         After a maximum of 1 day the executor finally shuts down by interrupting all running tasks.
         */
        try {
            executor.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException ignored) {
        }
        System.out.println("All tasks completed.");
    }
}

