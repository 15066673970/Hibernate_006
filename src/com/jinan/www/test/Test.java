package com.jinan.www.test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.sql.Select;
import org.junit.After;
import org.junit.Before;

import com.jinan.www.entity.Commodity;
import com.jinan.www.entity.Customer;
import com.jinan.www.entity.OrderForm;
import com.jinan.www.entity.OrderItem;
import com.jinan.www.entity.Seller;
import com.jinan.www.util.HibernateUtil;

public class Test {
 
	private Session Session = null;
	
	@org.junit.Test
	public void test() {
		
		Session  session = HibernateUtil.getSession();
		Transaction transaction = session.beginTransaction();
		
		Seller seller1 = new Seller(1, "A��װ��", "13000000000", "�й�����xx��", "www.a.com", "5","��Ӫ��ʽ��װ" );
		Seller seller2 = new Seller(2,"B�����", "15800000000","�й��㽭����ĳĳ��", "www.b.com", "4", "��Ӫ����������Ӳ�Ʒ");
		Seller seller3 = new Seller(3,"C������", "13012341234","�й��㶫����ĳĳ��", "www.c.com", "4", "��Ӫ����ҵ�");
		Seller seller4 = new Seller(4, "D���", "18600000000","�й�ɽ��������ĳĳ��", "www.d.com", "5", "��Ӫ����ʵ�����������");
		
		Customer customer1 = new Customer(1, "����", "13800000000", "�й��Ϻ�ĳĳ��ĳĳ·", "zhangsan@zhangsan.com", "��", "�Ȱ���̵ĳ���Ա", 25, new Date("1990-01-01"));
		Customer customer2 = new Customer(2, "����", "13888888888", "�й�����ĳĳ��ĳĳ·", "lisi@lisi.com", "Ů", "�ᰮ�����İ���", 20, new Date("1995-02-21") );
		Customer customer3 = new Customer(3, "����", "15888888888", "�й��㶫����ĳĳ��ĳĳ·", "wangwu@wangwu.com", "��", "����һ������ʲôҲû������", 35, new Date("1980-04-14"));
		
		Commodity commodity1 = new Commodity(1, "��ʽͯװ",120d ,"��", "ͯװ", "��ʽ��ƶ�ͯ��װ", seller1);
		Commodity commodity2 = new Commodity(2, "��ʽͯװ",200d ,"��", "Ůװ", "Ůʿְҵ��װ", seller1);
		Commodity commodity3 = new Commodity(3, "��ʽͯװ",200d ,"��", "��װ", "��ʿ������װ", seller1);
		Commodity commodity4 = new Commodity(4, "�ʼǱ�����",4000d ,"̨", "����", "˫�˱ʼǱ�����", seller2);
		Commodity commodity5= new Commodity(5, "�ƶ�Ӳ��",400d ,"��", "�����ܱ�", "1t�ƶ�Ӳ��", seller2);
		Commodity commodity6 = new Commodity(6, "Һ������",5000d ,"̨", "����", "4k����Һ������", seller3);
		Commodity commodity7 = new Commodity(7, "��Ͳϴ�»�",4000d ,"̨", "ϴ�»�", "��Ͳϴ�»�", seller3);
		Commodity commodity8 = new Commodity(8, "��hibernate��̡�",30.00d ,"��", "ʵ����", "����hibernate���", seller4);
		Commodity commodity9 = new Commodity(9, "��java���ġ�",50d ,"��", "ʵ����", "����java��̺���", seller4);
		Commodity commodity10 = new Commodity(10, "�����������",40d ,"��", "������", "����ƻ�С˵", seller4);
		
		OrderForm orderForm1 = new OrderForm(1, customer1, new Date("2015-04-30"), "���ջ�", 4400d);
		OrderForm orderForm2 = new OrderForm(2, customer2, new Date("2015-05-11"), "�ѷ���", 520d);
		OrderForm orderForm3 = new OrderForm(3, customer3, new Date("2015-05-13"), "�Ѹ���", 9120d);
		
		OrderItem orderItem1 = new OrderItem(1, orderForm1, commodity4, 1d, 4000d, 1d);
		OrderItem orderItem2 = new OrderItem(2, orderForm1, commodity5, 1d, 400d, 1d);
		OrderItem orderItem3 = new OrderItem(3, orderForm2, commodity1, 1d, 120d, 1d);
		OrderItem orderItem4 = new OrderItem(4, orderForm2, commodity2, 1d, 200d, 1d);
		OrderItem orderItem5 = new OrderItem(5, orderForm2, commodity3, 1d, 200d, 1d);
		OrderItem orderItem6 = new OrderItem(6, orderForm3, commodity6, 1d, 5000d, 1d);
		OrderItem orderItem7 = new OrderItem(7, orderForm3, commodity7, 1d, 4000d, 1d);
		OrderItem orderItem8 = new OrderItem(8, orderForm3, commodity8, 1d, 30d, 1d);
		OrderItem orderItem9 = new OrderItem(9, orderForm3, commodity9, 1d, 50d, 1d);
		OrderItem orderItem10 = new OrderItem(10, orderForm3, commodity10, 1d, 40d, 1d);
		
		
		session.save(seller1);
		session.save(seller2);
		session.save(seller3);
		session.save(seller4);
		
		session.save(customer1);
		session.save(customer2);
		session.save(customer3);
		
		session.save(commodity1);
		session.save(commodity2);
		session.save(commodity3);
		session.save(commodity4);
		session.save(commodity5);
		session.save(commodity6);
		session.save(commodity7);
		session.save(commodity8);
		session.save(commodity9);
		session.save(commodity10);
		
		session.save(orderForm1);
		session.save(orderForm2);
		session.save(orderForm3);
		
		session.save(orderItem1);
		session.save(orderItem2);
		session.save(orderItem3);
		session.save(orderItem4);
		session.save(orderItem5);
		session.save(orderItem6);
		session.save(orderItem7);
		session.save(orderItem8);
		session.save(orderItem9);
		session.save(orderItem10);
		
		transaction.commit();
		HibernateUtil.closeSession(session);
		
	}
	
	
	
