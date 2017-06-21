package org.crazyit.app.domain;

import javax.persistence.*;
import org.hibernate.annotations.Parent;

@Embeddable
public class Name
{

	@Column(name="name")
	private String name;

	// 引用拥有该Name的Person对象
	
	@Parent
	private Person owner;

	// 无参数的构造器
	public Name()
	{
	}
	// 初始化全部成员变量的构造器

	public Person getOwner() {
		return owner;
	}

	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public Name(String name) {
		super();
		this.name = name;
	}
	public void setOwner(Person owner) {
		this.owner = owner;
	}
	
	


}