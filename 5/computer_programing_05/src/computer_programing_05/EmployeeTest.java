package computer_programing_05;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee myEmployee = new Employee();
		myEmployee.setName("���ǿ�");
		myEmployee.setPn("010-5019-xxxx");
		myEmployee.setAi(50000000);

		System.out.println("�̸� : " + myEmployee.getName());
		System.out.println("��ȭ��ȣ : " + myEmployee.getPn());
		System.out.println("���� : " + myEmployee.getAi());
	}

}
