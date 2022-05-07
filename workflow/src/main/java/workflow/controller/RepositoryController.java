package workflow.controller;

import org.camunda.bpm.engine.RepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Jin Zheng
 * @since 2022-05-07
 */
@Controller
public class RepositoryController {

	private RepositoryService repositoryService;

	public RepositoryController() {
	}

	@GetMapping("/repository")
	public String list(Model model) {
		var list = repositoryService.createProcessDefinitionQuery().list();
		model.addAttribute("title", "流程定义");
		model.addAttribute("list", list);
		return "repository/list";
	}

	@Autowired
	public void setRepositoryService(RepositoryService repositoryService) {
		this.repositoryService = repositoryService;
	}
}
