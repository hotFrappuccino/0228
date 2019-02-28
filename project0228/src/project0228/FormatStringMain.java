package project0228;

import java.text.ChoiceFormat;
import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FormatStringMain {

	public static void main(String[] args) {
		//Calendar 인스턴스를 이용한 Date 인스턴스 생성
		Calendar cal = Calendar.getInstance();
		Date today = new Date(cal.getTimeInMillis());
		
		
		//날짜 서식을 생성
		SimpleDateFormat sdf = new SimpleDateFormat("G YYYY-MM-DD hh:mm:ss,EEE");
		String formatString = sdf.format(today);
		System.out.printf("%s\n", formatString);
		
		double number = 67532.76542; //이 숫자를 67,532.77로 출력하기
		//숫자서식을 설정
		DecimalFormat df = new DecimalFormat("\u00A4 #,###.00");
		formatString = df.format(number);
		System.out.printf("%s\n",formatString);
		
		//ChoiceFormat은 실수 배열과 문자열 배열을 이용해서 생성
		//실수배열 안의 숫자 범위에 해당하는 문자열을 리턴하는 클래스
		double [] score = {0,60,70,80,90};
		String [] grade = {"가", "양", "미", "우", "수"};
		
		double[] jumsu = {98,87,26,57,68,88,72};
		//ChoiceFormat 인스턴스 생성
		ChoiceFormat cf = new ChoiceFormat(score, grade);
		for(double temp : jumsu) {
			System.out.printf("%s\n",  cf.format(temp));
		}

		//포맷 문자열 생성
		String msg = "이름:{0} 나이:{1}";
		Object [] p1 = {"송희정","29"};
		Object[]p2= {"송민규",27};
		
		System.out.printf("%s\n", MessageFormat.format(msg, p1));
		System.out.printf("%s\n", MessageFormat.format(msg, p2));
		
	
	}

}
