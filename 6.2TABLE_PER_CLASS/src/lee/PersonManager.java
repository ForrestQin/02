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
		mgr.Polymorphism();
		HibernateUtil.sessionFactory.close();
	}

	private void createAndStorePerson()
	{
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		
		
		
		Detail de = new Detail();
		de.setSid("201562651482");
		de.setGender('男');
		de.setName("覃福东");
		de.setSclass("电子商务2班");
		de.setAddress(new Address("广州大学城" , "410000" , "中国"));
		
		Basic ba = new Basic();
		ba.setName("王二");
		ba.setGender('男');
		
		session.save(de);
		session.save(ba);
		tx.commit();
		HibernateUtil.closeSession();
	}
	
	private void Polymorphism()
	{
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		List pl = session.createQuery(" from Basic  as b ")
				.list();
			// 遍历查询的全部结果
			for(Object ele : pl)
			{
				Basic b = (Basic)ele;
				System.out.println(b.getName());
			}
		tx.commit();
		HibernateUtil.closeSession();
	}
}