	@Before
	public void init() {
		Session = HibernateUtil.getSession();
	}
	
	@After 
	public void destory() {
		HibernateUtil.closeSession(Session);
	}

	
	/*
	 * ���Լ򵥵Ĵ���query�ӿڵķ���
	 */
	@org.junit.Test
	public void testQuery() {
		String hql = "from Seller";
		
		Query query = Session.createQuery(hql);
		
		List<Seller> sellers =query.list();
		for(Seller seller :sellers) {
			System.out.println(seller.toString());
		}
	}
	
	/*
	 * ��object[]��ʽ���ز�ѯ������
	 * �����ǲ�ѯname��tel��address�������Ե�ֵ�����ֻ��ѯ��һ������ֵ
	 * ��ô���صľͲ�����object[]������һ��object
	 */
	@org.junit.Test
	public void testSelectClauseObjectArray() {
		String sql = "select s.name,s.tel,s.address from Seller s";
		
		Query query =Session.createQuery(sql);
		
		List<Object[]> list =query.list();
		for(Object[] objects :list) {
			System.out.println("name="+objects[0]);
			System.out.println("tel="+objects[1]);
			System.out.println("address="+objects[2]);
		}
		
		
	}
	/*
	 * ��list��ʽ���ز�ѯ������
	 */
	@org.junit.Test
	public void testSelectClauseList() {
	String sql = "select new list( s.name,s.tel,s.address) from Seller s";//ָ�����ص���������
		
		Query query =Session.createQuery(sql);
		
		List<List> lists =query.list();
		for(List list:lists) {
			System.out.println("name="+list.get(0)+"tel="+list.get(1)+"address="+list.get(2));
		}
	}
	/*
	 * ��map��ʽ���ز�ѯ���
	 */
	@org.junit.Test
	public void testSelectClauseMap() {
		String sql = "select new map(s.name,s.tel,s.address as address)from Seller s";
		Query query = Session.createQuery(sql);
		List<Map> maps = query.list();
		for(Map map:maps) {
			System.out.println("name="+map.get("0")+"tel="+map.get("1")+"address="+map.get("address"));
		}
	}
	/*
	 * ���Զ������ͷ��ؽ��
	 * 1���־û����ж����Ӧ�Ĺ�����(һ��Ҫ��һ��Ĭ�ϵĿյĹ���������Ϊû��ָ����������ʱ���ȥ��Ĭ�ϵģ�
	 * 2��select�Ӿ��е��ö�Ӧ�Ĺ�����
	 */
	
	@org.junit.Test
	public void testSelectClauseSelf() {
		String sql = "select new Seller(s.name,s.tel,s.address as address)from Seller s";
		Query query = Session.createQuery(sql);
		List<Seller> list  = query.list();
		for(Seller seller :list) {
			System.out.println("name="+seller.getName()+"tel="+seller.getTel()+"address="+seller.getAddress());
		}
		
	
	}
	/*
	 * ʹ��distinct������ѯ������ظ���Ԫ��
	 */
	
	@org.junit.Test
	public void testDistinct() {
		String sql = "select distinct c.sex from Customer c";
		Query query = Session.createQuery(sql);
		List<Object> list = query.list();
		for(Object object :list) {
			System.out.println(object);
		}
	}
}
