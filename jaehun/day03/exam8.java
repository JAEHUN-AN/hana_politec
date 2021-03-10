package day3;

public class exam8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int h = 10, low = 1, high = 9;
 
        for (int i = 1; i < h; i++) {
            for (int j = 1; j < h; j++) {
                if (j <= low) {
                    System.out.print('*');
                } else if (j >= high) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            if (i > 4) {
                low--;
                high++;
            } else if (i < 5) {
                low++;
                high--;
            }
            System.out.println();
        }
    
	}

}
