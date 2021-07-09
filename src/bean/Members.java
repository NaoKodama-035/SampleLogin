package bean;

public class Members implements java.io.Serializable {

	private int id;
	private String userid;
	private String name;
	private String password;

	public int getId() {
		return id;
	}

	public String getUserId() {
		return userid;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setUserId(String userid) {
		this.userid = userid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
