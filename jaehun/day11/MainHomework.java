package day11;

import java.util.Scanner;

public class MainHomework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("도형을 선택하세요(1. 직사각형, 2. 정사각형, 3.삼각형, 4.원) => "
        );
        int num = sc.nextInt();
        sc.nextLine();
        switch(num){
            case 1 : 
                System.out.println("직사각형 선택");
                Rectangle r = new Rectangle();
                r.printArea();
                break;
            case 2 : 
                System.out.println("정사각형 선택");
                Square s = new Square();
                s.printArea();
                break;
            case 3 : 
                System.out.println("삼각형 선택");
                Triangle t = new Triangle();
                t.printArea();
                break;
            case 4 : 
                System.out.println("원 선택");
                Circle c = new Circle();
                c.printArea();
                break;
        }
    }
}
