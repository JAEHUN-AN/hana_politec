package day3;

public class exam5_if2for2 {
	public static void main(String[] args) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0 ; j < 6; j++) {
				if(j - i <= 0 && i < 5) {
					System.out.print(' ');
				}
				else if(9 - i > j && i >= 5) {
					System.out.print(' ');
				}
				else {
					System.out.print('*');
				}
				
			}
			
		System.out.println();
		}
	}
}
