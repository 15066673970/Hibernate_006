package com.jinan.www.entity;

import java.util.HashSet;
import java.util.Set;
/*
 * ��Ʒ��Ϣ�־û���
 */
public class Commodity {
	private Integer id;//����
	private String name;//����
	private Double price;//�۸�
	private String unit;//��λ
	private String category;//���
	private String description;//���
	private Seller seller;//�̼�
	public Commodity() {
		super();
	}
	public Commodity(Integer id, String name, Double price, String unit, String category, String description,
			Seller seller) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.unit = unit;
		this.category = category;
		this.description = description;
		this.seller = seller;
	}
	@Override
	public String toString() {
		return "Commodity [id=" + id + ", name=" + name + ", price=" + price + ", unit=" + unit + ", category="
				+ category + ", description=" + description + ", seller=" + seller + "]";
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
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Seller getSeller() {
		return seller;
	}
	public void setSeller(Seller seller) {
		this.seller = seller;
	}
	
	
}
