package org.crazyit.common.hibernate;

import org.hibernate.event.internal.DefaultLoadEventListener;
import org.crazyit.app.domain.User;
import org.hibernate.HibernateException;
import org.hibernate.event.spi.LoadEvent;
import org.hibernate.event.spi.LoadEventListener;

public class MyLoadListener extends DefaultLoadEventListener
{
	// ��LoadEventListener�ӿڽ����������������
	public void onLoad(LoadEvent event,
		LoadEventListener.LoadType loadType)
		throws HibernateException
	{
//		System.out.println(event.get);
//		System.out.println("�Զ����load�¼�");
//		System.out.println(event.getEntityClassName()
//			+ "==========" + event.getEntityId());
		super.onLoad(event, loadType);
	}
}