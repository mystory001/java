package test13;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {

		// 날짜와 시간을 다루는 클래스
		// 1. Date 클래스
		Date day = new Date();
		System.out.println("day = " + day);
		System.out.println("--------------------------------------");

		// 날짜를 형식화하는 클래스 : SimpleDateFormat 클래스 사용
		// 날짜 표시 형식 만들기 -> 패턴 만들기

		// 표시 형식(패턴)을 지정하는 객체
		SimpleDateFormat p1 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("오늘 날짜(년-월-일) => " + p1.format(day));

		SimpleDateFormat p2 = new SimpleDateFormat("h:m");
		System.out.println("현재 시간은(시:분) => " + p2.format(day));

		SimpleDateFormat p3 = new SimpleDateFormat("E");
		System.out.println("현재 요일 => " + p3.format(day));

		SimpleDateFormat p4 = new SimpleDateFormat("yyyy-MM-dd E요일 hh시 mm분 ss초");
		System.out.println("현재 시각 => " + p4.format(day));
		System.out.println("--------------------------------------");

		// 일정부분만 빼내기
		String ex = p4.format(day).toString();
		System.out.println("ex = " + ex);
		System.out.println("--------------------------------------");

		String ex1 = p1.format(day).toString();
		System.out.println("ex1 = " + ex1);
		System.out.println("--------------------------------------");

		// 2. Calendar 클래스
		// Calendar ctime = new Calendar(); 객체 생성 할 수 없음
		Calendar ctime = Calendar.getInstance(); // 싱글톤 패턴으로 지정되어 있음
		System.out.println("ctime = " + ctime);
		System.out.println("--------------------------------------");

		// get()메소드를 이용해서 날짜 출력
		int year = ctime.get(Calendar.YEAR);
		int month = ctime.get(Calendar.MONTH) + 1; // 월은 0월부터 시작함.(+1 해줘야 현재 월)
		int day1 = ctime.get(Calendar.DATE);
		System.out.println(year + "년 " + month + "월 " + day1 + "일 ");
		System.out.println("--------------------------------------");
		// 시간 가져오기
		int hour = ctime.get(Calendar.HOUR);
		int minute = ctime.get(Calendar.MINUTE);
		int second = ctime.get(Calendar.SECOND);
		int second1 = ctime.get(Calendar.MILLISECOND);
		System.out.println("현재 시간은 " + hour + "시 " + minute + "분 " + second + "초 " + second1 + "밀리초");
		System.out.println("--------------------------------------");

		// Date클래스 타입값 -> Calendar 클래스 타입값으로 변경해서 사용
		ctime.setTime(day); //형 변환
		int yearC = ctime.get(Calendar.YEAR);
		int monthC = ctime.get(Calendar.MONTH) + 1;
		int dayC = ctime.get(Calendar.DATE);
		System.out.println(yearC + "년 " + monthC + "월 " + dayC + "일 ");
		System.out.println("--------------------------------------");

		// 1970년 1월 1일부터 현재까지의 누적된 시간을 출력
		System.out.println(System.currentTimeMillis());
		System.out.println("--------------------------------------");

		// 3. java.time 패키지
		// now() 메소드 : 현재 날짜와 시간을 이용해서 새로운 객체를 생성하여 반환
		// of() 메소드 : 전달한 인수를 가지고 특정 날짜와 시간을 표현하는 새로운 객체를 생성하여 반환
		// parse() 메소드 : 문자열을 날짜(LocalDate) 형식으로 변경

		// 날짜 처리 클래스 : LocalDate 클래스
		LocalDate ld = LocalDate.now();
		LocalDate ofld = LocalDate.of(2024, 1, 31);
		LocalDate pld = LocalDate.parse("2023-10-25");
		System.out.println("ld = " + ld);
		System.out.println("ofld = " + ofld);
		System.out.println("pld = " + pld);
		System.out.println("--------------------------------------");

		// 시간 처리 클래스 : LocalTime 클래스
		LocalTime lt = LocalTime.now();
		LocalTime oflt = LocalTime.of(10, 35, 1);
		LocalTime plt = LocalTime.parse("10:37:03"); //시간은 :(콜론)으로 구분
		System.out.println("lt = " + lt);
		System.out.println("ltof = " + oflt);
		System.out.println("plt = " + plt);
		System.out.println("--------------------------------------");
		
		// 날짜, 시간을 처리하는 클래스 : LocalDateTime
		LocalDateTime ldt = LocalDateTime.now();
		LocalDateTime ofldt = LocalDateTime.of(2024, 4, 30, 17, 50);
		System.out.println("ldt = " + ldt);
		System.out.println("ofldt = " + ofldt);
		System.out.println("--------------------------------------");
		
		//get 접두어가 붙은 메소드는 날짜/시간 정보를 가져오기
		System.out.println(ldt.getYear());
		System.out.println(ldt.getMonth()); 
		System.out.println(ldt.getMonthValue()); //+1 해줄 필요없음(cf, (Calendar.MONTH) + 1 차이가 있음 
		System.out.println(ldt.getDayOfMonth()); 
		System.out.println(ldt.getDayOfWeek()); 
		System.out.println("--------------------------------------");
		
		// ※연산
		LocalDate ld1 = ld.minusYears(10).plusMonths(1).plusDays(3);
		System.out.println(ld1);
	}

}
