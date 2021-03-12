package day4;

import java.util.Scanner;

public class exam2 {
	//2. 4개의 정수를 입력 받아 가장 큰 수를 출력
	public static void main(String[] args) {
		System.out.println("숫자 4개를 입력 : ");
		Scanner sc = new Scanner(System.in);
		int num[] = new int[4];
		//입력
		for (int i = 0; i < num.length; i++ )
				num[i] = sc.nextInt();
		int temp;
		for(int i = 0; i < num.length; i++) {
			for(int j = i+1; j < num.length; j++) {
				if(num[i] < num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		
		System.out.print(num[0]);
		}
	
	
}
