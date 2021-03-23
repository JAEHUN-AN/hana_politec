package day11;

public class Circle extends Shape{
    @Override
    public void printArea() {
    	int r = getWidth();
    	System.out.println("반지름 " + r +  " 의 면적은 " + (r*r) + "π 입니다");
    }
}
