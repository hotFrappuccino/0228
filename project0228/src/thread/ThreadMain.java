package thread;

public class ThreadMain {
	public static void main(String[] args) {
		SampleThread t1 = new SampleThread();
		SampleThread t2 = new SampleThread();
/*
		/*일반 메소드 호출
		t1.run();
		t2.run();
		이렇게 하면 t1을 다 처리하고 t2를 처리함 */
		//스레드 시작
//		t1.start();
//		t2.start();	//이렇게 하면 0,0,1,1,2,2 하는 식으로 t1과 t2를 번갈아서 처리.
/*		
		//스레드 클래스로부터 상속받는 인스턴스 생성
		ThreadEx th1 = new ThreadEx();
		th1.start();
		
		//anonymous class 이용_새로운 클래스 XX
		//메모리를 절약할 수 있지만 여러개의 인스턴스를 생성하지 못함.
		Thread th2 = new Thread(){
			public void run() {
				try {
					for(int i=0;i<20;i=i+1) {
						Thread.sleep(500);	//th1은 1초 쉬는데 얘는 0.5라 1이 한번 나올 때 이건 두번 나옴.
						System.out.printf("AnonymousClass를 이용하면 클래스를 하나 더 생성하지 않아도 되지.\n");
					}
				}
				catch(Exception e) {
					System.out.printf("%s\n", e.getMessage());
				}
			}
		};
		
		th2.start();
		
		//Runnable인터페이스를 이용한 스레드 생성 및 시작
		Runnable th3 = new Runnable() {
			@Override
			public void run() {
				try {
					for(int i=0;i<20;i=i+1) {
						Thread.sleep(500);
						System.out.printf("Runnable인터페이스 이용\n");
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
						System.out.printf("데몬스레드\n");
					}
				}
				catch(Exception e) {
					return;		//예외가 발생했을 때 스레드를 종료할 수 있도록
				}
			}
		};
		
		//데몬 스레드로 변신! - 다른 스레드가 동작 중이 아니면 자동 중지
				//start 호출하기 전에 설정_ 온라인게임에서 데이터 전송 등에 많이 사용.
				backgroundThread.setPriority(Thread.MAX_PRIORITY);
				backgroundThread.setDaemon(true);
				backgroundThread.start();
				
		
		Thread foregroundThread = new Thread() {
			public void run() {
				try {
					for(int i=0;i<5;i=i+1) {
						Thread.sleep(1000);
						System.out.printf("포그라운드 스레드\n");
						if(i==1) {
							//backgroundThread에 InterruptedException을 강제로 발생시키는 구조
							backgroundThread.interrupt();
						}
					}
				}
				catch(Exception e) {

				}
			}
		};
		//데몬스레드가 아니기 때문에 강제로 중지시키지 않는 이상 5초동안 작업을 수행.
		//우선순위 변경
		foregroundThread.setPriority(Thread.MIN_PRIORITY);
		foregroundThread.start();
		
		
		
		//무조건 priority높은 게 되는 건 아니고, 어쩔 때는 흥흥이 먼저 나올 때도 있. 하지만 데몬 먼저 처리하라고 하는 거.(옥시즌)
	}

}
