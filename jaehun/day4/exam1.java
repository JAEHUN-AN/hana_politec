package day4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class exam1 {
	//3개의 정수를 입력 받아 큰 수에서 작은 수 순으로 출력
	public static void main(String[] args) {
		System.out.println("숫자 3개를 입력 : ");
		Scanner sc = new Scanner(System.in);
		int num[] = new int[3];
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
		
		for(int i : num)
			System.out.print(i + " ");
		}
	
	
		
}
