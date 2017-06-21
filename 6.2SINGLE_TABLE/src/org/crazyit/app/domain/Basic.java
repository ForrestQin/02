package org.crazyit.app.domain;

import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;
/**
 * Description:
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>Copyright (C), 2001-2010, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
@Entity
@DiscriminatorColumn(name="basic_inf" ,
	discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("基本信息")
@Table(name="basic_inf")
public class Basic
{
	// 标识属性
	@Id @Column(name="basic_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private char gender;

	// 无参数的构造器
	public Basic()
	{
	}
	// 初始化全部成员变量的构造器
	public Basic(Integer id , String name , char gender)
	{
		this.id = id;
		this.name = name;
		this.gender = gender;
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

	// gender的setter和getter方法
	public void setGender(char gender)
	{
		this.gender = gender;
	}
	public char getGender()
	{
		return this.gender;
	}

}