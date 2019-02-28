package thread;

public class ThreadEx extends Thread {//Thread를 상속받은 클래스

	@Override	//오버라이드 된 메소드가 맞는지 확인해주는 어노테이션
	public void run() {
		
		try {					//예외 발생 가능성이 있는 코드
			for(int i=0;i<10;i=i+1) {
				Thread.sleep(1000);
				System.out.printf("스레드는 아직 어려운 것 같다.\n집가서 더 봐야겠다 \n");
			}
		}catch(Exception e) {	//예외가 발생했을 때 수행할 내용
			System.out.printf("예외내용 : %s\n", e.getMessage());//예외내용 출력
		}finally {				//예외발생 여부에 상관없이 수행할 내용
			
		}
	}
	
}
