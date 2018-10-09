package com.jinan.www.entity;

import java.util.HashSet;
import java.util.Set;

public class Seller {
	private Integer id;//主键
	private String name;//姓名
	private String tel;//电话
	private String address;//地址
	private String website;//商家网站
	private String star;//商家星级
	private String business;//经营范围
	private Set<Commodity> commoditys= new HashSet<Commodity>();
	
	
	public Seller(String name, String tel, String address) {
		super();
		this.name = name;
		this.tel = tel;
		this.address = address;
	}
	public Set<Commodity> getCommoditys() {
		return commoditys;
	}
	public void setCommoditys(Set<Commodity> commoditys) {
		this.commoditys = commoditys;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getStar() {
		return star;
	}
	public void setStar(String star) {
		this.star = star;
	}
	public String getBusiness() {
		return business;
	}
	public void setBusiness(String business) {
		this.business = business;
	}
	public Seller() {
		super();
	}

	public Seller(Integer id, String name, String tel, String address, String website, String star, String business) {
		super();
		this.id = id;
		this.name = name;
		this.tel = tel;
		this.address = address;
		this.website = website;
		this.star = star;
		this.business = business;
	}
	@Override
	public String toString() {
		return "主键：" + id + " | 名称：" + name + " | 电话：" + tel + " | 地址：" + address + " | 网址：" + website
				+ " | 星级：" + star + " | 经营范围：" + business ;
	}

	

	
	
	
	
	
	
}
