package cbd.webapp.controller;

import static cbd.webapp.controller.MavBuilder.render;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cbd.model.MemberType;
import cbd.model.UserAccountModel;
import cbd.model.UserInfoModel;
import cbd.service.RegistrationService;
import cbd.webapp.dto.RegistrationForm;

@Controller @RequestMapping("/register/")
public class RegistrationController {
	static Logger log = LoggerFactory.getLogger(RegistrationController.class);
	
	@Autowired RegistrationService regService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView register() {
		return render("regform")
				.addObject("regForm", new RegistrationForm(new UserAccountModel(new UserInfoModel())))
				.addObject("memberTypes", MemberType.values())
				.mav();
	}
	
	@RequestMapping("/edit/{userId}")
	public ModelAndView edit(@PathVariable String userId) {
		return render("regform")
				.addObject("regForm", new RegistrationForm(regService.get(userId)))
				.addObject("memberTypes", MemberType.values())
				.mav();
	}
	
	@RequestMapping("/save/")
	public String save(@ModelAttribute RegistrationForm regForm) {
		regService.save(regForm.getUserAccount());
		return "redirect:/view/list/";
	}
	
	@RequestMapping("/delete/{userId}")
	public String delete(@PathVariable String userId) {
		regService.delete(userId);
		return "redirect:/view/list/";
	}
}
