
public class Person {

		// Instance variables
		String name = "Rin";
		String bloodType = "O";
		
		int age = 20;
		
		
		void speak(String name, String bloodType) {
			System.out.println("���� �̸��� " + name + " �̰� �������� " + bloodType + " �Դϴ�." );
			
		}		
		
		String getName() {
			return name;
		}

		int getAge() {
			return age;
		}
}
