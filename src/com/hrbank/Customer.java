package com.hrbank;

public class Customer {
	private int id;
	private String name;
	private int age;
	private String sex;
	private long mobile;
	private String address;
	private String uname;
	private String upass;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	public Customer(int id, String name, int age, String sex, long mobile, String address, String uname, String upass) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.mobile = mobile;
		this.address = address;
		this.uname = uname;
		this.upass = upass;
	}
	public Customer(String name, int age, String sex, long mobile, String address, String uname, String upass) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.mobile = mobile;
		this.address = address;
		this.uname = uname;
		this.upass = upass;
	}
	public Customer(int id, String name, int age, String sex, long mobile, String address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.mobile = mobile;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", age=" + age + ", sex=" + sex + ", mobile=" + mobile
				+ ", address=" + address + "]";
	}
	
	
	

}
