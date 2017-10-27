
public class Person {

		// Instance variables
		String name = "Rin";
		String bloodType = "O";
		
		int age = 20;
		
		
		void speak(String name, String bloodType) {
			System.out.println("저의 이름은 " + name + " 이고 혈액형은 " + bloodType + " 입니다." );
			
		}		
		
		String getName() {
			return name;
		}

		int getAge() {
			return age;
		}
}
