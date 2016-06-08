package com.model;
// Generated 2016-5-28 20:34:30 by Hibernate Tools 5.1.0.Alpha1

/**
 * Doctor generated by hbm2java
 */
public class Doctor implements java.io.Serializable {

	private int id;
	private String name;
	private String introduction;
	

	private Integer telephone;
	private int depId;
	private int hid;
	private String level;
	private Integer fee;
	private String scheduling;
	private String picture;

	public Doctor() {
	}

	public Doctor(int id, String name, int depId, int hid) {
		this.id = id;
		this.name = name;
		this.depId = depId;
		this.hid = hid;
	}

	public Doctor(int id, String name, String introduction, Integer telephone, int depId, int hid, String level,
			Integer fee, String scheduling, String picture) {
		this.id = id;
		this.name = name;
		this.introduction = introduction;
		this.telephone = telephone;
		this.depId = depId;
		this.hid = hid;
		this.level = level;
		this.fee = fee;
		this.scheduling = scheduling;
		this.picture = picture;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	
	public Integer getTelephone() {
		return this.telephone;
	}

	public void setTelephone(Integer telephone) {
		this.telephone = telephone;
	}

	public int getDepId() {
		return this.depId;
	}

	public void setDepId(int depId) {
		this.depId = depId;
	}

	public int getHid() {
		return this.hid;
	}

	public void setHid(int hid) {
		this.hid = hid;
	}

	public String getLevel() {
		return this.level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public Integer getFee() {
		return this.fee;
	}

	public void setFee(Integer fee) {
		this.fee = fee;
	}

	public String getScheduling() {
		return this.scheduling;
	}

	public void setScheduling(String scheduling) {
		this.scheduling = scheduling;
	}

	public String getPicture() {
		return this.picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

}
