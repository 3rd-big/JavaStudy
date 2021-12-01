package stopwatch;

public class StopWatchAverage {
    long startTime;
    long elapsedTime = 0;
    double totalElapsedTime;
    long runCount = 0;
    String currentName;
    boolean threadFlag = false;

    /**
     * Ư���� �̸��� �������� ���� StopWatchAverage ��ü��
     * �����ϰ�, Timer �� �����Ѵ�.
     */
    public StopWatchAverage() {
        currentName = "";
        startTime = System.nanoTime();
    }

    /**
     * Thread �� ����ϴ��� ���θ� �����ϴ� ������
     * @param ThreadFlag Thread ��� ����
     */
    public StopWatchAverage(boolean threadFlag) {
        changeMessage("", true, true);
    }

    /**
     * �޽������� �����ϴ� ������
     * @param message �߰��� ����� �޽���
     */
    public StopWatchAverage(String message) {
        changeMessage(message, false, true);
    }

    /**
     * �޽����� Thread ��� ���θ� �Բ� �����ϴ� ������
     * @param message �߰��� ����� �޽���
     * @param threadFlag Thread ��뿩��
     */
    public StopWatchAverage(String message, boolean threadFlag) {
        changeMessage(message, threadFlag, true);
    }

    /**
     * StopWatch�� �ð� �����͸� �ʱ�ȭ�Ѵ�.
     */
    public void reset() {
        startTime = System.nanoTime();
        elapsedTime = 0;
        totalElapsedTime = 0;
        runCount = 0;
    }

    /**
     * �ð� ������ �Ѵ�.
     */
    public void start() {
        startTime = System.nanoTime();
        elapsedTime = 0;
    }

    /**
     * StopWatch �� ���߰� ���� �ð� �����
     * ArrayList�� ��´�.
     */
    public void stop() {
        elapsedTime = System.nanoTime() - startTime;
        totalElapsedTime += elapsedTime;
        runCount++;
    }

    /**
     * �޽����� �����Ѵ�.
     * @param message �߰��� ����� �޽���
     * @param threadFlag Thread ��뿩��
     * @param resetFlag  ��ü ������ StopWatch ���� ����
     */
    public void changeMessage(String message, boolean threadFlag, boolean resetFlag) {
        String threadName = "";
        this.threadFlag = threadFlag;
        if (threadFlag) {
            threadName = " ThreadName=" + Thread.currentThread().getName();
        }
        currentName = "[" + message + threadName + "]";
        if (resetFlag) {
            reset();
        }
    }

    /**
     * StopWatch�� ���߰� �������� (Ȥ�� �������) ����� �ð��� �����Ѵ�.
     * @return �������� ����� �и���
     */
    public double getElapsedMS() {
        if (elapsedTime == 0) {
            stop();
        }
        return elapsedTime / 1000000.0;
    }

    /**
     * StopWatch�� ���߰� �������� (Ȥ�� �������) ����� �ð��� �����Ѵ�.
     * @return �������� ����� ������
     */
    public double getElapsedNano() {
        if (elapsedTime == 0) {
            stop();
        }
        return elapsedTime;
    }

    /**
     * ������� ������ Ƚ��, ��ü ���� �ð��� ��,
     * ��� ���� �ð��� �и��� ������ �������ش�.
     * @See {@link java.lang.Object#toString()}
     * @return ���� Ƚ��, ��ü ���� �ð�, ��� ���� �ð�
     */
    public String toString() {
        if (elapsedTime == 0) {
            stop();
        }
        double elapsedAverage = totalElapsedTime / runCount;
        return currentName + "Run Count: " + runCount
                + " , Total: " + totalElapsedTime / 1000000.0
                + " ms, Average: " + elapsedAverage / 1000000.0
                + " ms";
    }
}
