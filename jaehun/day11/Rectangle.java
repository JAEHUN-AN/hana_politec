package day11;

public class Rectangle extends Shape{
    @Override
    public void printArea() {
    	int w = getWidth();
    	int h = getHeight();
    	System.out.println("가로 " + w + " * " + h + " 직사각형 면적은 " + (w*h) + "입니다");
    }
}
