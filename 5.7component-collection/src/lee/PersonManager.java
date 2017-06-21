package lee;

import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import java.util.*;

import org.crazyit.app.domain.*;

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
		Name n = new Name("覃福东");
		n.getSchool().put("高中", "柳州地区民族高级中学");
		n.getSchool().put("大学", "华南理工大学");
		person.setSid("201562651482");
		
		person.setName(n);
		session.save(person);
		tx.commit();
		HibernateUtil.closeSession();
	}
}