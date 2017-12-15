package computer_programing_09;
public class Student {
	public String name, department;
	public int id, grade, credit;
	public Student(){}
	public String getName(){ return name; }
	public void setName(String n){ name = n; }
	public int getId(){ return id; }
	public void setId(int i){ id = i; }
	public String getDepartment(){ return department; }
	public void setDepartment(String d){ department = d; }
	public int getGrade(){ return grade; }
	public void setGrade(int g){ grade = g; }
	public int getCredit(){ return credit; }
	public void setCredit(int c){ credit = c; }
}
class UnderGraduate extends Student{
	public UnderGraduate(){}
	private String club;
	public String getClub(){ return club; }
	public void setClub(String cl){ club = cl; }
}
class GraduateStudent extends Student{
	public GraduateStudent(){}
	private String ta;
	private double scholarship;
	public String getTa(){ return ta; }
	public void setTa(String t){ ta = t; }
	public double getScholarship(){ return scholarship; }
	public void setScholarship(double s){ scholarship = s; }
	
}