package lambda;

/**
 * JAVA�� Lambda�� �޼ҵ带 �ϳ��� ��(Expression)���� ǥ���� ��
 * �͸�޼ҵ�(�Լ�) ���� �����̶� �� �� ����
 * JAVA�� �޼ҵ�� �޼ҵ� ��ü�� ȥ�� �����Ͽ� ���� �� ����
 * => ������ Class ��������� ����Ǿ�� ��
 */

public class Driver {
    public static void main(String[] args) {

        /**
         * Ÿ��Ÿ��
         * ���ٽĿ��� �����Ǵ� '�͸�����ü�� ����� �Ǵ� interface�� Ÿ���� ���´�'
         * ���ٽ����� �ٲ� �޼ҵ�� cal()�̹Ƿ� ���ٽ��� Ÿ��Ÿ���� Calculator
         */
        
        // ������ ���ÿ� ������ �޼ҵ带 override
        Calculator cal = new Calculator() {
            @Override
            public int calc(int n) {
                return n + 1;
            }
        };
        System.out.println("cal = " + cal.calc(2));

        // ������ �⺻��: (�Ű�����) -> {���๮}
        Calculator cal2 = (int n) -> {return n + 1;};
        System.out.println("cal2 = " + cal2.calc(3));
        
        // �Ű������� Ÿ���� �ڵ����� �ν��ϱ� ������ ���� Ÿ���� ������ �� ����
        Calculator cal3 = (n) -> {return n + 1;};
        System.out.println("cal3 = " + cal3.calc(4));

        // �Ű������� �ϳ� �� �� ()�� ������ �� ����. �� �� �̻� Ȥ�� ���� ���� ()�� �ʿ�
        // �Ű������� ���� ���, ������ ()�� �ʿ�: () -> {return "hi"}
        Calculator cal4 = n -> {return n + 1;};
        System.out.println("cal4 = " + cal4.calc(5));

        // ������ �� �� �ȿ� ������ ��� {}��  return�� ������ �� ����
        Calculator cal5 = n -> n + 1;
        System.out.println("cal5 = " + cal5.calc(6));
    }
}
