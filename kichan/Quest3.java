package kr.ac.kopo;

public class Quest3 {

	public static void main(String[] args) {
		for(int i = 1; i <= 5; ++i) {
			for(int j = 6; j > i; --j) {
				System.out.print('*');
			}
			System.out.println();
		}
		
	}
}
