package hex;

public class test {
    public static void main(String[] args) {
        byte[] lengthByte = new byte[2];
        for (int i = 0; i < 2; i++) {
            lengthByte[i] = (byte)((Integer.parseInt("1096")>>>(8*(2-(1+i)))));
        }
        System.out.println(new String(lengthByte));

        byte[] ba = new byte[3];
        String hex = "ff0d0a";
        for (int i = 0; i < ba.length; i++) {
            ba[i] = (byte) Integer.parseInt(hex.substring(2 * i, 2 * i + 2), 16);
        }
        System.out.println(new String(ba));

    }
}
