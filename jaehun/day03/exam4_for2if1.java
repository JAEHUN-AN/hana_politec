package day3;

import java.util.Scanner;

public class exam4_for2if1 {
	public static void main(String[] args) {
		System.out.println("3 - 20 사이의 라인수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		
		int start = 0, end = num;
		for (int i = 1; i <= num; i++) {
			if (i <= num/2 +1 ) {
				start = i;
				end--;
			}
			else {
				start = end;
				end--;
			}
			for (int j = start; j > 0; j--)
				System.out.print('*');				
			
			System.out.println();
		
		}
	}
}