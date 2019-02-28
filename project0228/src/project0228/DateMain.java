package project0228;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateMain {

	public static void main(String[] args) {
		//현재 날짜 및 시간을 갖는 Date 인스턴스 생성하기
		Date today = new Date();
		//toString이 재정의 되어 있어서 바로 출력하면 저장된 데이터 확인 가능
		System.out.printf("%s\n", today);
		
		//년월일을 직접 입력해서 생성 - Deprecated
		//1991년 8월 16일을 입력해보자
		Date birth = new Date(91, 7, 16); // 년도는 1900년도 이후 지나온 년도, 월은 0부터 시작.
		System.out.printf("%s\n", birth);


	
	Calendar now = Calendar.getInstance(); // 현재 날짜 및 시간을 갖는 Calendar 인스턴스 생성
	Calendar cal = new GregorianCalendar();//위와 같음_GregorianCalendar에서 뽑아오는 거
	
	//특정한 날짜 및 시간 만들기 _ 1991년 8월 16일 13시 00분 00초 만들기
	//하나씩 설정하기 - 한꺼번에 설정하는 메소드도 존재
	//GregorianCalendar의 생성자를 이용해서 한번에 생성 가능
	cal.set(Calendar.YEAR,1991);
	cal.set(Calendar.MONTH, 8);
	cal.set(Calendar.DAY_OF_MONTH, 16);
	cal.set(Calendar.HOUR,13);
	
	
	//now에서 cal까지 지나온 날짜 수 계산

	long gap = now.getTimeInMillis() - cal.getTimeInMillis();
	gap = gap / 1000 / 86400; // 이건 날짜단위니까 얘를 반 나누면 12시간 단위고 막 그런 거.
	System.out.printf("내가 태어난 지 %d일이 지났습니다.\n", gap);
	
	}
	
}
