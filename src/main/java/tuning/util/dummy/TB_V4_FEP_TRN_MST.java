package tuning.util.dummy;

import java.sql.*;

public class TB_V4_FEP_TRN_MST extends Thread {

    int count = 0;

    public synchronized int Count() {
        return ++count;
    }

    @Override
    public void run() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (Exception e) {
            e.printStackTrace();
        }

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        PreparedStatement preparedStatement = null;

        Date date;
        CreateUuid createUuid = new CreateUuid();
        String uuid;
        int count = 0;
        try {

            for (int i = 0; i < 1000; i++) {
                date = new Date();
                uuid = createUuid.getUuid();
                connection = DriverManager.getConnection("jdbc:oracle:thin:@1.234.25.141:11521:direadb", "mrzcpt2", "mrzcpt2");
//            preparedStatement = connection.prepareStatement("INSERT INTO MRZCPT2.TB_V4_FEP_TRN_MST (TRN_DAY, TRN_DT, TRN_TM, TRN_MST_SEQ, TRN_GID, ED_DT, ED_HMS, IF_ID, IF_NM, IF_PTRN, COM_IF_SEP_CD, COM_FLOW_ID, COM_RULE_ID, SRC_CHAN_ID, SRC_CHAN_IP, TGT_CHAN_ID, TGT_CHAN_IP, PROC_NODE, PROC_STS, ERR_CNTN, BKND_SVC_CD, BRC, TRMNO, CHAN_TP_CD, TOT_CNT, SUC_CNT, FAIL_CNT, BAT_FL_REC_SZE, EXECUTE_PROC, FILTER1, FILTER2, FILTER3, FILTER4, FILTER5, FILTER6, TRN_COR_GID, SBCD, USR_NO, TRN_SUC_DT) VALUES ('19', '20211019', '165026860', '790ae5e7-dab6-4ff9-8ba0-bdd88cf3a7e7', null, '20211019', '165026905', 'TEST_TMP_0100', '테스트 인터페이스', 'T2T', 'KONA', 'TCP_S2S_F2', null, 'TST01', '/1.234.25.131:19895', 'TST02', '127.0.0.1:19896', '01', '1005', 'CMD 설정파일이 존재하지 않습니다. 디렉토리를 확인하여주십시오.채널[TST01] 기동여부를 확인하여 주십시오.', null, null, null, null, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, '1815')");
                preparedStatement = connection.prepareStatement("INSERT INTO MRZCPT2.TB_V4_FEP_TRN_MST (TRN_DAY, TRN_DT, TRN_TM, TRN_MST_SEQ, TRN_GID, ED_DT, ED_HMS, IF_ID, IF_NM, IF_PTRN, COM_IF_SEP_CD, COM_FLOW_ID, COM_RULE_ID, SRC_CHAN_ID, SRC_CHAN_IP, TGT_CHAN_ID, TGT_CHAN_IP, PROC_NODE, PROC_STS, ERR_CNTN, BKND_SVC_CD, BRC, TRMNO, CHAN_TP_CD, TOT_CNT, SUC_CNT, FAIL_CNT, BAT_FL_REC_SZE, EXECUTE_PROC, FILTER1, FILTER2, FILTER3, FILTER4, FILTER5, FILTER6, TRN_COR_GID, SBCD, USR_NO, TRN_SUC_DT) VALUES (?, ?, ?, ?, null, ?, ?, 'TEST_TMP_0100', '테스트 인터페이스', 'T2T', 'KONA', 'TCP_S2S_F2', null, 'TST01', '/1.234.25.131:19895', 'TST02', '127.0.0.1:19896', '01', '1005', 'CMD 설정파일이 존재하지 않습니다. 디렉토리를 확인하여주십시오.채널[TST01] 기동여부를 확인하여 주십시오.', null, null, null, null, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, '1815')");
                preparedStatement.setString(1, date.getDd());
                preparedStatement.setString(2, date.getYYYYMMdd());
                preparedStatement.setString(3, date.getHHMMDDssSSS());
                preparedStatement.setString(4, uuid);
                preparedStatement.setString(5, date.getYYYYMMdd());
                preparedStatement.setString(6, Integer.toString(Integer.parseInt(date.getHHMMDDssSSS()) + 100));
                preparedStatement.executeUpdate();

                System.out.println("[" + Count() + "] " + date.getHHMMDDssSSS() + ", uuid: " + uuid);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
//    public static void main(String[] args) {
//        try {
//            Class.forName("oracle.jdbc.driver.OracleDriver");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        Connection connection = null;
//        Statement statement = null;
//        ResultSet resultSet = null;
//
//        PreparedStatement preparedStatement = null;
//
//        Date date;
//        CreateUuid createUuid = new CreateUuid();
//        String uuid;
//        int count = 0;
//        try {
//
//            for (int i = 0; i < 10; i++) {
//                date = new Date();
//                uuid = createUuid.getUuid();
//                connection = DriverManager.getConnection("jdbc:oracle:thin:@1.234.25.141:11521:direadb", "mrzcpt2", "mrzcpt2");
////            preparedStatement = connection.prepareStatement("INSERT INTO MRZCPT2.TB_V4_FEP_TRN_MST (TRN_DAY, TRN_DT, TRN_TM, TRN_MST_SEQ, TRN_GID, ED_DT, ED_HMS, IF_ID, IF_NM, IF_PTRN, COM_IF_SEP_CD, COM_FLOW_ID, COM_RULE_ID, SRC_CHAN_ID, SRC_CHAN_IP, TGT_CHAN_ID, TGT_CHAN_IP, PROC_NODE, PROC_STS, ERR_CNTN, BKND_SVC_CD, BRC, TRMNO, CHAN_TP_CD, TOT_CNT, SUC_CNT, FAIL_CNT, BAT_FL_REC_SZE, EXECUTE_PROC, FILTER1, FILTER2, FILTER3, FILTER4, FILTER5, FILTER6, TRN_COR_GID, SBCD, USR_NO, TRN_SUC_DT) VALUES ('19', '20211019', '165026860', '790ae5e7-dab6-4ff9-8ba0-bdd88cf3a7e7', null, '20211019', '165026905', 'TEST_TMP_0100', '테스트 인터페이스', 'T2T', 'KONA', 'TCP_S2S_F2', null, 'TST01', '/1.234.25.131:19895', 'TST02', '127.0.0.1:19896', '01', '1005', 'CMD 설정파일이 존재하지 않습니다. 디렉토리를 확인하여주십시오.채널[TST01] 기동여부를 확인하여 주십시오.', null, null, null, null, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, '1815')");
//                preparedStatement = connection.prepareStatement("INSERT INTO MRZCPT2.TB_V4_FEP_TRN_MST (TRN_DAY, TRN_DT, TRN_TM, TRN_MST_SEQ, TRN_GID, ED_DT, ED_HMS, IF_ID, IF_NM, IF_PTRN, COM_IF_SEP_CD, COM_FLOW_ID, COM_RULE_ID, SRC_CHAN_ID, SRC_CHAN_IP, TGT_CHAN_ID, TGT_CHAN_IP, PROC_NODE, PROC_STS, ERR_CNTN, BKND_SVC_CD, BRC, TRMNO, CHAN_TP_CD, TOT_CNT, SUC_CNT, FAIL_CNT, BAT_FL_REC_SZE, EXECUTE_PROC, FILTER1, FILTER2, FILTER3, FILTER4, FILTER5, FILTER6, TRN_COR_GID, SBCD, USR_NO, TRN_SUC_DT) VALUES (?, ?, ?, ?, null, ?, ?, 'TEST_TMP_0100', '테스트 인터페이스', 'T2T', 'KONA', 'TCP_S2S_F2', null, 'TST01', '/1.234.25.131:19895', 'TST02', '127.0.0.1:19896', '01', '1005', 'CMD 설정파일이 존재하지 않습니다. 디렉토리를 확인하여주십시오.채널[TST01] 기동여부를 확인하여 주십시오.', null, null, null, null, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, '1815')");
//                preparedStatement.setString(1, date.getDd());
//                preparedStatement.setString(2, date.getYYYYMMdd());
//                preparedStatement.setString(3, date.getHHMMDDssSSS());
//                preparedStatement.setString(4, uuid);
//                preparedStatement.setString(5, date.getYYYYMMdd());
//                preparedStatement.setString(6, Integer.toString(Integer.parseInt(date.getHHMMDDssSSS()) + 100));
//                preparedStatement.executeUpdate();
//
//                System.out.println("[" + ++count + "] " + date.getHHMMDDssSSS() + ", uuid: " + uuid);
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (resultSet != null) resultSet.close();
//                if (statement != null) statement.close();
//                if (connection != null) connection.close();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//    }


}
