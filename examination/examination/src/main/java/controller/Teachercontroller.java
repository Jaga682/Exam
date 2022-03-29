package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import Service.Teacherservice;
import online.examination.Teacherbean;




@Controller
public class Teachercontroller {
@Autowired
	Teacherservice service;
	@RequestMapping("/")
public String viewData(Model model) {
		System.out.println("Up");
		List<Teacherbean> list=service.ListAll();
			
			model.addAttribute("teacherbean", list);
			System.out.println(list);
			return "index";
		}
	
	@RequestMapping("/new")
	public String addProd(Model value)
	{
		Teacherbean teacherbean =new Teacherbean();
		value.addAttribute("Teacherbean",teacherbean);
		return "newproduct";
	}
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String save(@ModelAttribute("Teacherbean")  Teacherbean teacherbean)
	{
		service.save(teacherbean);
		
		return "redirect:/";
		
	}
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditSeller(@PathVariable(name="id") int id) {
		ModelAndView view=new ModelAndView("editor");
	 Teacherbean teacherbean=service.get(id);
	 view.addObject("Teacherbean" , teacherbean);
	 return view;
	}
	@RequestMapping("/delete/{id}")
	public String deleteSeller(@PathVariable (name ="id") int id ) {
		service.delete(id);
		return "redirect:/";
	}
}
