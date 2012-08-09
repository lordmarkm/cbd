package cbd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cbd.dao.UserDao;
import cbd.model.UserAccountModel;

@Service
public class RegistrationService {

	@Autowired UserDao dao;
	
	public UserAccountModel get(String userId) {
		List<UserAccountModel> results = dao.get(userId);
		if(results.isEmpty()) return null;
		return results.get(0);
	}
	
	public List<UserAccountModel> allUsers() {
		return dao.allUsers();
	}

	public void save(UserAccountModel userAccount) {
		dao.saveOrUpdate(userAccount);
	}

	public void delete(String userId) {
		dao.delete(userId);
	}
}
