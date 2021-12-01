package thread.runnable;

import java.time.LocalTime;

public class RunnableExample2 {
    public static void main(String[] args) {
        Thread thread = new Thread(
                () -> System.out.println("Lambda Runnable at " + LocalTime.now())
        );
        thread.start();
    }
}
