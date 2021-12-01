package tuning.util.dummy;

import tuning.util.stopwatch.StopWatch;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class createFile {

    public static void main(String[] args) {

        StopWatch stopWatch = new StopWatch();

        File file = new File("C:\\Users\\Seo\\Desktop\\Direa\\코나아이\\KONAI_8.txt");

        Date date;
        CreateUuid createUuid = new CreateUuid();
        String uuid;

        stopWatch.start();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (int i = 0; i < 1000; i++) {
                date = new Date();
//                String text = "INSERT INTO MRZCPT2.TB_V4_FEP_TRN_MST (TRN_DAY, TRN_DT, TRN_TM, TRN_MST_SEQ, TRN_GID, ED_DT, ED_HMS, IF_ID, IF_NM, IF_PTRN, COM_IF_SEP_CD, COM_FLOW_ID, COM_RULE_ID, SRC_CHAN_ID, SRC_CHAN_IP, TGT_CHAN_ID, TGT_CHAN_IP, PROC_NODE, PROC_STS, ERR_CNTN, BKND_SVC_CD, BRC, TRMNO, CHAN_TP_CD, TOT_CNT, SUC_CNT, FAIL_CNT, BAT_FL_REC_SZE, EXECUTE_PROC, FILTER1, FILTER2, FILTER3, FILTER4, FILTER5, FILTER6, TRN_COR_GID, SBCD, USR_NO, TRN_SUC_DT) VALUES ('" + date.getDd() +"', '" + date.getYYYYMMdd() + "', '" + date.getHHMMDDssSSS() + "', '"+createUuid.getUuid()+"', null, '"+date.getYYYYMMdd()+"', '"+Integer.toString(Integer.parseInt(date.getHHMMDDssSSS()) + 100)+"', 'TEST_TMP_0100', '테스트 인터페이스', 'T2T', 'KONA', 'TCP_S2S_F2', null, 'TST01', '/1.234.25.131:19895', 'TST02', '127.0.0.1:19896', '01', '1005', 'CMD 설정파일이 존재하지 않습니다. 디렉토리를 확인하여주십시오.채널[TST01] 기동여부를 확인하여 주십시오.', null, null, null, null, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, '1815')";
                String text = "INSERT INTO KONAI.TB_V4_FEP_TRN_MST (TRN_DAY, TRN_DT, TRN_TM, TRN_MST_SEQ, TRN_GID, ED_DT, ED_HMS, IF_ID, IF_NM, IF_PTRN, COM_IF_SEP_CD, COM_FLOW_ID, COM_RULE_ID, SRC_CHAN_ID, SRC_CHAN_IP, TGT_CHAN_ID, TGT_CHAN_IP, PROC_NODE, PROC_STS, ERR_CNTN, BKND_SVC_CD, BRC, TRMNO, CHAN_TP_CD, TOT_CNT, SUC_CNT, FAIL_CNT, BAT_FL_REC_SZE, EXECUTE_PROC, FILTER1, FILTER2, FILTER3, FILTER4, FILTER5, FILTER6, TRN_COR_GID, REQ_HEADER_DATA, RES_HEADER_DATA) VALUES ('" + date.getDd() +"', '" + date.getYYYYMMdd() + "', '" + date.getHHMMDDssSSS() + "', '"+createUuid.getUuid()+"', null, '"+date.getYYYYMMdd()+"', '"+Integer.toString(Integer.parseInt(date.getHHMMDDssSSS()) + 100)+"', 'KONAHT_BCOTA1_REQ', '코나아이-BC카드 H2A 요청 업무', 'T2T', '8100', 'H2TA_REQ', null, 'KONAHT', null, 'BCOTA1', null, '01', 'OK', null, null, null, null, null, 0, 0, 0, 0, null, null, null, null, null, null, null, '20201102092833dev138CRUZ0761', null, null)";
                writer.append(text + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            stopWatch.stop();
            System.out.println(stopWatch.getS() + "초");
        }


    }
}
