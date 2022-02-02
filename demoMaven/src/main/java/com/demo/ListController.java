package com.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class ListController {

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView RegisterGet(ModelAndView mav) {
		String json = "["
				+ "{\"input1\":\"test1\",\"input2\":\"test2\",\"input3\":\"test3\"},"
				+ "{\"input1\":\"test1\",\"input2\":\"test2\",\"input3\":\"test3\"}"
				+ "]";
		ObjectMapper objectMapper = new ObjectMapper();
		List<TestData> testDataList = new ArrayList<TestData>();
		try {
			testDataList = objectMapper.readValue(json, new TypeReference<List<TestData>>() {});
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		testDataList.add(new TestData());
		mav.addObject("testDataList", testDataList);
		mav.setViewName("list");
		return mav;
	}
}
