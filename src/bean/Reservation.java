package bean;

public class Reservation implements java.io.Serializable {

	private int number;
	private String name;
	private String date;
	private String time;

	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public String getDate() {
		return date;
	}

	public String getTime() {
		return time;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setTime(String time) {
		this.time = time;
	}

}
