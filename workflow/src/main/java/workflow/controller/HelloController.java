package workflow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Jin Zheng
 * @since 2022-05-06
 */
@Controller
public class HelloController {
	public HelloController() {
	}

	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
}
