package cbd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="USER_INFO")
public class UserInfoModel {
	@Id 
	@GeneratedValue
	@Column(name="USER_INFO_ID")
	private long userId;
	
	@Column
	private String firstName;
	
	@Column
	private String lastName;

	public UserInfoModel() {

	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public long getUserId() {
		return userId;
	}
	
	public void setUserId(long userId) {
		this.userId = userId;
	}
}
