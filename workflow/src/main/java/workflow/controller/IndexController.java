package workflow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import workflow.service.UserService;
import workflow.util.Const;

import javax.servlet.http.HttpSession;

/**
 * @author Jin Zheng
 * @since 2022-05-09
 */
@Controller
public class IndexController {

	private UserService userService;

	public IndexController() {
	}

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute(Const.TITLE_KEY, "主页");
		return "index";
	}

	@GetMapping("/login")
	public String loginGet(Model model) {
		model.addAttribute(Const.TITLE_KEY, "登录");
		return "login";
	}

	@PostMapping("/login")
	public String loginPost(@RequestParam("username") String username,
							@RequestParam("password") String password,
							Model model, HttpSession session) {
		var user = userService.login(username, password);
		if (user == null) {
			model.addAttribute("error", "登录失败");
			model.addAttribute(Const.TITLE_KEY, "登录");
			return "login";
		}
		session.setAttribute(Const.USER_KEY, user);
		return "redirect:/";
	}

	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/logout";
	}

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}
