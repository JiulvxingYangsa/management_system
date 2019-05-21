package com.management_system.bean;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class ManagementUser implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer uId;
	private String uName;
	private Integer uAge;
	private String uGender;
	private String uNumber;
	private String uUser;
	private String uPassword;
	
	public ManagementUser() {
		
	}

	public Integer getuId() {
		return uId;
	}

	public void setuId(Integer uId) {
		this.uId = uId;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public Integer getuAge() {
		return uAge;
	}

	public void setuAge(Integer uAge) {
		this.uAge = uAge;
	}

	public String getuGender() {
		return uGender;
	}

	public void setuGender(String uGender) {
		this.uGender = uGender;
	}

	public String getuNumber() {
		return uNumber;
	}

	public void setuNumber(String uNumber) {
		this.uNumber = uNumber;
	}

	public String getuUser() {
		return uUser;
	}

	public void setuUser(String uUser) {
		this.uUser = uUser;
	}

	public String getuPassword() {
		return uPassword;
	}

	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}

	public ManagementUser(Integer uId, String uName, Integer uAge, String uGender, String uNumber, String uUser,
			String uPassword) {
		super();
		this.uId = uId;
		this.uName = uName;
		this.uAge = uAge;
		this.uGender = uGender;
		this.uNumber = uNumber;
		this.uUser = uUser;
		this.uPassword = uPassword;
	}

	@Override
	public String toString() {
		return "ManagementUser [uId=" + uId + ", uName=" + uName + ", uAge=" + uAge + ", uGender=" + uGender
				+ ", uNumber=" + uNumber + ", uUser=" + uUser + ", uPassword=" + uPassword + "]";
	}
	
	
	
	
}
