
public class User {

	String userName;
	
	public User() {
		this("여러개의 생성자를 실행", 1);
		System.out.println("자동생성");
	}
	public User(String userName) {
		this.userName = userName;
		System.out.println(userName);
		System.out.println("유저 네임은 ");
	}
	
	public User(String userName, int level) {
		System.out.println("레벨");
	}
	void setUserName(String userName) {	
		this.userName = userName;		
	}
	
	String getUserName() {
		return userName;
	}
}


//getter
//setter

