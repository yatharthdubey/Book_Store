package com.capgemini.book_store.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "Customer")

public class Customer {
	@Id
	@GeneratedValue(generator="customer",strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name="customer",sequenceName="4",initialValue=100,allocationSize=1)
	private int customerId;
	private String emailId;
	private String customerName;
	private String city;
	private String country;
	private Date registedate;
	private String mobileNumber;
	private String address;
	private String zipcode;
	private String password;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Date getRegistedate() {
		return registedate;
	}

	public void setRegistedate(Date registedate) {
		this.registedate = registedate;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Customer(int customerId, String emailId, String customerName, String city, String country, Date registedate,
			String mobileNumber, String address, String zipcode, String password) {
		super();
		this.customerId = customerId;
		this.emailId = emailId;
		this.customerName = customerName;
		this.city = city;
		this.country = country;
		this.registedate = registedate;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.zipcode = zipcode;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", emailId=" + emailId + ", customerName=" + customerName
				+ ", city=" + city + ", country=" + country + ", registedate=" + registedate + ", mobileNumber="
				+ mobileNumber + ", address=" + address + ", zipcode=" + zipcode + ", password=" + password + "]";
	}

}
