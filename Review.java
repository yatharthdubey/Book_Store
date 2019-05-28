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

public class Review {
	@Id
	@GeneratedValue(generator="review",strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name="review",sequenceName="6",initialValue=100,allocationSize=1)
	private int reviewId;
	
	private String bookName;
	private int rating;
	private String headLine;
	private String comment;
	public int getReviewId() {
		return reviewId;
	}
	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getHeadLine() {
		return headLine;
	}
	public void setHeadLine(String headLine) {
		this.headLine = headLine;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Date getReviewDate() {
		return reviewDate;
	}
	public void setReviewDate(Date reviewDate) {
		this.reviewDate = reviewDate;
	}
	private String customerName;
	private Date reviewDate; 
	@Override
	public String toString() {
		return "Review [reviewId=" + reviewId + ", bookName=" + bookName + ", rating=" + rating + ", headLine="
				+ headLine + ", comment=" + comment + ", customerName=" + customerName + ", reviewDate=" + reviewDate
				+ "]";
	}

}
