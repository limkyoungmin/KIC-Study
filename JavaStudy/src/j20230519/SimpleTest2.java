package j20230519;

import java.text.SimpleDateFormat;

// 오늘 날짜 출력
// = java.sql.Date : 테이블의 날짜필드 설정(DB에서 사용)
import java.util.Date;

// 오늘 날짜 출력 : Date, Calendar(정적메소드)
public class SimpleTest2 {

	public static void main(String[] args) {
		SimpleTest2 st = new SimpleTest2();
		Date d = st.getDate();
		System.out.println("d : " + d);
		
		st.setDate(d);
		
		// 한국 스타일에 맞게 출력시켜주는 클래스 : SimpleDateFormat
		// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// System.out.println("오늘 날짜 : " + sdf.format(d));
		
		SimpleDateFormat sdf = st.getSimpleDateFormat();
		st.setSimpleDateFormat(sdf, d);
		
		
		
		// Date d = new Date(); // 1. new 연산자
		// System.out.println("d : " + d); // d.toString() 자동으로 호출
	}
	
	public SimpleDateFormat getSimpleDateFormat() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf;
	}
	
	public void setSimpleDateFormat(SimpleDateFormat sdf2, Date d) {
		System.out.println("오늘 날짜 : " + sdf2.format(d));
	}
	
	// 1. 객체를 생성 해서 가져오는 경우 = 반환형을 통해서 객체를 얻어오는 경우(getXXX())
	// 형식) 접근지정자 반환형(객체형) getXXX() { return 생성한객체명; }
	public Date getDate() {
		/*
		Date d = new Date();
		return d;
		*/
		return new Date(); // 익명객체(이름이 없는 객체)
	}
	
	// 2. 만들어진 객체를 전달해서 대신 처리해주는 메소드
	// 형식) public void setXXX(전달 받을 클래스명 객체명(임의)) { 처리구문; }
	public void setDate(Date d1) {
		System.out.println("d1 : " + d1);
	}
}