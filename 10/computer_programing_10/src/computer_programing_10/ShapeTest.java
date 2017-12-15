package computer_programing_10;

public class ShapeTest {

	public static void main(String[] args) {
		Shape[] sh = new Shape[3];
		sh[0] = new Triangle();
		sh[1] = new Rectangle();
		sh[2] = new Circle();
		
		System.out.println("<다형성 이용한 도형의 면적 출력 프로그램>");
		
		for(int i=0; i<sh.length; i++){
			sh[i].Shape(10, 10);
			sh[i].area();
		}
	}
}
