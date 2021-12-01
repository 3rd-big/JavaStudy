package thread.callable;

import java.time.LocalTime;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample2 {
    static class MyCallable implements Callable<String> , java.util.concurrent.Callable {
        @Override
        public String call() throws Exception {
            String result = "Called at " + LocalTime.now();
            return result;
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable callable = new MyCallable();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> future = executorService.submit(callable);

        // 결과가 리턴되기를 기다림
        System.out.println("result: " + future.get());
    }
}
