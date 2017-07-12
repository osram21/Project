package com.dgit.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Project {
	private int project_no;
	private String project_name;
	private String project_content;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date startDate;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private	Date endDate;
	private String projecting;
	
	public Project() {}
	
	
	public Project(int project_no, String project_name, String project_content, Date startDate, Date endDate,
			String projecting) {
		super();
		this.project_no = project_no;
		this.project_name = project_name;
		this.project_content = project_content;
		this.startDate = startDate;
		this.endDate = endDate;
		this.projecting = projecting;
	}


	public int getProject_no() {
		return project_no;
	}

	public void setProject_no(int project_no) {
		this.project_no = project_no;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	public String getProject_content() {
		return project_content;
	}

	public void setProject_content(String project_content) {
		this.project_content = project_content;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getProjecting() {
		return projecting;
	}

	public void setProjecting(String projecting) {
		this.projecting = projecting;
	}

	@Override
	public String toString() {
		return "Project [project_no=" + project_no + ", project_name=" + project_name + ", project_content="
				+ project_content + ", startDate=" + startDate + ", endDate=" + endDate + ", projecting=" + projecting
				+ "]";
	}
	
}
