package file;

import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) {
        File file = new File();
        try {
            file.ResourceFilePathRead("/XMLFiles/Test2.xml");
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
