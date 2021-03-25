package day13;

import java.util.Calendar;
import java.util.Scanner;

public class HomeWork02 {

	public static void main(String[] args) {
		boolean flag = true;
		while(flag) {
			// 3 입력 전까지 반복
			flag = HomeWork02.selectDay();
		}
	}
	
	
	public static boolean selectDay() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("선택하세요(1. 특정년도   2. 특정월   3. 종료) => ");
		int type = sc.nextInt();
		sc.nextLine();
		
		if(type == 1) {
			//년도 입력
			System.out.println("년도를 입력하세요 : ");
			int year = sc.nextInt();
			sc.nextLine();
			
			for(int i = 0; i < 12; i++) {
				print(year,i);
				
			}
			
		}else if (type == 2) {
			//년도, 월 입력
			System.out.println("년도를 입력하세요 : ");
			int year = sc.nextInt();
			sc.nextLine();
			
			System.out.println("월을 입력하세요 : ");
			int month = sc.nextInt();
			sc.nextLine();
			
			//출력
			print(year, month);
			
		}else if (type == 3){
			return false;
		}else {
			System.out.println("다시 입력하세요.");
		}
		
		return true;
	}

	public static void print(int year, int month) {
		String[] dayArr = {"", "일", "월", "화", "수", "목", "금", "토"};
		Calendar c = Calendar.getInstance();
		c.set(year, month, 1);
		
		//print 부분
		System.out.println("<<" + year +"년 " + (month + 1) + "월 >>");
		for(int i = 1;  i < dayArr.length; i++) {
			System.out.print("    " + dayArr[i]); 
		}
		System.out.println();
		// 일(1)~토(7) ,  수요일 = 4 
		int startday = c.get(Calendar.DAY_OF_WEEK);
		int lastday = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		int i;
		for(i = 1; i < startday; i++) {
			System.out.printf("     ");
		}
		for(int j = 1; j <= lastday; j++) {
			System.out.printf("%5d", j);
			if((i + j - 1) % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}
}
