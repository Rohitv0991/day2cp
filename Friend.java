import java.util.Scanner;

public class Friend {
	private String name;
	private int age;
	
	Friend(String n, int a) {
		this.name = n;
		this.age = a;
	}
	
	public void showName() {
		System.out.println(this.name);
	}
	public void showAge() {
		System.out.println(this.age);
	}
	public void setName(String newName) {
		this.name = newName;
	}
	public void setAge(int newAge) {
		this.age = newAge;
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		String name = scan.next();
		int age = scan.nextInt();
		
		Friend f = new Friend(name, age);
		f.showName();
		f.showAge();
		
		String newName = scan.next();
		int newAge = scan.nextInt();
		scan.close();
		
		f.setName(newName);
		f.setAge(newAge);
		
		f.showName();
		f.showAge();
	}
}
