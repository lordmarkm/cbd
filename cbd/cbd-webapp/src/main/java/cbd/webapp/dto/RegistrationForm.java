package cbd.webapp.dto;

import cbd.model.MemberType;
import cbd.model.UserAccountModel;
import cbd.model.UserInfoModel;

public class RegistrationForm {

	private UserAccountModel userAccount;
	
	public RegistrationForm() {
		this.userAccount = new UserAccountModel(new UserInfoModel());
	}
	public RegistrationForm(UserAccountModel userAccount) {
		this.userAccount = userAccount;
	}
	
	//for user info
	public String getFirstName() {
		return getUserInfo().getFirstName();
	}
	public String getLastName() {
		return getUserInfo().getLastName();
	}
	public void setFirstName(String firstName) {
		getUserInfo().setFirstName(firstName);
	}
	public void setLastName(String lastName) {
		getUserInfo().setLastName(lastName);
	}
	public UserInfoModel getUserInfo() {
		return userAccount.getUserInfo();
	}
	
	//for user account
	public String getDisplayName() {
		return userAccount.getDisplayName();
	}
	public String getPassword() {
		return userAccount.getPassword();
	}
	public MemberType getMemberType() {
		return userAccount.getMemberType();
	}
	public void setDisplayName(String name) {
		userAccount.setDisplayName(name);
	}
	public void setPassword(String password) {
		userAccount.setPassword(password);
	}
	public void setMemberType(MemberType memberType) {
		userAccount.setMemberType(memberType);
	}
	public UserAccountModel getUserAccount() {
		return userAccount;
	}
	public long getUserId() {
		return userAccount.getUserId();
	}
	public void setUserId(long userId) {
		userAccount.setUserId(userId);
	}
}
