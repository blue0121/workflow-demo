package workflow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import workflow.service.UserService;
import workflow.util.Const;

/**
 * @author Jin Zheng
 * @since 2022-05-09
 */
@Controller
public class UserController {

    private UserService userService;

	public UserController() {
	}

	@GetMapping("/user")
	public String list(Model model) {
		var list = userService.listAll();
		model.addAttribute(Const.TITLE_KEY, "所有用户");
		model.addAttribute(Const.LIST_KEY, list);
		return "user/list";
	}

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}
