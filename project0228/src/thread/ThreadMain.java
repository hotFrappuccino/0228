package thread;

public class ThreadMain {
	public static void main(String[] args) {
		SampleThread t1 = new SampleThread();
		SampleThread t2 = new SampleThread();
/*
		/*�Ϲ� �޼ҵ� ȣ��
		t1.run();
		t2.run();
		�̷��� �ϸ� t1�� �� ó���ϰ� t2�� ó���� */
		//������ ����
//		t1.start();
//		t2.start();	//�̷��� �ϸ� 0,0,1,1,2,2 �ϴ� ������ t1�� t2�� �����Ƽ� ó��.
/*		
		//������ Ŭ�����κ��� ��ӹ޴� �ν��Ͻ� ����
		ThreadEx th1 = new ThreadEx();
		th1.start();
		
		//anonymous class �̿�_���ο� Ŭ���� XX
		//�޸𸮸� ������ �� ������ �������� �ν��Ͻ��� �������� ����.
		Thread th2 = new Thread(){
			public void run() {
				try {
					for(int i=0;i<20;i=i+1) {
						Thread.sleep(500);	//th1�� 1�� ���µ� ��� 0.5�� 1�� �ѹ� ���� �� �̰� �ι� ����.
						System.out.printf("AnonymousClass�� �̿��ϸ� Ŭ������ �ϳ� �� �������� �ʾƵ� ����.\n");
					}
				}
				catch(Exception e) {
					System.out.printf("%s\n", e.getMessage());
				}
			}
		};
		
		th2.start();
		
		//Runnable�������̽��� �̿��� ������ ���� �� ����
		Runnable th3 = new Runnable() {
			@Override
			public void run() {
				try {
					for(int i=0;i<20;i=i+1) {
						Thread.sleep(500);
						System.out.printf("Runnable�������̽� �̿�\n");
					}
				}
				catch(Exception e) {
					System.out.printf("%s\n", e.getMessage());
				}
			}
		};
		Thread th4 = new Thread(th3);
		th4.start();
*/
		
		Thread backgroundThread = new Thread() {
			public void run() {
				try {
					for(int i=0;i<10;i=i+1){
						Thread.sleep(1000);
						System.out.printf("���󽺷���\n");
					}
				}
				catch(Exception e) {
					return;		//���ܰ� �߻����� �� �����带 ������ �� �ֵ���
				}
			}
		};
		
		//���� ������� ����! - �ٸ� �����尡 ���� ���� �ƴϸ� �ڵ� ����
				//start ȣ���ϱ� ���� ����_ �¶��ΰ��ӿ��� ������ ���� � ���� ���.
				backgroundThread.setPriority(Thread.MAX_PRIORITY);
				backgroundThread.setDaemon(true);
				backgroundThread.start();
				
		
		Thread foregroundThread = new Thread() {
			public void run() {
				try {
					for(int i=0;i<5;i=i+1) {
						Thread.sleep(1000);
						System.out.printf("���׶��� ������\n");
						if(i==1) {
							//backgroundThread�� InterruptedException�� ������ �߻���Ű�� ����
							backgroundThread.interrupt();
						}
					}
				}
				catch(Exception e) {

				}
			}
		};
		//���󽺷��尡 �ƴϱ� ������ ������ ������Ű�� �ʴ� �̻� 5�ʵ��� �۾��� ����.
		//�켱���� ����
		foregroundThread.setPriority(Thread.MIN_PRIORITY);
		foregroundThread.start();
		
		
		
		//������ priority���� �� �Ǵ� �� �ƴϰ�, ��¿ ���� ������ ���� ���� ���� ��. ������ ���� ���� ó���϶�� �ϴ� ��.(������)
	}

}
