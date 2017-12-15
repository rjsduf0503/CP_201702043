package computer_programing_05;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee myEmployee = new Employee();
		myEmployee.setName("유건열");
		myEmployee.setPn("010-5019-xxxx");
		myEmployee.setAi(50000000);

		System.out.println("이름 : " + myEmployee.getName());
		System.out.println("전화번호 : " + myEmployee.getPn());
		System.out.println("연봉 : " + myEmployee.getAi());
	}

}
