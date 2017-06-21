package org.crazyit.app.domain;

import java.util.*;
import javax.persistence.*;
import org.hibernate.annotations.Parent;
/**
 * Description:
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
@Embeddable
public class Name
{
	@Column
	private String name;
	

	@Parent
	private Person owner;

	@ElementCollection(targetClass=String.class)
	@CollectionTable(name="school_inf",
		joinColumns=@JoinColumn(name="school_name_id" , nullable=false))
	@MapKeyColumn(name="school_type")	//key
	@Column(name="school_name" , nullable=false)	//value
	@MapKeyClass(String.class)
	private Map<String , String> school
		= new HashMap<>();
	
	
	// 无参数的构造器
	public Name()
	{
	}


	public Name(String name) {
		super();
		this.name = name;
	}

	public Person getOwner() {
		return owner;
	}


	public void setOwner(Person owner) {
		this.owner = owner;
	}


	public Map<String, String> getSchool() {
		return school;
	}


	public void setSchool(Map<String, String> school) {
		this.school = school;
	}
	
	

}