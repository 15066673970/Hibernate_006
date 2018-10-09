package com.jinan.www.test;

import static org.junit.Assert.*;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.jinan.www.entity.Customer;
import com.jinan.www.util.HibernateUtil;

public class CustomerTest {
	private Session session=null;
	
	@Test
	public void test() {
		String hql = "from Customer";
		Query<Customer> query=session.createQuery(hql);
		List<Customer> list = query.list();
		for(Customer customer :list) {
			System.out.println(customer.getName());
		}
		
	}

	@Before 
	public void init() {
		session  = HibernateUtil.getSession();
	}
	@After
	public void destory() {
		HibernateUtil.closeSession(session);
	}
}
