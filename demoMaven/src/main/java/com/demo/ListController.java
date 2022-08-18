package com.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.TBalance;
import com.demo.repository.TBalanceDao;

@Controller
public class ListController {
	@Autowired
	private TBalanceDao balanceDao ;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView listGet(ModelAndView mav) {
//		Iterable<TBalance> dataList = balanceDao.findList();

		TBalance joken = new TBalance();
		mav.addObject("joken", joken);
		
		mav.addObject("dataList", new ArrayList<TBalance>());
		mav.setViewName("list");
		
		return mav;
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	public ModelAndView listPost(
			TBalance joken, 
			ModelAndView mav) {
		Iterable<TBalance> dataList = balanceDao.findList(joken);

		mav.addObject("joken", joken);
		
		mav.addObject("dataList", dataList);
		mav.setViewName("list");
		
		return mav;
	}
}
