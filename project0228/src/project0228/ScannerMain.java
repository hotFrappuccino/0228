package project0228;

import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
		//Ű����κ��� �Է¹޴� ��ĳ�� �����
		Scanner sc = new Scanner(System.in);
		System.out.printf("���ڿ� �Է� :");
		String str1 = sc.nextLine();
		System.out.printf("�Է��� ���ڿ��� %s\n", str1);

		System.out.printf("�����Է� :");
		int n = sc.nextInt();
		System.out.printf("�Է��� ������ %d\n", n);
		
		System.out.printf("���ڿ� �Է� :");
		sc.nextLine();//���� �Է¿��� �Ѿ�� Enter�� ���ֱ� ���� ȣ��
		String str2 = sc.nextLine();
		System.out.printf("�Է��� ���ڿ��� %s\n", str2);

		int su = 0;
		int leng = str2.length();
		for(int i=0; i<leng;i=i+1) {
			char ch = str2.charAt(i);
			if(ch>='0' && ch<='9') {
				su = su*10 + (ch-48);	//���� '0'�� ASCII �� 48�̾ -48 ���ָ� ��¥ 0�� �Ǵ� ��
			} 
		}
		System.out.printf("��ȯ�� ����:%d\n",su);
		sc.close();
	}

}
