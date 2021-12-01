package tuning.util.dummy;

import java.io.RandomAccessFile;

public class DummyFileCreate {
    public static void main(String[] args) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile("C:\\Users\\Seo\\IdeaProjects\\Tsseo\\out\\artifacts\\TcpClient_jar\\dummy.txt", "rw");
            // 10MB
            long size = (1024 * 1024) * 50L;
            randomAccessFile.setLength(size);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
