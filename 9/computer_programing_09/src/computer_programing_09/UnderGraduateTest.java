package computer_programing_09;
public class UnderGraduateTest {
	public static void main(String[] args) {
		UnderGraduate u = new UnderGraduate();
		u.setName("���ǿ�");
		u.setId(201702043);
		u.setDepartment("��ǻ�Ͱ��а�");
		u.setGrade(1);
		u.setCredit(17);
		u.setClub("ProBrain");
		
		System.out.println("�̸� : " + u.getName() + ", �й� : " + u.getId() + ", �Ҽ� �а� : " + u.getDepartment() + ", �г� : " + u.getGrade() + ", �̼� ���� �� : " + u.getCredit());
		System.out.println("�Ҽ� ���Ƹ� �� : " + u.getClub());
	}
}

