package com.model;

public class Product {
	
	private int id;
	private String yearPublished;
	private String author;
	private String title;
	private boolean isAvailable;
	
	public Product(int id, String yearPublished, String author, String title, boolean isAvailable) {
		super();
		this.id = id;
		this.yearPublished = yearPublished;
		this.author = author;
		this.title = title;
		this.isAvailable = isAvailable;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(String yearPublished) {
		this.yearPublished = yearPublished;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", yearPublished=" + yearPublished + ", author=" + author + ", title=" + title
				+ "]";
	}
	
	
	
	
}
