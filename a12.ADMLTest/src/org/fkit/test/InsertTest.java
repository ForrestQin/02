package org.fkit.test;

import org.apache.ibatis.session.SqlSession;
import org.fkit.domain.User;
import org.fkit.factory.FKSqlSessionFactory;

public class InsertTest {

	public static void main(String[] args) throws Exception {
		// 获得Session实例
		SqlSession session = FKSqlSessionFactory.getSqlSession();
		// 创建User对象
		User user = new User("覃福东", "男", "201562651482","电子商务2班");
		// 插入数据
		session.insert("org.fkit.mapper.UserMapper.saveUser", user);
		// 提交事务
		session.commit();
		// 关闭Session
		session.close();
	}

}
