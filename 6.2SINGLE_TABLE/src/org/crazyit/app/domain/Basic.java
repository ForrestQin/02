package org.crazyit.app.domain;

import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;
/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
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
@DiscriminatorValue("������Ϣ")
@Table(name="basic_inf")
public class Basic
{
	// ��ʶ����
	@Id @Column(name="basic_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private char gender;

	// �޲����Ĺ�����
	public Basic()
	{
	}
	// ��ʼ��ȫ����Ա�����Ĺ�����
	public Basic(Integer id , String name , char gender)
	{
		this.id = id;
		this.name = name;
		this.gender = gender;
	}

	// id��setter��getter����
	public void setId(Integer id)
	{
		this.id = id;
	}
	public Integer getId()
	{
		return this.id;
	}

	// name��setter��getter����
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}

	// gender��setter��getter����
	public void setGender(char gender)
	{
		this.gender = gender;
	}
	public char getGender()
	{
		return this.gender;
	}

}