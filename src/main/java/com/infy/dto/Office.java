package com.infy.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="office_tabl")
public class Office {
	@Id
	@Column(name="oid")
	int officeId;
	@Column(name="ostreet",length=20)
	String oStreet;
	@Column(name="ocity",length=20)
	String oCity;
	public Office() {
		super();
	}
	public Office(int officeId, String oStreet, String oCity) {
		super();
		this.officeId = officeId;
		this.oStreet = oStreet;
		this.oCity = oCity;
	}
	public int getOfficeId() {
		return officeId;
	}
	public void setOfficeId(int officeId) {
		this.officeId = officeId;
	}
	public String getoStreet() {
		return oStreet;
	}
	public void setoStreet(String oStreet) {
		this.oStreet = oStreet;
	}
	public String getoCity() {
		return oCity;
	}
	public void setoCity(String oCity) {
		this.oCity = oCity;
	}
	@Override
	public String toString() {
		return "Office [officeId=" + officeId + ", oStreet=" + oStreet + ", oCity=" + oCity + "]";
	}
}
