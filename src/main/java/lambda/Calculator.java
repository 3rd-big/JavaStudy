package lambda;

/**
 *  @FunctionalInterface
 *  �����Ϸ��� ���ٽ��� �ؼ��Ͽ� �ڵ����� �͸���ü�� ����
 *  �� ��, ���ٽ��� Ÿ�� Ÿ���� �� �������̽��� 2�� �̻��� �߻� �޼ҵ带 ������ �ȵ�
 *  �׷��� �Ǹ� �����Ϸ��� �ش� ���ٽ��� Ÿ�� Ÿ���� � �޼ҵ带 ������ ������ �� �� ����
 */
@FunctionalInterface
public interface Calculator {
    int calc(int n);
//    int sum(int a, int b);    // ���� �߻�
}
