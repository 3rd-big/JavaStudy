package string;

public class StringBufferTest1 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ABCDE");
        StringBufferTest1 sbt = new StringBufferTest1();
        sbt.check(stringBuilder);
    }

    /**
     * CharSequence �� �������̽�
     * �ش� �������̽��� ������ Ŭ�����δ� CharBuffer, String, StringBuffer, StringBuilder�� ����
     * �� �������̽��� StringBuffer�� StringBUilder�� ������ ��ü�� ������ �� ����
     *
     * StringBuffer�� StringBuilder�� ���� ���� �� ���� toString�� �����Ͽ� �ʿ� ���� ��ü�� ���� �Ѱ� �ֱ⺸�ٴ�
     * CharSequence�� �޾Ƽ� ó���ϴ� ���� �޸� ȿ���� �� ������     */
    private void check(CharSequence cs) {
        StringBuffer stringBuffer = new StringBuffer(cs);
        System.out.println("stringBuffer.length = " + stringBuffer.length());
    }

}
