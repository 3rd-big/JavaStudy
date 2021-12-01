package string;

public class StringBufferTest1 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ABCDE");
        StringBufferTest1 sbt = new StringBufferTest1();
        sbt.check(stringBuilder);
    }

    /**
     * CharSequence 는 인터페이스
     * 해당 인터페이스를 구현한 클래스로는 CharBuffer, String, StringBuffer, StringBuilder가 있음
     * 이 인터페이스는 StringBuffer나 StringBUilder로 생성한 객체를 전달할 때 사용됨
     *
     * StringBuffer나 StringBuilder로 값을 만든 후 굳이 toString을 수행하여 필요 없는 객체를 만들어서 넘겨 주기보다는
     * CharSequence로 받아서 처리하는 것이 메모리 효율이 더 좋음음     */
    private void check(CharSequence cs) {
        StringBuffer stringBuffer = new StringBuffer(cs);
        System.out.println("stringBuffer.length = " + stringBuffer.length());
    }

}
