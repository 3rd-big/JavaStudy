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

        // :: <<< max()가 Math 클래스의 정적 메소드이기에 정적(static)메소드 참조방식이 사용
        IntBinaryOperator operator3 = Math::max;
        System.out.println("operator3 = " + operator3.applyAsInt(61, 44));

        MyMath myMath = new MyMath();
        IntBinaryOperator operator4 = myMath::myMax;
        System.out.println("operator4 = " + operator4.applyAsInt(8, 2));

        /**
         * compareTo()
         * 매개변수로 들어온 인자(y)가 호출한 인자(x)보다 값이
         * 클 경우 -1
         * 같을 경우 0
         * 작을 경우 1
         * 
         * ToIntBiFunction
         * Function 인터페이스 중 하나로써, 두 개의 매개변수를 받아 람다식의 로직을 사용하여
         * applyAsInt()를 사용했을 때 int 타입을 반환해주는 함수적 인터페이스
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


