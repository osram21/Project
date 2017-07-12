package com.dgit.controller;

import java.text.SimpleDateFormat;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.dgit.domain.Project;
import com.dgit.service.ProjectService;


@Controller
public class ProjectController {
	private static final Logger logger = LoggerFactory.getLogger(ProjectController.class);
	
	@Autowired
	private ProjectService service;
	
	//리스트 보기
	@RequestMapping(value="/listAll",method=RequestMethod.GET)
	public String listAll(Model model)throws Exception{
		List<Project> list = service.selectList();
		logger.info("list================"+list);
		System.out.println("list=========================="+list);
		
		model.addAttribute("list",list);
		return "project/list";
	}
	
	//insert
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String registerGet()throws Exception{
		return"project/projoinForm";
	}
	//insert
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String registerPost(Project pj/*,String stdate,String eddate*/)throws Exception{
		/*SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		pj.setStartDate(sdf.parse(stdate));
		pj.setEndDate(sdf.parse(eddate));*/
		//String을 date로 바꿔서 pj에 넣어줌
		
		service.insert(pj);
		return "redirect:listAll";
	}
	
	//read
	@RequestMapping(value="read",method=RequestMethod.GET)
	public String Detail(int project_no,Model model)throws Exception{
		Project pj = service.selectByid(project_no);
		model.addAttribute("project",pj);
		return "project/Detail";
	}
	
	//delete
	@RequestMapping(value="delete",method=RequestMethod.POST)
	public String delete(int project_no)throws Exception{
		service.delete(project_no);
		return "redirect:listAll";
	}
	
	//update
	@RequestMapping(value="modify",method=RequestMethod.GET)
	public String updateGet(int project_no,Model model)throws Exception{
		Project pj = service.selectByid(project_no);
		model.addAttribute("project",pj);
		return "project/modify";
	}
	
	@RequestMapping(value="modify",method=RequestMethod.POST)
	public String updatePost(Project pj,RedirectAttributes model)throws Exception{
		service.update(pj);
		model.addAttribute("project_no", pj.getProject_no());
		return "redirect:read";
	}
}
