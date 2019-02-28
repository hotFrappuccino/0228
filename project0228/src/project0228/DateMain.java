package project0228;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateMain {

	public static void main(String[] args) {
		//���� ��¥ �� �ð��� ���� Date �ν��Ͻ� �����ϱ�
		Date today = new Date();
		//toString�� ������ �Ǿ� �־ �ٷ� ����ϸ� ����� ������ Ȯ�� ����
		System.out.printf("%s\n", today);
		
		//������� ���� �Է��ؼ� ���� - Deprecated
		//1991�� 8�� 16���� �Է��غ���
		Date birth = new Date(91, 7, 16); // �⵵�� 1900�⵵ ���� ������ �⵵, ���� 0���� ����.
		System.out.printf("%s\n", birth);


	
	Calendar now = Calendar.getInstance(); // ���� ��¥ �� �ð��� ���� Calendar �ν��Ͻ� ����
	Calendar cal = new GregorianCalendar();//���� ����_GregorianCalendar���� �̾ƿ��� ��
	
	//Ư���� ��¥ �� �ð� ����� _ 1991�� 8�� 16�� 13�� 00�� 00�� �����
	//�ϳ��� �����ϱ� - �Ѳ����� �����ϴ� �޼ҵ嵵 ����
	//GregorianCalendar�� �����ڸ� �̿��ؼ� �ѹ��� ���� ����
	cal.set(Calendar.YEAR,1991);
	cal.set(Calendar.MONTH, 8);
	cal.set(Calendar.DAY_OF_MONTH, 16);
	cal.set(Calendar.HOUR,13);
	
	
	//now���� cal���� ������ ��¥ �� ���

	long gap = now.getTimeInMillis() - cal.getTimeInMillis();
	gap = gap / 1000 / 86400; // �̰� ��¥�����ϱ� �긦 �� ������ 12�ð� ������ �� �׷� ��.
	System.out.printf("���� �¾ �� %d���� �������ϴ�.\n", gap);
	
	}
	
}
