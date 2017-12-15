package computer_programing_09;
public class GraduateStudentTest {
	public static void main(String[] args) {
		GraduateStudent g = new GraduateStudent();
		g.setName("홍길동");
		g.setId(201302043);
		g.setDepartment("컴퓨터공학과");
		g.setGrade(3);
		g.setCredit(20);
		g.setTa("교육 조교");
		g.setScholarship(0.5);
		
		System.out.println("이름 : " + g.getName() + ", 학번 : " + g.getId() + ", 소속 학과 : " + g.getDepartment() + ", 학년 : " + g.getGrade() + ", 이수 학점 수 : " + g.getCredit());
		System.out.println("조교 유형 : " + g.getTa() + ", 장학금 비율 : " + g.getScholarship());
	}
}
