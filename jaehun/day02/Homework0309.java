package kr.ac.kopo.day02;

import java.util.*;

public class Homework0309 {
	public static void main(String[] args) {
		//1. 2개의 정수를 입력받아 다음과 같이 출력하는 코드 작성
		System.out.println("2개의 정수를 입력받아 다음과 같이 출력하는 코드 작성\n");
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.println("첫번째 정수 : ");
		int num1 = sc1.nextInt();
		System.out.println("두번째 정수 : ");
		int num2 = sc2.nextInt();
		
		
		System.out.printf("%d + %d = %d\n", num1, num2, num1+num2  );
		System.out.printf("%d - %d = %d\n", num1, num2, num1-num2  );
		System.out.printf("%d * %d = %d\n", num1, num2, num1*num2  );
		System.out.printf("%d / %d = %.2f\n", num1, num2, (float)num1/num2  );
		System.out.printf("%d %% %d = %d\n", num1, num2, num1%num2 );
		
		//2. 반지름 입력받아 원둘레와 원넓이를 출력하는 코드를 작성(단, 원주율을 상수변수를 사용해서 작성)
		System.out.println("\n반지름 입력받아 원둘레와 원넓이를 출력하는 코드를 작성(단, 원주율을 상수변수를 사용해서 작성)\n");
		Scanner sc3 = new Scanner(System.in);
		System.out.println("반지름 : ");
		int r = sc3.nextInt();
		final double PI = 3.14;
		
		System.out.printf("원둘레 = %f\n", (double)2*r*PI);
		System.out.printf("원넓이 = %f\n", (double)r*r*PI);
		
		//3. 2960원어치 물건을 사고 5000원을 입력했을 때 거스름돈과 1000, 500, 100, 50, 10원의 개수를
		//출력하는 코드를 작성
		System.out.println("\n2960원어치 물건을 사고 5000원을 입력했을 때 거스름돈과 1000, 500, 100, 50, 10원의 개수를\r\n"
				+ "		//출력하는 코드를 작성\n");
		System.out.println("물건값을 입력하세요 : ");
		Scanner sc4 = new Scanner(System.in);
		int thing = Integer.parseInt(sc4.nextLine());
		
		System.out.println("\n지불한 돈 : ");
		Scanner sc5 = new Scanner(System.in);
		int pay = Integer.parseInt(sc5.nextLine());
		
		if(thing > pay) {
			System.out.printf("\n%d원이 부족합니다.\n", thing - pay);
		}
		else {
			int payback = pay - thing;
			System.out.println("<방식1>");
			System.out.printf("거스름돈 : %d원\n", payback);
			System.out.printf("1000원 : %d개\n", payback / 1000);
			System.out.printf("500원 : %d개\n", (payback % 1000) / 500);
			System.out.printf("100원 : %d개\n", ((payback % 1000) % 500) / 100);
			System.out.printf("50원 : %d개\n", (((payback % 1000) % 500) % 100) / 50);
			System.out.printf("10원 : %d개\n", ((((payback % 1000) % 500) % 100) % 50) / 10);

			System.out.println("\n<방식2>");
			if(payback / 1000 != 0) 
				System.out.printf("1000원 : %d개\n", payback / 1000);
			if((payback % 1000) / 500 != 0) 
				System.out.printf("500원 : %d개\n", (payback % 1000) / 500);
			if(((payback % 1000) % 500) / 100 != 0) 
				System.out.printf("100원 : %d개\n", ((payback % 1000) % 500) / 100);
			if((((payback % 1000) % 500) % 100) / 50 != 0) 
				System.out.printf("50원 : %d개\n", (((payback % 1000) % 500) % 100) / 50);
			if(((((payback % 1000) % 500) % 100) % 50) / 10 != 0) 
				System.out.printf("10원 : %d개\n", ((((payback % 1000) % 500) % 100) % 50) / 10);

		
		//4. 두 개의 정수를 입력받아 첫번째 정수가 두번째 정수의 배수인지를 판단하는 프로그램을 작성
		System.out.println("\n두 개의 정수를 입력받아 첫번째 정수가 두번째 정수의 배수인지를 판단하는 프로그램을 작성\n");
		Scanner sc6 = new Scanner(System.in);
		Scanner sc7 = new Scanner(System.in);
		System.out.println("첫번째 정수 : ");
		int num3 = sc6.nextInt();
		System.out.println("두번째 정수 : ");
		int num4 = sc7.nextInt();
		
		
		System.out.printf("%d가 %d의 배수인지 판단 결과 : \n", num1, num2);
		if(num4 != 0 && num3 % num4 == 0) {	
			System.out.println(num3 % num4 == 0);
			System.out.println("참");
			}
		else
			System.out.println("false");
		}
	}
}
