package org.crazyit.app.domain;

import javax.persistence.*;
/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2010, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */

// �˿���̳���Person��
@Entity
@DiscriminatorValue("��ϸ��Ϣ")
@Table(name="detail_inf")
public class Detail extends Basic
{
	
	private String sid;
	private String sclass;

	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="detail",
		column=@Column(name="address_detail")),
		@AttributeOverride(name="zip",
		column=@Column(name="address_zip")),
		@AttributeOverride(name="country",
		column=@Column(name="address_country"))
	})
	private Address address;

	public Detail()
	{
	}
	// ��ʼ��comments��Ա�����Ĺ�����
	public Detail(String sid, String sclass) {
		super();
		this.sid = sid;
		this.sclass = sclass;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSclass() {
		return sclass;
	}
	public void setSclass(String sclass) {
		this.sclass = sclass;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
}