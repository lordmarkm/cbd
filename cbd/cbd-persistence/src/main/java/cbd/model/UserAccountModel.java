package cbd.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity @Table(name="USER_ACCOUNTS")
public class UserAccountModel implements Serializable {
	private static final long serialVersionUID = 4395259633560490951L;
	
	@Id @GeneratedValue @Column(name="USER_ID")
	private long userId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="USER_INFO_ID")
	private UserInfoModel userInfo;
	
	@Column
	private String displayName;
	
	@Column
	private String password;

	@Enumerated
	@Column
	private MemberType memberType;
	
	public UserAccountModel() {
		
	}
	public UserAccountModel(UserInfoModel userInfo) {
		this.userInfo = userInfo;
	}
	
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public long getUserId() {
		return userId;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public MemberType getMemberType() {
		return memberType;
	}

	public void setMemberType(MemberType memberType) {
		this.memberType = memberType;
	}
	public UserInfoModel getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(UserInfoModel userInfo) {
		this.userInfo = userInfo;
	}
}
