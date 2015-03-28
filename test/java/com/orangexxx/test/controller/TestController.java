package com.orangexxx.test.controller;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.alibaba.fastjson.JSON;

public class TestController extends AbstractController {


	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		PrintWriter writer = response.getWriter();
		TestObject obj = new TestObject();
		obj.setName("orangexxx");
		obj.setAge(27);
		List<String> temp = new ArrayList<String> ();
		temp.add("basketbool");
		temp.add("movie");
		temp.add("music");
		writer.println(JSON.toJSONString(obj));
		writer.flush();
		writer.close();
		return null;
	}

}
