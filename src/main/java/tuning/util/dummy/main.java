package tuning.util.dummy;

public class main {
    public static void main(String[] args) {

//        Runnable mst = new TB_V4_FEP_TRN_MST();
//        Thread thread = new Thread(mst);
//        thread.start();



        int threadCount = 10;
        TB_V4_FEP_TRN_MST[] threads = new TB_V4_FEP_TRN_MST[threadCount];

        for (int i = 0; i < threadCount; i++) {
            threads[i] = new TB_V4_FEP_TRN_MST();
            threads[i].start();
        }

    }
}
