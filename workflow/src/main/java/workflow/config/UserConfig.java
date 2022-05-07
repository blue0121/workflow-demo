package workflow.config;

import lombok.extern.slf4j.Slf4j;
import org.camunda.bpm.engine.IdentityService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import workflow.model.UserEntity;
import workflow.service.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jin Zheng
 * @since 2022-05-07
 */
@Slf4j
@Component
public class UserConfig implements InitializingBean {

    private static final List<String> NAME_LIST = List.of("test1", "test2", "test3");
    private static final String PASSWORD = "123";

    private UserService userService;
    private IdentityService identityService;

	public UserConfig() {
	}

    @Override
    public void afterPropertiesSet() throws Exception {
        var list = userService.listByUsername(NAME_LIST);
        if (list.size() == NAME_LIST.size()) {
            return;
        }

        List<UserEntity> userList = new ArrayList<>();
        for (var name : NAME_LIST) {
            userList.add(new UserEntity(name, PASSWORD));
        }
        userService.addUser(userList);

        for (var name : NAME_LIST) {
            var user = identityService.newUser(name);
            user.setPassword(PASSWORD);
            identityService.saveUser(user);
        }

        log.info("添加用户: {}", NAME_LIST);
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Autowired
    public void setIdentityService(IdentityService identityService) {
        this.identityService = identityService;
    }
}
