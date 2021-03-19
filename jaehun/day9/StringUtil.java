package day9;

public class StringUtil {
	
	public boolean isUpperChar(char c) {
		if('A' <= c && c <= 'Z')
			return true;
		return false;
	}
	
	public boolean isLowerChar(char c) {
		if('a' <= c && c <= 'z')
			return true;
		return false;
	}
	
	public int max(int i, int j) {
		return i > j ? i : j;
	}
	
	public int min(int i, int j) {
		return i < j ? i : j;
	}
	
	public String reverseString(String str) {
		String temp="";
		
		//temp에 역순 str을 넣어준다.
		for(int i = str.length()-1; i >= 0; i--) {
			temp += str.charAt(i);
		}
		str = temp;
		return str;
	}
	
	public String toUpperCase(String str) {
		String temp = "";
		
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c >= 'a' && c <= 'z') {
				temp += (char)(c - 'a' + 'A');
			}else {
				temp += c;
			}
		}
		return temp;
	}
	
	public String toLowwerCase(String str) {
		String temp = "";
		
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c >= 'A' && c <= 'Z') {
				temp += (char)(c - 'A' + 'a');
			}else {
				temp += c;
			}
		}
		return temp;
	}
	
	public static int checkChar(String strData, char ch) {
		int cnt = 0;
		for(int i = 0; i < strData.length(); i++) {
			if(strData.charAt(i) == ch) 
				cnt++;
		}
		return cnt;
	}
	
	public static String removeChar(String oriStr, char delChar) {
		String str = "";
		for(int i = 0; i < oriStr.length(); i++) {
			char c = oriStr.charAt(i);
			if(c == delChar) {
				continue;
			}
			else {
				str += c;
			}
		}
		return str;
	}
	
}
