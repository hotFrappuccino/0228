package thread;

public class ThreadEx extends Thread {//Thread�� ��ӹ��� Ŭ����

	@Override	//�������̵� �� �޼ҵ尡 �´��� Ȯ�����ִ� ������̼�
	public void run() {
		
		try {					//���� �߻� ���ɼ��� �ִ� �ڵ�
			for(int i=0;i<10;i=i+1) {
				Thread.sleep(1000);
				System.out.printf("������� ���� ����� �� ����.\n������ �� ���߰ڴ� \n");
			}
		}catch(Exception e) {	//���ܰ� �߻����� �� ������ ����
			System.out.printf("���ܳ��� : %s\n", e.getMessage());//���ܳ��� ���
		}finally {				//���ܹ߻� ���ο� ������� ������ ����
			
		}
	}
	
}
