package day4;

import java.util.Scanner;

public class exam4 {
	public static void main(String[] args) {
		//4. 소수 판별
		System.out.println("숫자 입력 : ");
		Scanner sc = new Scanner(System.in);
		double num = sc.nextInt();
		double max = Math.sqrt(num);
		
		if(num <= 1) return;
		
		for (int i = 2; i < max; i++) {
			if(num % i == 0) {
				System.out.printf("%d는 소수가 아닙니다", (int)num);
				return;
			}
		
		}
		System.out.printf("%d는 소수입니다", (int)num);
	}
}
