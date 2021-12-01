package tuning.util.dummy;

import tuning.util.stopwatch.StopWatch;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class createFile4 {

    public static void main(String[] args) {

        StopWatch stopWatch = new StopWatch();

        File file = new File("C:\\Users\\Seo\\Desktop\\Direa\\코나아이\\KONAI_19.txt");

        Date date;
        CreateUuid createUuid = new CreateUuid();
        String uuid;
        int TRN_DTL_SEQ = 15700000;
        String gid;
        int gidNumber = 1000000000;

        stopWatch.start();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (int i = 0; i < 2000000; i++) {
                date = new Date();
                uuid = createUuid.getUuid();
                gid = "";
                gid = gid + date.getYYYYMMdd() + date.getHHMMDDssSSS() + "01EXT" + Integer.toString(++gidNumber);

//                String text = "INSERT INTO MRZCPT2.TB_V4_FEP_TRN_MST (TRN_DAY, TRN_DT, TRN_TM, TRN_MST_SEQ, TRN_GID, ED_DT, ED_HMS, IF_ID, IF_NM, IF_PTRN, COM_IF_SEP_CD, COM_FLOW_ID, COM_RULE_ID, SRC_CHAN_ID, SRC_CHAN_IP, TGT_CHAN_ID, TGT_CHAN_IP, PROC_NODE, PROC_STS, ERR_CNTN, BKND_SVC_CD, BRC, TRMNO, CHAN_TP_CD, TOT_CNT, SUC_CNT, FAIL_CNT, BAT_FL_REC_SZE, EXECUTE_PROC, FILTER1, FILTER2, FILTER3, FILTER4, FILTER5, FILTER6, TRN_COR_GID, SBCD, USR_NO, TRN_SUC_DT) VALUES ('" + date.getDd() +"', '" + date.getYYYYMMdd() + "', '" + date.getHHMMDDssSSS() + "', '"+createUuid.getUuid()+"', null, '"+date.getYYYYMMdd()+"', '"+Integer.toString(Integer.parseInt(date.getHHMMDDssSSS()) + 100)+"', 'TEST_TMP_0100', '테스트 인터페이스', 'T2T', 'KONA', 'TCP_S2S_F2', null, 'TST01', '/1.234.25.131:19895', 'TST02', '127.0.0.1:19896', '01', '1005', 'CMD 설정파일이 존재하지 않습니다. 디렉토리를 확인하여주십시오.채널[TST01] 기동여부를 확인하여 주십시오.', null, null, null, null, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, '1815')";
                //INSERT INTO KONAI2.TB_V4_FEP_TRN_MST (TRN_DAY, TRN_DT, TRN_TM, TRN_MST_SEQ, TRN_GID, ED_DT, ED_HMS, IF_ID, IF_NM, IF_PTRN, COM_IF_SEP_CD, COM_FLOW_ID, COM_RULE_ID, SRC_CHAN_ID, SRC_CHAN_IP, TGT_CHAN_ID, TGT_CHAN_IP, PROC_NODE, PROC_STS, ERR_CNTN, BKND_SVC_CD, BRC, TRMNO, CHAN_TP_CD, TOT_CNT, SUC_CNT, FAIL_CNT, BAT_FL_REC_SZE, EXECUTE_PROC, FILTER1, FILTER2, FILTER3, FILTER4, FILTER5, FILTER6, TRN_COR_GID, SBCD, USR_NO, TRN_SUC_DT) VALUES ('18', '20211118', '112859503', '1d4f58b6-5b65-4bd1-baa9-eaa31d3a4bd8', '2021111811285949001EXT0000055390', '20211118', '112900542', 'OCIS_0200836', '[MyData_할부]계좌목록조회', 'T2T', '0200836', 'MRZ_MYD_UT', 'OCIS_0200836', 'OCIS', '/1.234.25.131:31100', 'OCO2', ':', '01', '1809', '[OCO2] 정의되지않은 Exception 발생.host : http://1.234.25.131:23105Exception[Connection to http://1.234.25.131:23105 refused]', null, null, null, null, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, '1087');

                String mstData = "INSERT INTO KONAI2.TB_V4_FEP_TRN_MST (TRN_DAY, TRN_DT, TRN_TM, TRN_MST_SEQ, TRN_GID, ED_DT, ED_HMS, IF_ID, IF_NM, IF_PTRN, COM_IF_SEP_CD, COM_FLOW_ID, COM_RULE_ID, SRC_CHAN_ID, SRC_CHAN_IP, TGT_CHAN_ID, TGT_CHAN_IP, PROC_NODE, PROC_STS, ERR_CNTN, BKND_SVC_CD, BRC, TRMNO, CHAN_TP_CD, TOT_CNT, SUC_CNT, FAIL_CNT, BAT_FL_REC_SZE, EXECUTE_PROC, FILTER1, FILTER2, FILTER3, FILTER4, FILTER5, FILTER6, TRN_COR_GID, SBCD, USR_NO, TRN_SUC_DT) VALUES ('" + date.getDd() +"', '" + date.getYYYYMMdd() + "', '" + date.getHHMMDDssSSS() + "', '" + uuid + "', '"+ gid +"', '"+date.getYYYYMMdd()+"', '"+Integer.toString(Integer.parseInt(date.getHHMMDDssSSS()) + 500)+"', 'OCIS_0200836', '[MyData_할부]계좌목록조회', 'T2T', '0200836', 'MRZ_MYD_UT', 'OCIS_0200836', 'OCIS', '/1.234.25.131:31100', 'OCO2', ':', '01', 'OK', '[OCO2] 정의되지않은 Exception 발생.host : http://1.234.25.131:23105Exception[Connection to http://1.234.25.131:23105 refused]', null, null, null, null, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, '1087')";
                String dtlData100 = "INSERT INTO KONAI2.TB_V4_FEP_TRN_DTL (TRN_DAY, TRN_DT, TRN_TM, TRN_MST_SEQ, TRN_DTL_SEQ, TRN_UNQNO, HST_PBLS_STP, PROC_STS, DAT, DAT_LNGTH, DATA_TYPE, TRN_SEQ, BAT_DETAIL_CNTN, HEADER_DAT, HEADER_LNGTH, TGT_OBJ_NO, HEADER_CHANID) VALUES ('" + date.getDd() +"', '" + date.getYYYYMMdd() + "', '" + Integer.toString(Integer.parseInt(date.getHHMMDDssSSS()) + 100) + "', '" + uuid + "', '"+ ++TRN_DTL_SEQ +"', '" + gid + "', '0100', 'ING', 'KCIMYDTOT000172713570200836B0000000000000000000000000000000000000220210715092100N0            ZVAABN000001AAEM0000_LKEZZNVTBMHYE837ORAK1JYJN4J0NWRQI3PNO5J800101102222200000000000', 178, null, null, null, null, null, null, null)";
                String dtlData200 = "INSERT INTO KONAI2.TB_V4_FEP_TRN_DTL (TRN_DAY, TRN_DT, TRN_TM, TRN_MST_SEQ, TRN_DTL_SEQ, TRN_UNQNO, HST_PBLS_STP, PROC_STS, DAT, DAT_LNGTH, DATA_TYPE, TRN_SEQ, BAT_DETAIL_CNTN, HEADER_DAT, HEADER_LNGTH, TGT_OBJ_NO, HEADER_CHANID) VALUES ('" + date.getDd() +"', '" + date.getYYYYMMdd() + "', '" + Integer.toString(Integer.parseInt(date.getHHMMDDssSSS()) + 200) + "', '" + uuid + "', '"+ ++TRN_DTL_SEQ +"', '" + gid + "', '0200', 'ING', 'KCIMYDTOT000172713570200836B0000000000000000000000000000000000000220210715092100N0            ZVAABN000001AAEM0000_LKEZZNVTBMHYE837ORAK1JYJN4J0NWRQI3PNO5J800101102222200000000000', 178, null, null, null, null, null, null, null)";
                String dtlData300 = "INSERT INTO KONAI2.TB_V4_FEP_TRN_DTL (TRN_DAY, TRN_DT, TRN_TM, TRN_MST_SEQ, TRN_DTL_SEQ, TRN_UNQNO, HST_PBLS_STP, PROC_STS, DAT, DAT_LNGTH, DATA_TYPE, TRN_SEQ, BAT_DETAIL_CNTN, HEADER_DAT, HEADER_LNGTH, TGT_OBJ_NO, HEADER_CHANID) VALUES ('" + date.getDd() +"', '" + date.getYYYYMMdd() + "', '" + Integer.toString(Integer.parseInt(date.getHHMMDDssSSS()) + 300) + "', '" + uuid + "', '"+ ++TRN_DTL_SEQ +"', '" + gid + "', '0300', 'ING', '1340036201EXT0000023117                                                                                                                                                                                                                         KCIMYDTOT000172713570200836B0000000000000000000000000000000000000220210715092100N0            ZVAABN000001AAEM0000_LKEZZNVTBMHYE837ORAK1JYJN4J0NWRQI3PNO5J800101102222200000000000', 436, null, null, null, null, null, null, null)";
                String dtlData400 = "INSERT INTO KONAI2.TB_V4_FEP_TRN_DTL (TRN_DAY, TRN_DT, TRN_TM, TRN_MST_SEQ, TRN_DTL_SEQ, TRN_UNQNO, HST_PBLS_STP, PROC_STS, DAT, DAT_LNGTH, DATA_TYPE, TRN_SEQ, BAT_DETAIL_CNTN, HEADER_DAT, HEADER_LNGTH, TGT_OBJ_NO, HEADER_CHANID) VALUES ('" + date.getDd() +"', '" + date.getYYYYMMdd() + "', '" + Integer.toString(Integer.parseInt(date.getHHMMDDssSSS()) + 400) + "', '" + uuid + "', '"+ ++TRN_DTL_SEQ +"', '" + gid + "', '0400', 'OK', '1340036201EXT0000023117                                                                                                                                                                                                                         KCIMYDTOT000172713570200836B0000000000000000000000000000000000000220210715092100N0            ZVAABN000001AAEM0000_LKEZZNVTBMHYE837ORAK1JYJN4J0NWRQI3PNO5J800101102222200000000000', 436, null, null, null, null, null, null, null)";

                writer.append(mstData + "\n"
                            + dtlData100 + "\n"
                            + dtlData200 + "\n"
                            + dtlData300 + "\n"
                            + dtlData400 + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            stopWatch.stop();
            System.out.println(stopWatch.getS() + "초");
        }


    }
}
