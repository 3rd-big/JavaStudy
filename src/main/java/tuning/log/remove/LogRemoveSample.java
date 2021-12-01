package tuning.log.remove;

import java.util.Vector;

public class LogRemoveSample {
    public Vector getVector() {
        Vector retVec = new Vector(10);

        if (LogFlag.printFlag) {
            System.out.format("LogRemoveSample.getVector(): size=%d\n", retVec.size());
        }

        return retVec;
    }
}
