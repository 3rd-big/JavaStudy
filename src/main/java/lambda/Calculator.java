package lambda;

/**
 *  @FunctionalInterface
 *  컴파일러는 람다식을 해석하여 자동으로 익명구현체로 만듬
 *  이 때, 람다식의 타겟 타입의 될 인터페이스는 2개 이상의 추상 메소드를 가지면 안됨
 *  그렇게 되면 컴파일러가 해당 람다식이 타겟 타입의 어떤 메소드를 구현한 것인지 알 수 없음
 */
@FunctionalInterface
public interface Calculator {
    int calc(int n);
//    int sum(int a, int b);    // 에러 발생
}
