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
		
		Seller seller1 = new Seller(1, "A服装店", "13000000000", "中国北京xx区", "www.a.com", "5","经营各式服装" );
		Seller seller2 = new Seller(2,"B数码店", "15800000000","中国浙江杭州某某区", "www.b.com", "4", "经营各类数码电子产品");
		Seller seller3 = new Seller(3,"C电器店", "13012341234","中国广东深圳某某区", "www.c.com", "4", "经营各类家电");
		Seller seller4 = new Seller(4, "D书店", "18600000000","中国山西西安市某某区", "www.d.com", "5", "经营各类实体书与电子书");
		
		Customer customer1 = new Customer(1, "张三", "13800000000", "中国上海某某区某某路", "zhangsan@zhangsan.com", "男", "热爱编程的程序员", 25, new Date("1990-01-01"));
		Customer customer2 = new Customer(2, "李四", "13888888888", "中国北京某某区某某路", "lisi@lisi.com", "女", "酷爱网购的白领", 20, new Date("1995-02-21") );
		Customer customer3 = new Customer(3, "王五", "15888888888", "中国广东深圳某某区某某路", "wangwu@wangwu.com", "男", "这个家伙很懒，什么也没有留下", 35, new Date("1980-04-14"));
		
		Commodity commodity1 = new Commodity(1, "中式童装",120d ,"套", "童装", "中式设计儿童服装", seller1);
		Commodity commodity2 = new Commodity(2, "中式童装",200d ,"套", "女装", "女士职业套装", seller1);
		Commodity commodity3 = new Commodity(3, "中式童装",200d ,"套", "男装", "男士西服套装", seller1);
		Commodity commodity4 = new Commodity(4, "笔记本电脑",4000d ,"台", "电脑", "双核笔记本电脑", seller2);
		Commodity commodity5= new Commodity(5, "移动硬盘",400d ,"块", "电脑周边", "1t移动硬盘", seller2);
		Commodity commodity6 = new Commodity(6, "液晶电视",5000d ,"台", "电视", "4k高清液晶电视", seller3);
		Commodity commodity7 = new Commodity(7, "滚筒洗衣机",4000d ,"台", "洗衣机", "滚筒洗衣机", seller3);
		Commodity commodity8 = new Commodity(8, "《hibernate编程》",30.00d ,"本", "实体书", "介绍hibernate编程", seller4);
		Commodity commodity9 = new Commodity(9, "《java核心》",50d ,"本", "实体书", "介绍java编程核心", seller4);
		Commodity commodity10 = new Commodity(10, "《海底两万里》",40d ,"本", "电子书", "经典科幻小说", seller4);
		
		OrderForm orderForm1 = new OrderForm(1, customer1, new Date("2015-04-30"), "已收货", 4400d);
		OrderForm orderForm2 = new OrderForm(2, customer2, new Date("2015-05-11"), "已发货", 520d);
		OrderForm orderForm3 = new OrderForm(3, customer3, new Date("2015-05-13"), "已付款", 9120d);
		
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
	 * 测试简单的创建query接口的方法
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
	 * 以object[]形式返回查询的数据
	 * 下面是查询name，tel，address三个属性的值，如果只查询了一个属性值
	 * 那么返回的就不在是object[]，而是一个object
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
	 * 以list形式返回查询的数据
	 */
	@org.junit.Test
	public void testSelectClauseList() {
	String sql = "select new list( s.name,s.tel,s.address) from Seller s";//指定返回的数据类型
		
		Query query =Session.createQuery(sql);
		
		List<List> lists =query.list();
		for(List list:lists) {
			System.out.println("name="+list.get(0)+"tel="+list.get(1)+"address="+list.get(2));
		}
	}
	/*
	 * 以map形式返回查询结果
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
	 * 以自定义类型返回结果
	 * 1，持久化类中定义对应的构造器(一定要有一个默认的空的构造器，因为没有指定构造器的时候回去找默认的）
	 * 2，select子句中调用对应的构造器
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
	 * 使用distinct消除查询结果中重复的元素
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
