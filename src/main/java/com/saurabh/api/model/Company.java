package com.saurabh.api.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

public class Company implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	private String companyId;
	private String companyName;
	private String companyPhoneNo;
	private String companyCEO;
	private Long foundedYear;
	private boolean isActive;
	private String status;
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyPhoneNo() {
		return companyPhoneNo;
	}
	public void setCompanyPhoneNo(String companyPhoneNo) {
		this.companyPhoneNo = companyPhoneNo;
	}
	public String getCompanyCEO() {
		return companyCEO;
	}
	public void setCompanyCEO(String companyCEO) {
		this.companyCEO = companyCEO;
	}
	public Long getFoundedYear() {
		return foundedYear;
	}
	public void setFoundedYear(Long foundedYear) {
		this.foundedYear = foundedYear;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
