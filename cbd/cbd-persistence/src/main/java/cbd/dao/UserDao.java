package cbd.dao;

import java.util.List;

import cbd.model.UserAccountModel;
import cbd.model.UserInfoModel;

public interface UserDao {
	List<UserAccountModel> get(String userId);
	List<UserAccountModel> allUsers();
	void delete(String userId);
	void saveOrUpdate(UserAccountModel userAccount);
}
