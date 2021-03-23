package day11;

public class Triangle extends Shape{
    @Override
    public void printArea() {
    	int w = getWidth();
    	int h = getHeight();
    	System.out.println("가로 " + w + " * " + h + " 삼각형 면적은 " + (w*h)/2 + "입니다");
    }
}
