package cbd.webapp.controller;

import static cbd.webapp.controller.MavBuilder.render;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cbd.model.UserAccountModel;
import cbd.service.RegistrationService;

@Controller @RequestMapping("/view")
public class ViewUsersController {
	@Autowired RegistrationService regService;
	
	@RequestMapping("/{userId}")
	public ModelAndView view(@PathVariable String userId) {
		return render("viewuser")
				.addObject("user", regService.get(userId))
				.mav();
	}
	
	@RequestMapping("/list/")
	public ModelAndView list() {
		List<UserAccountModel> users = regService.allUsers();
		
		return render("userlist")
				.addObject("users", users)
				.mav();
	}
}
