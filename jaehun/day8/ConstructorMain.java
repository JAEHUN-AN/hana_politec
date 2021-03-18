package day8;

public class ConstructorMain {
	public static void main(String[] args) {
		
	
		Member m = new Member();
		Member m2 = new Member("홍길동");
		Member m3 = new Member("홍길동", 20);
	
		m.info();
		m2.info();
		m3.info();
	}
}
