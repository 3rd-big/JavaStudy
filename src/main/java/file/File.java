package file;

import java.net.URISyntaxException;

public class File {
    public void ResourceFilePathRead(String fileName) throws URISyntaxException {
        String filePath =  getClass().getResource(fileName).toURI().getPath();
        System.out.println("filePath = " + filePath);
    }
}
