package project0228;

import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
		//키보드로부터 입력받는 스캐너 만들기
		Scanner sc = new Scanner(System.in);
		System.out.printf("문자열 입력 :");
		String str1 = sc.nextLine();
		System.out.printf("입력한 문자열은 %s\n", str1);

		System.out.printf("정수입력 :");
		int n = sc.nextInt();
		System.out.printf("입력한 정수는 %d\n", n);
		
		System.out.printf("문자열 입력 :");
		sc.nextLine();//이전 입력에서 넘어온 Enter를 없애기 위한 호출
		String str2 = sc.nextLine();
		System.out.printf("입력한 문자열은 %s\n", str2);

		int su = 0;
		int leng = str2.length();
		for(int i=0; i<leng;i=i+1) {
			char ch = str2.charAt(i);
			if(ch>='0' && ch<='9') {
				su = su*10 + (ch-48);	//문자 '0'이 ASCII 로 48이어서 -48 해주면 진짜 0이 되는 거
			} 
		}
		System.out.printf("변환된 숫자:%d\n",su);
		sc.close();
	}

}
