package com.example.demo.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transfer_type")
public class TransferType {
	@Id
	@Column(name="transfer_type_code")
	private String transferCode;
	
	@Column(name="transfer_type_description")
	private String transferDescription;

	public TransferType() {
		super();
	}
	
	public TransferType(String transferCode, String transferDescription) {
		super();
		this.transferCode = transferCode;
		this.transferDescription = transferDescription;
	}


	public String getTransferCode() {
		return transferCode;
	}

	public void setTransferCode(String transferCode) {
		this.transferCode = transferCode;
	}

	public String getTransferDescription() {
		return transferDescription;
	}

	public void setTransferDescription(String transferDescription) {
		this.transferDescription = transferDescription;
	}

	@Override
	public int hashCode() {
		return Objects.hash(transferCode, transferDescription);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TransferType other = (TransferType) obj;
		return Objects.equals(transferCode, other.transferCode)
				&& Objects.equals(transferDescription, other.transferDescription);
	}

	@Override
	public String toString() {
		return "TransferType [transferCode=" + transferCode + ", transferDescription=" + transferDescription + "]";
	}

	

}
