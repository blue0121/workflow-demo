package workflow.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import workflow.model.UserEntity;
import workflow.repository.UserRepository;

import java.util.Collection;
import java.util.List;

/**
 * @author Jin Zheng
 * @since 2022-05-07
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserService {
    private UserRepository userRepository;

	public UserService() {
	}

	public void addUser(List<UserEntity> userList) {
		userRepository.saveAllAndFlush(userList);
	}

	public List<UserEntity> listByUsername(Collection<String> nameList) {
		return userRepository.findByUsernameIn(nameList);
	}

	@Autowired
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
}
