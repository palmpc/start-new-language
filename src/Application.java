
class Person{
	
	// class
	// 1. data
	// 2. Methods
	
	// Instance variables
	String name;
	String bloodType;
	
}


public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person1 = new Person();
		
		person1.name = "Rin";
		person1.bloodType = "O";
		
		Person person2 = new Person();
		person2.name = "Jera";
		person2.bloodType = "B";
		
		System.out.println(person1.name);
		System.out.println(person2.name);
		
		
	}		
}
		