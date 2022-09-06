package com.tarun.hibernate_annotation;

import java.util.Calendar;
import java.util.Date;
import java.util.Objects;


import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.io.Serializable;
import java.time.*;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Version;


@Entity
public class Author implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 2594246459140345776L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long authorID;
    @Column(name="name", length=50)
    private String authorName;
    private Boolean bookPublished;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOfPublication;
    private LocalDate daterelease;
    private LocalDateTime daterelease1;
    private Duration contractValidity;
    private Calendar dateOfContract;
    @Version
    private Integer version;
    @Enumerated
    private Gender gender;
    @CreationTimestamp
    private LocalDate createdAt;
    @UpdateTimestamp
    private LocalDate updatedAt;
    @OneToOne(cascade=CascadeType.ALL)
    private Laptop laptop;
	public Long getAuthorID() {
		return authorID;
	}
	public void setAuthorID(Long authorID) {
		this.authorID = authorID;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public Boolean getBookPublished() {
		return bookPublished;
	}
	public void setBookPublished(Boolean bookPublished) {
		this.bookPublished = bookPublished;
	}
	public Date getDateOfPublication() {
		return dateOfPublication;
	}
	public void setDateOfPublication(Date dateOfPublication) {
		this.dateOfPublication = dateOfPublication;
	}
	public LocalDate getDaterelease() {
		return daterelease;
	}
	public void setDaterelease(LocalDate daterelease) {
		this.daterelease = daterelease;
	}
	public LocalDateTime getDaterelease1() {
		return daterelease1;
	}
	public void setDaterelease1(LocalDateTime daterelease1) {
		this.daterelease1 = daterelease1;
	}
	public Duration getContractValidity() {
		return contractValidity;
	}
	public void setContractValidity(Duration contractValidity) {
		this.contractValidity = contractValidity;
	}
	public Calendar getDateOfContract() {
		return dateOfContract;
	}
	public void setDateOfContract(Calendar dateOfContract) {
		this.dateOfContract = dateOfContract;
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public LocalDate getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}
	public LocalDate getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(LocalDate updatedAt) {
		this.updatedAt = updatedAt;
	}
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	@Override
	public int hashCode() {
		return Objects.hash(authorID, authorName, bookPublished, contractValidity, createdAt, dateOfContract,
				dateOfPublication, daterelease, daterelease1, gender, laptop, updatedAt, version);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Author other = (Author) obj;
		return Objects.equals(authorID, other.authorID) && Objects.equals(authorName, other.authorName)
				&& Objects.equals(bookPublished, other.bookPublished)
				&& Objects.equals(contractValidity, other.contractValidity)
				&& Objects.equals(createdAt, other.createdAt) && Objects.equals(dateOfContract, other.dateOfContract)
				&& Objects.equals(dateOfPublication, other.dateOfPublication)
				&& Objects.equals(daterelease, other.daterelease) && Objects.equals(daterelease1, other.daterelease1)
				&& gender == other.gender && Objects.equals(laptop, other.laptop)
				&& Objects.equals(updatedAt, other.updatedAt) && Objects.equals(version, other.version);
	}
	@Override
	public String toString() {
		return "Author [authorID=" + authorID + ", authorName=" + authorName + ", bookPublished=" + bookPublished
				+ ", dateOfPublication=" + dateOfPublication + ", daterelease=" + daterelease + ", daterelease1="
				+ daterelease1 + ", contractValidity=" + contractValidity + ", dateOfContract=" + dateOfContract
				+ ", version=" + version + ", gender=" + gender + ", createdAt=" + createdAt + ", updatedAt="
				+ updatedAt + ", laptop=" + laptop + "]";
	}
}
