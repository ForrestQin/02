package org.crazyit.app.domain;

import java.util.*;

import javax.persistence.*;

@Entity
@Table(name="user_inf")

public class User
{
	@Id @Column(name="user_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String sid;

	// 无参数的构造器
	public User()
	{
	}
	// 初始化全部成员变量的构造器
	public User(Integer id , String name )
	{
		this.id = id;
		this.name = name;
	}

	// id的setter和getter方法
	public void setId(Integer id)
	{
		this.id = id;
	}
	public Integer getId()
	{
		return this.id;
	}

	// name的setter和getter方法
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}

}