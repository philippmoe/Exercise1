
public class HelloUser {
	private String userName;

	public HelloUser(String userName) {
		this.setUserName(userName);
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return this.userName;
	}
	
	public String greetUser(){
		return "Hello " + this.getUserName() +"!";
	}

}
