package string;

public class indexOfTest {
    public static void main(String[] args) {
        String query = "ABSDFSDKJFLKSJDKLF 1234234  sgfs'' [ADD] asdfasdfdddddd [ADD]";
        int indexOf = query.indexOf("[ADD]");
        System.out.println("indexOf = " + indexOf);
    }
}
