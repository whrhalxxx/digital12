package day1;

public class ������ {

	public static void main(String[] args) {
		// ���� ������ : = 
		// =�� �������� �����U�� �ִ� ���� ���ʿ� ����
		// A = B
		// B�� A�� ����(����)�ض�/�����
		// A�� �����̾���Ѵ�.
		// A�� ���� 1���̾���Ѵ�.
		int a = 10;
		int b = 20;
		a = 30;
		a = b + 30;
		//b + 30 = a;//����

		//��������� : +,-, *(���ϱ�), /(������), %(������,���)
		// +, -, *�� �״�� 
		System.out.println(4 + 3);
		System.out.println(4 - 3);
		System.out.println(4 * 3);
		
		System.out.println(1.2 + 3.4);
		System.out.println(1.2 - 3.4);
		System.out.println(1.2 * 3.4);
			
	    /* ������
	     * ���� / ���� => ����
	     * ���� / �Ǽ� => �Ǽ�
	     * �Ǽ� / ���� => �Ǽ�
	     * �Ǽ� / �Ǽ� => �Ǽ� 
	     * */
		
			
        
        System.out.println(3 / 2);
		System.out.println(3/ 2.0);
		System.out.println(3.0 /2);
		System.out.println(3.0 /2.0);
		// ���� / ������ �ؾ��ϴ� ��� ���ʿ��� �ڷ�����ȯ�� �ؼ� 
		// �Ǽ� / ������ ���� ����Ѵ�. 
		
		System.out.println((double)3 / 2);
		int num1 = 3;
		int num2 = 2;
		System.out.println((double)num1 / num2);
		
		// ������ ������ : %
		// A % B : A�� B�� �������� �� ������
		// ����� ��� ���� �� ���
		System.out.println(4 % 3);
		System.out.println(199 % 17);
		
		/* ����1, ���� ������ 100��, ���� ������ 35��, ���� ������ 97���� ��
		 * ����, ����, ���� �� ������ ������ ����� ���Ͽ� �ֿܼ� ����ϼ���.
		 * */
		
		 
		 int kor = 100;
		 int eng = 35;
		 int math = 97;
		 int sum = kor + eng + math;
		 double avr = sum / 3.0;		 
		 System.out.println("���� : " + sum);
		 System.out.println("��� : " + avr);
		 
		
	}
  
}
