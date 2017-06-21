package org.crazyit.common.hibernate;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.event.internal.DefaultSaveEventListener;
import org.crazyit.app.domain.User;
import org.hibernate.HibernateException;
import org.hibernate.event.spi.SaveOrUpdateEvent;

import com.mysql.fabric.xmlrpc.base.Data;

import org.hibernate.event.spi.LoadEventListener;

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
// Hibernate��Ĭ���¼��������඼��������non-final���ˡ�
public class MySaveListener extends DefaultSaveEventListener
{
	public Serializable performSaveOrUpdate(SaveOrUpdateEvent event)
	{
//		System.out.println("�Զ����save�¼�");
//		System.out.println(event.getObject());
		User user = (User) event.getObject();
		System.out.println("==========================================================================");
		System.out.println("ʱ�����"+new Date()+"���ڱ�������û���Ϊ��"+""+user.getName()+"    ѧ��Ϊ��"+user.getSid());
		System.out.println("==========================================================================");
		return super.performSaveOrUpdate(event);
	}
}