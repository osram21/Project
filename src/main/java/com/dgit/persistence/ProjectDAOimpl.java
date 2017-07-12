package com.dgit.persistence;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dgit.domain.Project;

@Repository
public class ProjectDAOimpl implements ProjectDAO{
	@Autowired
	private SqlSession session;
	
	private static String namespace = "com.dgit.persistence.ProjectDAO"; 
	
	@Override
	public void insert(Project pj) throws Exception {
		session.insert(namespace+".insert",pj);
	}

	@Override
	public List<Project> selectList() throws Exception {
		return session.selectList(namespace+".selectList");
	}

	@Override
	public Project selectByid(int project_no) throws Exception {
		return session.selectOne(namespace+".selectByid",project_no);
	}

	@Override
	public void update(Project pj) throws Exception {
		session.update(namespace+".update",pj);
	}

	@Override
	public void delete(int project_no) throws Exception {
		session.delete(namespace+".delete",project_no);
	}

}
