package day3;

public class exam6 {
	public static void main(String[] args) {
		int start = 0, end = 10;
		for(int i = 0; i < 9; i++) {
		    if(i < 5){
		  	start = i;
		  	end--;	
		    }else{
		  	start--;
		  	end++;	
		    }
		    for(int j = start; j > 0; j--){
		    	System.out.print(' ');
		    } 
		    for(int j = start; j < end; j++){
		    	System.out.print('*');
		    }
		    System.out.println();
		}
	}
}
