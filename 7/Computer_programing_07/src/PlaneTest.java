
public class PlaneTest {
	public static void main(String[] args) {
		Plane p1 = new Plane("����", "2ȣ", "300��");
		Plane p2 = new Plane("400��");
		Plane p3 = new Plane();
		
		p1.print();
		p2.print();
		p3.print();
		int n = Plane.getPlanes();
		System.out.println("������ ����� ��  : " + n);
	}
}