package addl.lion.training.controllers.jsp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import addl.lion.training.service.UserService;

@Controller
public class HelpController {
	
	/*
	 * @Autowired private WSFindingService findingService;
	 */
	
	private final UserService userService;
	
	public HelpController(UserService userService) {
		this.userService = userService;
	}
	
	
	
	@GetMapping("/help")
    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
//		String versionService = findingService.getVersion();
        model.addAttribute("name", name);
        model.addAttribute("version", "Test");
        return "help";
    }
	
	@GetMapping("/guide")
	public String guide(Model model) {
		System.out.println("Model: " + model);
		model.addAttribute("users", this.userService.getAllUsers());
		return "help";
	}

}
