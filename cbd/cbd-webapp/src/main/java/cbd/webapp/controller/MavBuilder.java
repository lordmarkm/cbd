package cbd.webapp.controller;

import org.springframework.web.servlet.ModelAndView;

public class MavBuilder {
	ModelAndView mav;
	
	public static MavBuilder render(String viewName) {
		return new MavBuilder(viewName);
	}
	
	public MavBuilder(String viewName) {
		mav = new ModelAndView(viewName);
	}
	
	public MavBuilder addObject(String attributeName, Object attributeValue) {
		mav.addObject(attributeName, attributeValue);
		return this;
	}
	
	public ModelAndView mav() {
		return mav;
	}
}
