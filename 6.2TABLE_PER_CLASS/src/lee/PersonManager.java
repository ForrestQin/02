package lee;

import org.hibernate.Transaction;
import org.hibernate.Session;

import java.util.*;

import org.crazyit.app.domain.*;

/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
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
		de.setGender('��');
		de.setName("������");
		de.setSclass("��������2��");
		de.setAddress(new Address("���ݴ�ѧ��" , "410000" , "�й�"));
		
		Basic ba = new Basic();
		ba.setName("����");
		ba.setGender('��');
		
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
			// ������ѯ��ȫ�����
			for(Object ele : pl)
			{
				Basic b = (Basic)ele;
				System.out.println(b.getName());
			}
		tx.commit();
		HibernateUtil.closeSession();
	}
}
