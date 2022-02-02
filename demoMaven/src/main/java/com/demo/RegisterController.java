package com.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView RegisterGet(ModelAndView mav) {
		TestData testData = new TestData();
		mav.addObject("testData", testData);
		mav.setViewName("register");
		return mav;
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView RegisterPost(
			TestData testData, 
			ModelAndView mav) {
		testData.setInput1(testData.getInput1() + "test");
		mav.addObject("testData",testData);
		mav.setViewName("register");
		return mav;
	}
}
