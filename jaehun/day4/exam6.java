package day4;

import java.util.Scanner;

public class exam6 {
	public static void main(String[] args) {
		//6. 10개의 정수를 입력 받아 다음과 같이 출력
		// <짝수>
		// 1 2 3 4
		// 짝수 총합 : xx
		System.out.println("숫자 10개를 입력 : ");
		Scanner sc = new Scanner(System.in);
		int num[] = new int[10];
		//입력
		for (int i = 0; i < num.length; i++ )
			num[i] = sc.nextInt();
		//출력
		for(int i = 0; i < num.length; i++) 
			System.out.printf("%d's 정수 : %d\n", i + 1 , num[i]);
		
		for(int i = 0; i < num.length; i++) 
			System.out.printf("%d's 정수 : %d\n", i + 1 , num[i]);
		
		System.out.println("<짝수>");		
		for(int i = 0; i < num.length; i++)
			if(num[i] % 2 == 0)
				System.out.printf("%d ", num[i]);
			
		System.out.println("\n<홀수>");
		for(int i = 0; i < num.length; i++)
			if(num[i] % 2 == 1)
				System.out.printf("%d ", num[i]);
		
	}
}
