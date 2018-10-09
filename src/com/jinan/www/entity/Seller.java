package com.jinan.www.entity;

import java.util.HashSet;
import java.util.Set;

public class Seller {
	private Integer id;//����
	private String name;//����
	private String tel;//�绰
	private String address;//��ַ
	private String website;//�̼���վ
	private String star;//�̼��Ǽ�
	private String business;//��Ӫ��Χ
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
		return "������" + id + " | ���ƣ�" + name + " | �绰��" + tel + " | ��ַ��" + address + " | ��ַ��" + website
				+ " | �Ǽ���" + star + " | ��Ӫ��Χ��" + business ;
	}

	

	
	
	
	
	
	
}
