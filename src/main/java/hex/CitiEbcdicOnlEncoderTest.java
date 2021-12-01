package hex;

import java.io.*;

public class CitiEbcdicOnlEncoderTest {
    public static void main(String[] args) throws UnsupportedEncodingException {
        StringBuilder stringBuilder = new StringBuilder();
        File file = new File("C:\\Users\\Seo\\Desktop\\Direa\\CitiEbcdicOnlEncoder.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
//                System.out.println(line);
                stringBuilder.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(stringBuilder.toString());
        byte[] bytes = new java.math.BigInteger(stringBuilder.toString(), 16).toByteArray();
        System.out.println(new String(bytes, "EUC-KR"));
    }
}
