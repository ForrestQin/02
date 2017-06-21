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
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
// Hibernate的默认事件监听器类都被声明成non-final的了。
public class MySaveListener extends DefaultSaveEventListener
{
	public Serializable performSaveOrUpdate(SaveOrUpdateEvent event)
	{
//		System.out.println("自定义的save事件");
//		System.out.println(event.getObject());
		User user = (User) event.getObject();
		System.out.println("==========================================================================");
		System.out.println("时间戳："+new Date()+"正在保存对象，用户名为："+""+user.getName()+"    学号为："+user.getSid());
		System.out.println("==========================================================================");
		return super.performSaveOrUpdate(event);
	}
}