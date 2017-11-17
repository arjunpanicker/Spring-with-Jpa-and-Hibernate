package com.pluralsight.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Activity {

	@Id
	private Long id;
	
	private String desc;

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}
