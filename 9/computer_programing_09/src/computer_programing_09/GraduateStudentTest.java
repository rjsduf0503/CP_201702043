package computer_programing_09;
public class GraduateStudentTest {
	public static void main(String[] args) {
		GraduateStudent g = new GraduateStudent();
		g.setName("ȫ�浿");
		g.setId(201302043);
		g.setDepartment("��ǻ�Ͱ��а�");
		g.setGrade(3);
		g.setCredit(20);
		g.setTa("���� ����");
		g.setScholarship(0.5);
		
		System.out.println("�̸� : " + g.getName() + ", �й� : " + g.getId() + ", �Ҽ� �а� : " + g.getDepartment() + ", �г� : " + g.getGrade() + ", �̼� ���� �� : " + g.getCredit());
		System.out.println("���� ���� : " + g.getTa() + ", ���б� ���� : " + g.getScholarship());
	}
}
