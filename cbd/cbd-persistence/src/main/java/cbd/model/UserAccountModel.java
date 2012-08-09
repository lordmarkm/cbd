package cbd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity @Table(name="USER_ACCOUNTS")
public class UserAccountModel {
	@OneToOne @Cascade({CascadeType.ALL})
	@JoinColumn(name="USER_ID")
	private UserInfoModel userInfo;
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO) @Column(name="USER_ID")
	private long userId;
	
	@Column
	private String displayName;
	
	@Column
	private String password;

	@Enumerated
	@Column
	private MemberType memberType;
	
	public UserAccountModel() {
		this.userInfo = new UserInfoModel();
	}
	public UserAccountModel(UserInfoModel userInfo) {
		this.userInfo = userInfo;
	}
	
	public UserInfoModel getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfoModel userInfo) {
		this.userInfo = userInfo;
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
	
	public void setUserId(long userId) {
		this.userId = userId;
	}
}
