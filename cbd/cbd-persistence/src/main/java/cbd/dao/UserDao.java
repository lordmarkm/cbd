package cbd.dao;

import java.util.List;

import cbd.model.UserAccountModel;

public interface UserDao {
	List<UserAccountModel> get(String userId);
	List<UserAccountModel> allUsers();
	void saveOrUpdate(UserAccountModel userAccount);
	void delete(String userId);
}
