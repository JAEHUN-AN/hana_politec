package day13;

import java.util.Scanner;

public class HomeWork01 {


	static void register() throws LottoNumberException {
		Scanner sc = new Scanner(System.in);
		System.out.print("좋아하는 로또 번호를 입력하세요 : ");
		int n = sc.nextInt();
		sc.nextLine();
		//1~45 사이가 아니면 throw
		if(n > 45 || n < 1)
			throw new LottoNumberException("1 - 45 사이만 가능합니다. " + n + "은 올바르지 않습니다.");
		
		System.out.println(n + "를 포함해서 로또번호들을 추출하겠습니다.");
	}

	public static void main(String[] args) {
		
		try {
			register();
		} catch(Exception e) {
			System.out.println(e );
			
		}

	}
}