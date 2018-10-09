package com.jinan.www.test;

import static org.junit.Assert.*;

import java.util.List;

import org.hibernate.query.*;
import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.jinan.www.entity.Commodity;
import com.jinan.www.util.HibernateUtil;

public class CommodityTest {

	private Session session=null;
	@Test
	public void test() {
		String hql = "from Commodity";
		Query  query = session.createQuery(hql);
		List<Commodity> commodities = query.list();//查不出数据来，这里是个问题
		
		System.out.println("--------------"+commodities.size());
		for(Commodity commodity :commodities) {
			System.out.println("names:"+commodity.getName());
			System.out.println("seller's name:"+commodity.getSeller().getName());
		}
		
		
		
		
	}
	
	
	@Before 
	public void init() {
		session = HibernateUtil.getSession();
	}
	
	@After 
	public void destory() {
		HibernateUtil.closeSession(session);
	}

}
