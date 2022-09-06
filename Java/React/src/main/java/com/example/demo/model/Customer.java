package com.example.demo.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	private String customerId;
	
	private String customerName;
	
	private double clearBalance;
	
	private boolean overDraftFlg;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getClearBalance() {
		return clearBalance;
	}

	public void setClearBalance(double clearBalance) {
		this.clearBalance = clearBalance;
	}

	public boolean isOverDraftFlg() {
		return overDraftFlg;
	}

	public void setOverDraftFlg(boolean overDraftFlg) {
		this.overDraftFlg = overDraftFlg;
	}

	@Override
	public int hashCode() {
		return Objects.hash(clearBalance, customerId, customerName, overDraftFlg);
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
		return Double.doubleToLongBits(clearBalance) == Double.doubleToLongBits(other.clearBalance)
				&& Objects.equals(customerId, other.customerId) && Objects.equals(customerName, other.customerName)
				&& overDraftFlg == other.overDraftFlg;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", clearBalance="
				+ clearBalance + ", overDraftFlg=" + overDraftFlg + "]";
	}
	
	

}
