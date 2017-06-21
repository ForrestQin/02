package lee;

import org.hibernate.Transaction;
import org.hibernate.Session;

import java.util.*;
import org.crazyit.app.domain.*;

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
public class PersonManager
{
	public static void main(String[] args)
	{
		PersonManager mgr = new PersonManager();
		mgr.createAndStorePerson();
		HibernateUtil.sessionFactory.close();
	}
	private void createAndStorePerson()
	{
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		// 创建Person对象
		Person person = new Person();
		//为Person对象设置属性
		person.setSid("201562651482");
		
		//创建一个Map集合
		Map<String , Name> nicks =
			new HashMap<String , Name>();
		
		person.getNicks().add(new Name("覃福东"));

		person.getScores().put("高中" , new Score("柳州地区民族高中" , new Date(2011-1900,9+1,1)));
		person.getScores().put("大学" , new Score("华南理工大学" , new Date(2015-1900,9+1,1)));
		session.save(person);
		tx.commit();
		HibernateUtil.closeSession();
	}
}