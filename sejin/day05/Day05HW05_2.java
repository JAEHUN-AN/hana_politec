package kr.ac.kopo.day05;

import java.util.Scanner;

public class Day05HW05_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("라인 수 : ");
		int line = sc.nextInt();
		
		//짝수일 때 -1 라인으로 별그리기
		line = (line % 2 == 0) ? line-1 : line;
		int row = ( line - 1 ) / 2 ; //4
		
		for(int i=1;i<=line;++i) {
			if(i <= row + 1 ) {
				for(int j=1;j <= row+2-i ;++j) {
					System.out.print("*");
				}
				for(int j=1;j<=(i-1);++j) {
					System.out.print("-");
				}
			}else {
				for(int j=1;j <= i-row ;++j) {
					System.out.print("*");
				}
				for(int j=1;j<=line-i ; ++j) {
					System.out.print("-");
				}
			}
			
			System.out.println();
		}
		
		
		
	}//main
}
