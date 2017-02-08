package test27;

import java.io.InputStream;
import java.io.Serializable;
/**
 * 
 * @author cleancp
 * 2017年2月8日下午1:52:11
 * transient阻止序列化
 */
public class Person implements Serializable{

	private transient String name ;
	private String sex ;
	private int age;
	private transient InputStream is;
	
	public Person() {
		super();
	}

	public Person(String name, String sex, int age ,InputStream is) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.is = is;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public InputStream getIs() {
		return is;
	}

	public void setIs(InputStream is) {
		this.is = is;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getName()+"-"+this.getSex()+"-"+this.getAge();
	}
}
