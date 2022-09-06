package com.tarun.hibernative_withXML.model;

import java.util.Objects;

//POJO class not supported
public class Book {
	private Integer isbn;  // wraper class recommended
	private String title;
	private Float price;
	private Long pages;
	public Integer getIsbn() {
		return isbn;
	}
	public void setIsbn(Integer isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public Long getPages() {
		return pages;
	}
	public void setPages(Long pages) {
		this.pages = pages;
	}
	@Override
	public int hashCode() {
		return Objects.hash(isbn, pages, price, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(isbn, other.isbn) && Objects.equals(pages, other.pages)
				&& Objects.equals(price, other.price) && Objects.equals(title, other.title);
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", price=" + price + ", pages=" + pages + "]";
	}
	
	

}
