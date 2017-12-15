
public class Dog {
	private String name;
	public static String breed;
	private int age;

	public Dog(String name, int age){
		setDog(name, "포메라니안", age);
	}
	public Dog(String name, String breed, int age){
		setDog(name, breed, age);
	}
	private void setDog(String name, String breed, int age){
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	public void print(){
		System.out.println("강아지의 이름 : " + name);
		System.out.println("강아지의 종류 : " + breed);
		System.out.println("강아지의 나이 : " + age);
	}
}