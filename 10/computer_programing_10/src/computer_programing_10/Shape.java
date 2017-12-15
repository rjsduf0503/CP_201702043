package computer_programing_10;
public class Shape {
	public int width, height;
	public void Shape(int width, int height){
		this.width = width;
		this.height = height;
	}
	int area(){
		return area();
	}
}
class Triangle extends Shape{
	int area(){
		int area = width * height / 2;
		System.out.println("»ï°¢ÇüÀÇ ³ĞÀÌ  : " + area);
		return area;
	}
}
class Rectangle extends Shape{
	int area(){
		int area = width * height;
		System.out.println("»ç°¢ÇüÀÇ ³ĞÀÌ : " + area);
		return area;
	}
}
class Circle extends Shape{
	int area(){
		height = width;
		int area = (int)(width/2 * height/2 * Math.PI); //width=height=2*radius
		System.out.println("¿øÀÇ ³ĞÀÌ : " + area);
		return area;
	}
}