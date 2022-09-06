package com.example.demo.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
	
	@Id
	private String customerId;
	
	private String accountHolderName;
	
	private double clearBalance;
	
	private String customerAddress;
	
	private String customerCity;
	
	private String customerType;
	
	@Column(name="over_draft_flag") 
	private boolean overdraftFlag;

	public Customer() {
		super();
	}

	
	public Customer(String customerId, String accountHolderName, double clearBalance, String customerAddress,
			String customerCity, String customerType, boolean overdraftFlag) {
		super();
		this.customerId = customerId;
		this.accountHolderName = accountHolderName;
		this.clearBalance = clearBalance;
		this.customerAddress = customerAddress;
		this.customerCity = customerCity;
		this.customerType = customerType;
		this.overdraftFlag = overdraftFlag;
	}


	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getClearBalance() {
		return clearBalance;
	}

	public void setClearBalance(double clearBalance) {
		this.clearBalance = clearBalance;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public boolean isOverdraftFlag() {
		return overdraftFlag;
	}

	public void setOverdraftFlag(boolean overdraftFlag) {
		this.overdraftFlag = overdraftFlag;
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountHolderName, clearBalance, customerAddress, customerCity, customerId, customerType,
				overdraftFlag);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(accountHolderName, other.accountHolderName)
				&& Double.doubleToLongBits(clearBalance) == Double.doubleToLongBits(other.clearBalance)
				&& Objects.equals(customerAddress, other.customerAddress)
				&& Objects.equals(customerCity, other.customerCity) && Objects.equals(customerId, other.customerId)
				&& Objects.equals(customerType, other.customerType) && overdraftFlag == other.overdraftFlag;
	}

	@Override
	public String toString() {
		return "Customers [customerId=" + customerId + ", accountHolderName=" + accountHolderName + ", clearBalance="
				+ clearBalance + ", customerAddress=" + customerAddress + ", customerCity=" + customerCity
				+ ", customerType=" + customerType + ", overdraftFlag=" + overdraftFlag + "]";
	}

	

//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "customertransactionid")
	
}