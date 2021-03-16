package day6;

import java.util.Scanner;

public class IcreamMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("아이스크림 몇 개 구입할꺼야? : ");
		int num = sc.nextInt();
		
		Icecream[] iceArr = new Icecream[num];
		for(int i = 0; i < num; i++) {
			iceArr[i] = new Icecream();
			System.out.println("***"+(i+1)+"번째 아이스크림 구매 정보 입력");
			System.out.println("아이스크림 명 : ");
			iceArr[i].name = sc.next();
			System.out.println("아이스크림 가격 : ");
			iceArr[i].price = sc.nextInt();
		}
		int sum = 0;
		for(int i = 0; i < num; i++) {
			System.out.println("번호    아이스크림명   아이스크림가격");
			System.out.println(i+1 +"         " + iceArr[i].name + "          " + iceArr[i].price);
			sum += iceArr[i].price;
		}
		System.out.println("총계 : " + sum + "원");
	}
}
