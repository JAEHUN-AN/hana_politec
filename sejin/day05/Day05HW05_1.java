package kr.ac.kopo.day05;

import java.util.Scanner;

public class Day05HW05_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("라인 수 : ");
		int line = sc.nextInt();
		
		for(int i=1;i<=line;++i) {
			for(int j=1;j <= line-i;++j) {
				System.out.print("-");
			}
			for(int j=1;j <= i; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}//main
}
