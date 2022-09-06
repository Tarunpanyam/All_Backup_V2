package com.example.demo.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "currency")
public class Currency {
	@Id
	private String currencyCode; //currency_code
	
	private String currencyName;
	
	private double conversionRate;

	public Currency() {
		super();
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getCurrencyName() {
		return currencyName;
	}

	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}

	public double getConversionRate() {
		return conversionRate;
	}

	public void setConversionRate(double conversionRate) {
		this.conversionRate = conversionRate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conversionRate, currencyCode, currencyName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Currency other = (Currency) obj;
		return Double.doubleToLongBits(conversionRate) == Double.doubleToLongBits(other.conversionRate)
				&& Objects.equals(currencyCode, other.currencyCode) && Objects.equals(currencyName, other.currencyName);
	}

	@Override
	public String toString() {
		return "Currency [currencyCode=" + currencyCode + ", currencyName=" + currencyName + ", conversionRate="
				+ conversionRate + "]";
	}
	
}
