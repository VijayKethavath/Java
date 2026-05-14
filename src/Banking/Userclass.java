package Banking;

public class Userclass {
	private String name;
	private long number;
	private long acnumber;



	public Userclass(String name, long number, long acnumber) {
		super();
		this.name = name;
		this.number = number;
		this.acnumber = acnumber;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public long getAcnumber() {
		return acnumber;
	}

	public void setAcnumber(long acnumber) {
		this.acnumber = acnumber;
	}
}


	