package com.model;
// Generated 2016-5-28 20:34:30 by Hibernate Tools 5.1.0.Alpha1

import java.util.Date;

/**
 * User generated by hbm2java
 */
public class User implements java.io.Serializable {

	private int userid;
	private String username;
	private String sex;
	private String birth;
	private Integer telephone;
	private Integer idCard;
	private String email;
	private String password;
	private Integer bankCard;
	private Integer account;
	private int status;
	private String validateCode;
	private Date signupTime;

	public User() {
	}

	public User(int userid, String username, String email, String password, int status, String validateCode,
			Date signupTime) {
		this.userid = userid;
		this.username = username;
		this.email = email;
		this.password = password;
		this.status = status;
		this.validateCode = validateCode;
		this.signupTime = signupTime;
	}

	public User(int userid, String username, String sex, String birth, Integer telephone, Integer idCard, String email,
			String password, Integer bankCard, Integer account, int status, String validateCode, Date signupTime) {
		this.userid = userid;
		this.username = username;
		this.sex = sex;
		this.birth = birth;
		this.telephone = telephone;
		this.idCard = idCard;
		this.email = email;
		this.password = password;
		this.bankCard = bankCard;
		this.account = account;
		this.status = status;
		this.validateCode = validateCode;
		this.signupTime = signupTime;
	}

	public int getUserid() {
		return this.userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirth() {
		return this.birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public Integer getTelephone() {
		return this.telephone;
	}

	public void setTelephone(Integer telephone) {
		this.telephone = telephone;
	}

	public Integer getIdCard() {
		return this.idCard;
	}

	public void setIdCard(Integer idCard) {
		this.idCard = idCard;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getBankCard() {
		return this.bankCard;
	}

	public void setBankCard(Integer bankCard) {
		this.bankCard = bankCard;
	}

	public Integer getAccount() {
		return this.account;
	}

	public void setAccount(Integer account) {
		this.account = account;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getValidateCode() {
		return this.validateCode;
	}

	public void setValidateCode(String validateCode) {
		this.validateCode = validateCode;
	}

	public Date getSignupTime() {
		return this.signupTime;
	}

	public void setSignupTime(Date signupTime) {
		this.signupTime = signupTime;
	}

}
