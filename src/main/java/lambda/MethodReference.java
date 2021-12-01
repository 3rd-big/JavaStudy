package lambda;

import java.util.TooManyListenersException;
import java.util.function.IntBinaryOperator;
import java.util.function.ToIntBiFunction;

public class MethodReference {
    public static void main(String[] args) {

        IntBinaryOperator operator = (int x, int y) -> {
            if(x > y) return x;
            return y;
        };
        System.out.println("operator = " + operator.applyAsInt(3, 7));

        IntBinaryOperator operator2 = (int x, int y) -> {return Math.max(x, y);};
        System.out.println("operator2 = " + operator2.applyAsInt(5, 22));

        // :: <<< max()�� Math Ŭ������ ���� �޼ҵ��̱⿡ ����(static)�޼ҵ� ��������� ���
        IntBinaryOperator operator3 = Math::max;
        System.out.println("operator3 = " + operator3.applyAsInt(61, 44));

        MyMath myMath = new MyMath();
        IntBinaryOperator operator4 = myMath::myMax;
        System.out.println("operator4 = " + operator4.applyAsInt(8, 2));

        /**
         * compareTo()
         * �Ű������� ���� ����(y)�� ȣ���� ����(x)���� ����
         * Ŭ ��� -1
         * ���� ��� 0
         * ���� ��� 1
         * 
         * ToIntBiFunction
         * Function �������̽� �� �ϳ��ν�, �� ���� �Ű������� �޾� ���ٽ��� ������ ����Ͽ�
         * applyAsInt()�� ������� �� int Ÿ���� ��ȯ���ִ� �Լ��� �������̽�
         */
        Integer x = 3;
        Integer y = 7;
        ToIntBiFunction<Integer, Integer> func = Integer::compareTo; // (x, y) -> x.compareTo(y);
        System.out.println("func = " + func.applyAsInt(x, y));
    }
}

class MyMath {
    public int myMax(int x, int y) {
        return x > y ? x : y;
    }
}


