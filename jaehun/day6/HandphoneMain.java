package day6;

public class HandphoneMain {
	public static void main(String[] args) {
		Handphone hp = new Handphone();
		hp.name = "안재훈";
		hp.phone = "010-2222-3333";
		hp.company = "samsung";
		
		Handphone hp2 = new Handphone();
		hp2.name = "안재훈";
		hp2.phone = "010-2222-3333";
		hp2.company = "samsung";
		
		Handphone hp3 = new Handphone();
		hp3.name = "안재훈";
		hp3.phone = "010-2222-3333";
		hp3.company = "samsung";
		
		Handphone[] hpArr = {hp,hp2,hp3};
		
		for(int i = 0; i< hpArr.length; i++) {
			System.out.println("소유주명 : " + hpArr[i].name + ", 전화번호 :" + hpArr[i].phone + ", 제조사 : " + hpArr[i].company);
		}
		
	}
}
