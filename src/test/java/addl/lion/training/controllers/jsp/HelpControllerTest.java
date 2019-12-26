package addl.lion.training.controllers.jsp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.Test;
//import org.junit.Test;
//import org.junit.Before;
//import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import addl.lion.training.service.UserServiceImpl;

public class HelpControllerTest {
	
	@Mock
	UserServiceImpl userService;
	
	@Mock
	Model model;
	
	HelpController helpController;
	
	@Before
	public void setUp() throws Exception {
		System.out.println("Before test");
		MockitoAnnotations.initMocks(this);
		helpController = new HelpController(userService);
	}

	@Test
	void guide() {
		String viewName = helpController.guide(model);
		
		assertEquals("help", viewName);
		
	}

}
