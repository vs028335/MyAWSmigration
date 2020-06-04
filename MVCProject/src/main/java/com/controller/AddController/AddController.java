package com.controller.AddController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.controller.Addservice.Addservice;

@Controller
@ComponentScan(basePackages="com.controller.*")
public class AddController {
	
	@Autowired
	Addservice addservice;
	
	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request,HttpServletResponse response)
	{
		
		int num1=Integer.parseInt(request.getParameter("first"));
		int num2=Integer.parseInt(request.getParameter("second"));
		
		
		int num=addservice.add(num1, num2);
		
		ModelAndView andView=new ModelAndView();
		andView.setViewName("display.jsp");
		andView.addObject("result",num);
		return andView;
	}

}
