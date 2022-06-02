package entities;

public class Rent {
	
	private String tenantName;
	private String email;
	private int room;
	
	public Rent() {
	
	}

	public Rent(String tenantName, String email, int room) {
		this.tenantName = tenantName;
		this.email = email;
		this.room = room;
	}

	public String getTenantName() {
		return tenantName;
	}

	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}
	
	public String toString() {
		return room 
				+ ": "
				+ tenantName
				+ ", "
				+ email;
	}
		
	
	

}
