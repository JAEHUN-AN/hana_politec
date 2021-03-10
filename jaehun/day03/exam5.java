package day3;

public class exam5 {
	public static void main(String[] args) {
		int start = 0, end = 9;
		for (int i = 1; i <= 9; i++) {
			if (i <= 5) {
				start = i;
				end--;
			}
			else {
				start = end;
				end--;
			}
			for (int j = start; j > 0; j--)
				System.out.print('*');				
			
			System.out.println();
		
		}
	}
}
