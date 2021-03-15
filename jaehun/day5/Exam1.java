package day5;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0~99 사이의 정수를 5개 입력 바아 다음과 같이 출력하는 코드를 작성하시오
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		int valid;
		
		//0~99 사이 5개 정수 입력 
		for (int i = 0; num[4] == 0; ) {
			System.out.print("정수 입력 : ");
			valid = sc.nextInt();
			if(valid >= 0 && valid <= 99) {
				num[i] = valid;
				i++;
			}else {
				System.out.println("0~99 사이의 정수를 입력해주세요.");
			}
			System.out.println();
		}
		
		//정방향 출력
		System.out.println("정방향 배열 출력 : ");
		for(int a : num) {
			System.out.print(a + " ");
		}
		System.out.println();
		//역방향 출력
		System.out.println("역방향 배열 출력 : ");
		for (int a = 4; a >= 0; a--) {
			if(num[a] < 10) {
				System.out.print(num[a] + "0 ");
			}else if(num[a] >= 10 )
				System.out.printf("%d%d ",num[a] % 10, num[a] / 10);
		}
		
	}

}
