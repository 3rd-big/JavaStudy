package stopwatch;

public class StopWatchTestCode {
    public static void main(String[] args) throws Exception {
        StopWatch timer = new StopWatch(false);

        Thread.sleep(1000);

        timer.stop();

        System.out.println(timer.getElapsedNano());

        Thread.sleep(1000);

        System.out.println(timer.toString());
    }
}
