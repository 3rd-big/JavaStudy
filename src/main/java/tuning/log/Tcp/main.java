package tuning.log.Tcp;

import tuning.util.stopwatch.StopWatch;

public class main {

    public static void main(String[] args) {
//        StopWatch stopWatch = new StopWatch();
//        stopWatch.start();
        for (int i=0; i<2; i++){
            new Thread(new EchoClient("127.0.0.1", 17291)).start();
//            new Thread(new EchoClient("192.168.1.179", 17290)).start();
        }
//        stopWatch.stop();
//        System.out.println(stopWatch.toString());


    }
}
