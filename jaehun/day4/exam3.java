package day4;

public class exam3 {
	public static void main(String[] args) {
		//3. 달팽이가 100m 깊이 우물에 빠짐. 달팽이는 3m/h로 이동한다.
		// 50m 미만일 때는 -1m/hour, 50m 이상일 때는 -2m/h 
		// 몇시간 후 탈출할까
		int dalpang = 0, h = 0;
		
		while (dalpang < 100) {
			dalpang += 3;
			if(dalpang < 50)
				dalpang -= 1;
			if(dalpang >= 50)
				dalpang -= 2;
			h++;
			System.out.printf("[%d시간 후] 달팽이가 올라간 총 높이 : %dM\n", h, dalpang);
		}
	System.out.println(h);
	}
}
