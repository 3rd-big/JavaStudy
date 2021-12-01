package thread.runnable;

import java.time.LocalTime;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        String result = "Called at " + LocalTime.now();
        System.out.println(result);
    }
}
