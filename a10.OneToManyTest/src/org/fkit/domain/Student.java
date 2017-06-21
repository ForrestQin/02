package org.fkit.domain;

import java.io.Serializable;

/**
 *
 CREATE TABLE tb_clazz(
id INT PRIMARY KEY AUTO_INCREMENT,
CODE VARCHAR(18),
NAME VARCHAR(18)
);

INSERT INTO tb_clazz(CODE,NAME) VALUES('201502','2015级电子商务2班');

CREATE TABLE tb_student(
id INT PRIMARY KEY AUTO_INCREMENT,
NAME VARCHAR(18),
sex VARCHAR(18),
sid VARCHAR(18),
clazz_id INT,
FOREIGN KEY (clazz_id) REFERENCES tb_clazz(id)
);

INSERT INTO tb_student(NAME,sex,sid,clazz_id) VALUES('王二','男','201588888',1);
INSERT INTO tb_student(NAME,sex,sid,clazz_id) VALUES('rose','女','201522222',1);
INSERT INTO tb_student(NAME,sex,sid,clazz_id) VALUES('tom','男','201566666',1);
INSERT INTO tb_student(NAME,sex,sid,clazz_id) VALUES('alice','女','20157777',1);

 * */
public class Student implements Serializable {

	private Integer id; // 学生id，主键
	private String name; // 姓名
	private String sex;  // 性别
	private String sid; // 学号
	
	// 学生和班级是多对一的关系，即一个学生只属于一个班级
	private Clazz clazz;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public Clazz getClazz() {
		return clazz;
	}

	public void setClazz(Clazz clazz) {
		this.clazz = clazz;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sex=" + sex + ", sid=" + sid + "]";
	}


	
}
