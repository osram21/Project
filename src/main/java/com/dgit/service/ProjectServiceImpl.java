package com.dgit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dgit.domain.Project;
import com.dgit.persistence.ProjectDAO;

@Service
public class ProjectServiceImpl implements ProjectService{
	@Autowired
	private ProjectDAO dao;
	
	@Override
	public void insert(Project pj) throws Exception {
		dao.insert(pj);
	}

	@Override
	public List<Project> selectList() throws Exception {
		
		return dao.selectList();
	}

	@Override
	public Project selectByid(int project_no) throws Exception {
		return dao.selectByid(project_no);
	}

	@Override
	public void update(Project pj) throws Exception {
		dao.update(pj);
	}

	@Override
	public void delete(int project_no) throws Exception {
		dao.delete(project_no);
	}
}
