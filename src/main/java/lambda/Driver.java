package lambda;

/**
 * JAVA의 Lambda는 메소드를 하나의 식(Expression)으로 표현한 것
 * 익명메소드(함수) 생성 문법이라 할 수 있음
 * JAVA의 메소드는 메소드 자체로 혼자 선언하여 쓰일 수 없음
 * => 무조건 Class 구성멤버로 선언되어야 함
 */

public class Driver {
    public static void main(String[] args) {

        /**
         * 타겟타입
         * 람다식에서 생성되는 '익명구현객체는 기반이 되는 interface의 타입을 갖는다'
         * 람다식으로 바꿀 메소드는 cal()이므로 람다식의 타겟타입은 Calculator
         */
        
        // 생성과 동시에 구현할 메소드를 override
        Calculator cal = new Calculator() {
            @Override
            public int calc(int n) {
                return n + 1;
            }
        };
        System.out.println("cal = " + cal.calc(2));

        // 람다의 기본식: (매개변수) -> {실행문}
        Calculator cal2 = (int n) -> {return n + 1;};
        System.out.println("cal2 = " + cal2.calc(3));
        
        // 매개변수의 타입을 자동으로 인식하기 때문에 변수 타입을 삭제할 수 있음
        Calculator cal3 = (n) -> {return n + 1;};
        System.out.println("cal3 = " + cal3.calc(4));

        // 매개변수가 하나 일 때 ()를 생략할 수 있음. 두 개 이상 혹은 없을 때는 ()가 필요
        // 매개변수가 없는 경우, 무조건 ()가 필요: () -> {return "hi"}
        Calculator cal4 = n -> {return n + 1;};
        System.out.println("cal4 = " + cal4.calc(5));

        // 로직이 한 줄 안에 끝나는 경우 {}와  return을 제거할 수 있음
        Calculator cal5 = n -> n + 1;
        System.out.println("cal5 = " + cal5.calc(6));
    }
}
