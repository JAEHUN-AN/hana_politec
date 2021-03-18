package day8;

class Member {

		
	String name;
	int age;
	String str;	
		
	Member(){
		name = "알수없음";
		age = -1;
		str = "알수없음";
	}
	
	Member(String name){
		this.name = name;
	}
	
	Member(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void info() {
		System.out.println("name : " + name + " age : "+ age + " str : " + str);
	}
}
