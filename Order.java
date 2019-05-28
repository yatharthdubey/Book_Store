package com.capgemini.book_store.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.springframework.stereotype.Component;

@Entity
@Component


public class Order {
	@Id
	@GeneratedValue(generator="order",strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name="order",sequenceName="5",initialValue=100,allocationSize=1)
    private int orderId;
	private int customerId;
	private int quantity;
	private double price;
	private String paymentMethod;
	private Date orderDate;
	private String receipientName;
	private String orderStatus;
	private String bookName;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getReceipientName() {
		return receipientName;
	}
	public void setReceipientName(String receipientName) {
		this.receipientName = receipientName;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Order(int orderId, int customerId, int quantity, double price, String paymentMethod, Date orderDate,
			String receipientName, String orderStatus, String bookName) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.quantity = quantity;
		this.price = price;
		this.paymentMethod = paymentMethod;
		this.orderDate = orderDate;
		this.receipientName = receipientName;
		this.orderStatus = orderStatus;
		this.bookName = bookName;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", customerId=" + customerId + ", quantity=" + quantity + ", price="
				+ price + ", paymentMethod=" + paymentMethod + ", orderDate=" + orderDate + ", receipientName="
				+ receipientName + ", orderStatus=" + orderStatus + ", bookName=" + bookName + "]";
	}
	
	
}
