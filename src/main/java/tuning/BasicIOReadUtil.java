package tuning;

import tuning.util.stopwatch.StopWatch;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class BasicIOReadUtil {
    public static Vector readCharStream(String fileName) throws Exception {
        Vector<StringBuffer> vector = new Vector<StringBuffer>();
        FileReader fileReader = null;
        try {
            // FileReader 객체 생성
            fileReader = new FileReader(fileName);
            int data = 0;

            // 한 줄씩 데이터를 담을 StringBuffer 생성
            StringBuffer stringBuffer = new StringBuffer();
            while ((data = fileReader.read()) != -1) {
                if (data == '\n' || data == '\r') {
                    vector.addElement(stringBuffer);
                    stringBuffer = new StringBuffer();
                } else {
                    stringBuffer.append((char) data);
                }
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
            throw e;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            throw e;
        } finally {
            if (fileReader != null) {
                fileReader.close();
            }
        }
        return vector;
    }

    public static String readCharStreamWithBuffer(String fileName) throws Exception {
        StringBuffer stringBuffer = new StringBuffer();
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(fileName);
            int bufferSize = 1024 * 1024;
            char readBuffer[] = new char[bufferSize];
            int resultSize = 0;

            while ((resultSize = fileReader.read(readBuffer)) != -1) {
                if (resultSize == bufferSize) {
                    stringBuffer.append(readBuffer);
                } else {
                    for (int loop = 0; loop < resultSize; loop++) {
                        stringBuffer.append(readBuffer[loop]);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
            throw e;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            throw e;
        } finally {
            if (fileReader != null) {
                fileReader.close();
            }
        }
        return stringBuffer.toString();
    }

    public static Vector<String> readBufferedReader(String fileName) throws Exception {
        Vector<String> vector = new Vector<String>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(fileName));
            String data;
            while ((data = bufferedReader.readLine()) != null) {
                vector.addElement(data);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
            throw e;
        } finally {
            if (bufferedReader != null) {
                bufferedReader.close();
            }
        }
        return vector;
    }

    public static void main(String[] args) throws Exception {
        String fileName = "C:\\Users\\Seo\\IdeaProjects\\Tsseo\\out\\artifacts\\TcpClient_jar\\dummy.txt";
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
//        Vector vector = BasicIOReadUtil.readCharStream(fileName);
//        String string = BasicIOReadUtil.readCharStreamWithBuffer(fileName);
        Vector vector = BasicIOReadUtil.readBufferedReader(fileName);
        System.out.println(stopWatch);
//        System.out.println(vector.size());
//        System.out.println(string.length());
        System.out.println(vector.size());
    }

}
