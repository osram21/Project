package com.dgit.persistence;

import java.util.List;

import com.dgit.domain.Project;

public interface ProjectDAO {
	public void insert(Project pj)throws Exception;
	
	public List<Project> selectList()throws Exception;
	
	public Project selectByid(int project_no)throws Exception;
	
	public void update(Project pj)throws Exception;
	
	public void delete(int project_no)throws Exception;
}
