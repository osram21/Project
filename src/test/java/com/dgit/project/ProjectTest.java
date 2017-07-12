package com.dgit.project;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dgit.domain.Project;
import com.dgit.persistence.ProjectDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class ProjectTest {
	@Autowired
	private ProjectDAO dao;
	
	//@Test
	public void testList()throws Exception{
		dao.selectList();
	}
	
	//@Test
	public void testInsert()throws Exception{
		Project pj = new Project(11, "test", "ㅇㅋ", new Date(), new Date(), "준비");
		dao.insert(pj);
	}
	//@Test
	public void testSelectByNo()throws Exception{
		dao.selectByid(1);
	}
	@Test
	public void testDelete()throws Exception{
		dao.delete(1);
	}
}
