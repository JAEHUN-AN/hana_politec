package day5;

import java.util.Scanner;

public class Exam2 {
	public static void main(String[] args) {
		//2. 다음과 같은 결과를 보이는 프로그램 작성
//		짝수 몇개 입력 : 5
//		홀수 몇개 입력 : 4
//		
//		num1 : 12
//		num2 : 9
//		num3 : 67
//		num4 : 20
//		num5 : 9
//		num6 : 31
//		num7 : 24
//		num8 : 5
//		num8 : 11
//		num8 : 10
//		num9 : 6
//		
//		< PRINT >
//		12  20  24  10  6  31  9  67  9
		Scanner sc = new Scanner(System.in);
		int even, odd;
		System.out.print("짝수 몇개 입력 : ");
		even = sc.nextInt();
		System.out.print("홀수 몇개 입력 : ");
		odd = sc.nextInt();
		
		int[] num = new int[even + odd];
		System.out.println(even+odd + "개 입력 : ");
		for (int i = 0; i < even + odd; i++) {
			num[i] = sc.nextInt();
			System.out.println("num" + i + " : " + num[i]);
		}
		
		for(int i = 0; i < even + odd-1; i++) {
			for(int j = 0; j< even + odd-1; j++) {
				
				if(num[j] % 2 != 0) {
					int temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
				}
			}
		}
		
		System.out.println("< PRINT >");
		for (int i = 0 ; i < even + odd; i++) {
			System.out.print(num[i] + " ");
			
		}
	}
}
