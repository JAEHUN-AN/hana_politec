package day4;

import java.util.Scanner;

public class exam5 {
	public static void main(String[] args) {
		//5. 2~100 사이 소수 출력
		int flag;
		for (int i = 2; i <= 100; i++) {
			flag = 0;
			for (int j = 2; j < i ; j++) {
				if(i % j == 0) {
					flag = 1;
					break;
				}
			}
			if(flag == 0)
				System.out.print(i + " ");
		}
	}
}

