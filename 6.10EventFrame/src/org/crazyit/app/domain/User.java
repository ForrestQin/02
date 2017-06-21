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

	// �޲����Ĺ�����
	public User()
	{
	}
	// ��ʼ��ȫ����Ա�����Ĺ�����
	public User(Integer id , String name )
	{
		this.id = id;
		this.name = name;
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
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}

}