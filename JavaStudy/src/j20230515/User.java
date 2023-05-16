package j20230515;

public class User {
	
	String name;
	int age;
	String hobby;
	
	/*public User(String name, int age, String hobby) {
		this.name = name;
		this.age = age;
		this.hobby = hobby;
	}*/

	public User() {
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getHobby() {
		return hobby;
	}
	
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
}
