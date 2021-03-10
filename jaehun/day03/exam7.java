package day3;

public class exam7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int o = 9 / 2; 
		 
         for (int i = -o; i <= o; i++) { 
             int k = 0;
             for (int j = 0; j < 9 - Math.abs(i); j++) { 
                 char result = k < Math.abs(i) ? ' ' : '*'; 
                 System.out.print(result);
                 k++; 
             }
             System.out.println();
         }
	}

}
