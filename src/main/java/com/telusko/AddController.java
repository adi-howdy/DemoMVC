package com.telusko;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jdt.internal.compiler.util.Util.Displayable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller	
public class AddController {


	@RequestMapping("/added")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response)
		{
			//System.out.println("yo yo"); 
			
			int i = Integer.parseInt(request.getParameter("t1"));
			int j = Integer.parseInt(request.getParameter("t2"));
			int k = i + j;
			
			ModelAndView mv = new ModelAndView();
			mv.setViewName("display.jsp");
			mv.addObject("result", k);
			
			
			return mv;
		}
}
