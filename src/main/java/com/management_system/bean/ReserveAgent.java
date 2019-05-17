package com.management_system.bean;

import java.io.Serializable;

import org.springframework.stereotype.Controller;
@Controller
public class ReserveAgent implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer cId;
	private String cName;
	private String cEmail;
	private String cNumber;
	private String cIdea;
	private String cTime;
	
	
	public ReserveAgent() {
	
	}

	public Integer getcId() {
		return cId;
	}
	public void setcId(Integer cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcEmail() {
		return cEmail;
	}
	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}
	public String getcNumber() {
		return cNumber;
	}
	public void setcNumber(String cNumber) {
		this.cNumber = cNumber;
	}
	public String getcIdea() {
		return cIdea;
	}
	public void setcIdea(String cIdea) {
		this.cIdea = cIdea;
	}
	public String getcTime() {
		return cTime;
	}
	public void setcTime(String cTime) {
		this.cTime = cTime;
	}

	public ReserveAgent(Integer cId, String cName, String cEmail, String cNumber, String cIdea, String cTime) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cEmail = cEmail;
		this.cNumber = cNumber;
		this.cIdea = cIdea;
		this.cTime = cTime;
	}

	@Override
	public String toString() {
		return "reserveAgent [cId=" + cId + ", cName=" + cName + ", cEmail=" + cEmail + ", cNumber=" + cNumber
				+ ", cIdea=" + cIdea + ", cTime=" + cTime + "]";
	}
	
	
	
}
