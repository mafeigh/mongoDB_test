package com.test;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
	private static final long serialVersionUID = -8342800641768137847L;
	public String name;
	public String age;
	public Date time;
	public Oid _id;

	public User(String name, String age, Date time) {
		super();
		this.name = name;
		this.age = age;
		this.time = time;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public class Oid {
		String $oid;

		public String get$oid() {
			return $oid;
		}

		public void set$oid(String $oid) {
			this.$oid = $oid;
		}

	}
}
