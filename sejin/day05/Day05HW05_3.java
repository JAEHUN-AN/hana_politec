package kr.ac.kopo.day05;

import java.util.Scanner;

public class Day05HW05_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("라인 수 : ");
		int line = sc.nextInt();
		
		//짝수일 때 -1 라인으로 별그리기
		line = (line % 2 == 0) ? line-1 : line;
		int row = ( line - 1 ) / 2 ; //line=9 > 4
		
		for(int i=1;i<=line ;++i) {
			if(i<=row+1) { 
				for(int j =1;j<i;++j) {
					System.out.print("-");
				}
				for(int j=1;j<=line-2*(i-1);++j) {
					System.out.print("*");
				}
				
			}else {
				for(int j=0;j<line-i;++j) {
					System.out.print("-");
				}
				for(int j=0;j<2*(i-(row+1))+1;++j) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
		
	}//main
}
