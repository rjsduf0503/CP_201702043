package computer_programing_09;
public class UnderGraduateTest {
	public static void main(String[] args) {
		UnderGraduate u = new UnderGraduate();
		u.setName("유건열");
		u.setId(201702043);
		u.setDepartment("컴퓨터공학과");
		u.setGrade(1);
		u.setCredit(17);
		u.setClub("ProBrain");
		
		System.out.println("이름 : " + u.getName() + ", 학번 : " + u.getId() + ", 소속 학과 : " + u.getDepartment() + ", 학년 : " + u.getGrade() + ", 이수 학점 수 : " + u.getCredit());
		System.out.println("소속 동아리 명 : " + u.getClub());
	}
}

