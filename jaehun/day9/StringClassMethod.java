package day9;


public class StringClassMethod {
	
	static int n = 5;
	
	static void m() {
		System.out.println(StringClassMethod.n);
	}
	
	public static void main(String[] args) {
		String str = "hello world";
		char ch = 'l';
		int searchIndex;
		
		System.out.println("<" + str + " 에서 " + ch + " 위치> ");
			searchIndex = str.indexOf(ch);
			while(searchIndex != -1) {
				System.out.println("검색된 위치 : "  + searchIndex);
				searchIndex = str.indexOf(ch, searchIndex+1);
			}
			boolean bool = true;
			String s = bool + "";
			System.out.println(s);
			
		m();
	}
	
}
