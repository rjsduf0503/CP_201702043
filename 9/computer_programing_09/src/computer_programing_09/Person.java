package computer_programing_09;
public class Person {
	public String name, address, phone;
	public Person(){
	}
	public String getName(){ return name; }
	public void setName(String n){ name = n; }
	public String getAddress(){ return address; }
	public void setAddress(String a){ address = a; }
	public String getPhone(){ return phone; }
	public void setPhone(String p){ phone = p; }
}
class Customer extends Person{
	public Customer(){
	}
	private int cusnum, mileage;
	public int getCusnum(){ return cusnum; }
	public void setCusnum(int c){ cusnum = c; }
	public int getMileage(){ return mileage; }
	public void setMileage(int m){ mileage = m; }
	
	public void print(){
		System.out.println("�̸� : " + name);
		System.out.println("�ּ� : " + address);
		System.out.println("��ȭ��ȣ : " + phone);
		System.out.println("�� ��ȣ : " + cusnum + "��");
		System.out.println("���ϸ��� : " + mileage + "��");
	}
}
