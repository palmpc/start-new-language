
public class User {

	String userName;
	
	public User() {
		this("�������� �����ڸ� ����", 1);
		System.out.println("�ڵ�����");
	}
	public User(String userName) {
		this.userName = userName;
		System.out.println(userName);
		System.out.println("���� ������ ");
	}
	
	public User(String userName, int level) {
		System.out.println("����");
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

