
public class PlaneTest {
	public static void main(String[] args) {
		Plane p1 = new Plane("보잉", "2호", "300명");
		Plane p2 = new Plane("400명");
		Plane p3 = new Plane();
		
		p1.print();
		p2.print();
		p3.print();
		int n = Plane.getPlanes();
		System.out.println("생성된 비행기 수  : " + n);
	}
}