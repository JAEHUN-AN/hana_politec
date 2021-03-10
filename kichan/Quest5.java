package kr.ac.kopo;

public class Quest5 {

	public static void main(String[] args) {
		for (int i = 1; i<=9; i++) {
			if(i <= 5 ) {
				int j;
				for(j = 1; j<= i; j++) {
				System.out.print('_');
				}
				for(int k = 5-i+1; k >= 1; k--) {
					System.out.print('*');
				}
			}
			else {
				for(int j =10; j>i; j--) {
					System.out.print('_');
				}
				for(int k = 5+i ; k>=1 ; k++) {
					System.out.print('*');
				}
			}
			System.out.println();
		}
	}
	
}
