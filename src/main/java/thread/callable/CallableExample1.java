package thread.callable;

import java.time.LocalTime;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableExample1 {

    static class MyCallable implements Callable<String>, java.util.concurrent.Callable {
        @Override
        public String call() throws Exception {
            String result = "Called at " + LocalTime.now();
            return result;
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable callable = new MyCallable();
        FutureTask futureTask = new FutureTask(callable);
        Thread thread = new Thread(futureTask);
        thread.start();

        System.out.println("result: " + futureTask.get());
    }
}
