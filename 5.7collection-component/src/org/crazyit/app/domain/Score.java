package org.crazyit.app.domain;

import java.util.Date;

import javax.persistence.*;
import org.hibernate.annotations.Parent;

@Embeddable
public class Score
{

	@Column(name="school_name")
	private String school_name;

	@Column(name="admission_time")
	private Date admission_time;

	@Parent
	private Person owner;

	// 无参数的构造器
	public Score()
	{
	}
	// 初始化全部成员变量的构造器
	

	public void setOwner(Person owner)
	{
		this.owner = owner;
	}

	public Score(String school_name, Date admission_time) {
		super();
		this.school_name = school_name;
		this.admission_time = admission_time;
	}


	public Date getadmission_time() {
		return admission_time;
	}


	public void setadmission_time(Date admission_time) {
		this.admission_time = admission_time;
	}


	public String getSchool_name() {
		return school_name;
	}


	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}


	public Person getOwner()
	{
		return this.owner;
	}

}