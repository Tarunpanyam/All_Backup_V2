package com.example.demo.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transaction")
public class Transaction {
	@Id
	private long transactionId;

	private String customerId;
	
	private String currencyCode;
	
	private String senderBic;
	
	private String receiverBic;

	private String receiverAccountHolderNumber;
	
	private String receiverAccountHolderName;

	private String transferTypeCode;

	private String messageCode;

	private String receiverId;

	private double currencyAmount;

	private double transferFees;

	private double clearBalance;

	@Column(name = "trans_date")
	private String transactionDate;

	
	public Transaction() {
		super();
	}

	public long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getSenderBic() {
		return senderBic;
	}

	public void setSenderBic(String senderBic) {
		this.senderBic = senderBic;
	}

	public String getReceiverBic() {
		return receiverBic;
	}

	public void setReceiverBic(String receiverBic) {
		this.receiverBic = receiverBic;
	}

	public String getReceiverAccountHolderNumber() {
		return receiverAccountHolderNumber;
	}

	public void setReceiverAccountHolderNumber(String receiverAccountHolderNumber) {
		this.receiverAccountHolderNumber = receiverAccountHolderNumber;
	}

	public String getReceiverAccountHolderName() {
		return receiverAccountHolderName;
	}

	public void setReceiverAccountHolderName(String receiverAccountHolderName) {
		this.receiverAccountHolderName = receiverAccountHolderName;
	}

	public String getTransferTypeCode() {
		return transferTypeCode;
	}

	public void setTransferTypeCode(String transferTypeCode) {
		this.transferTypeCode = transferTypeCode;
	}

	public String getMessageCode() {
		return messageCode;
	}

	public void setMessageCode(String messageCode) {
		this.messageCode = messageCode;
	}

	public String getReceiverId() {
		return receiverId;
	}

	public void setReceiverId(String receiverId) {
		this.receiverId = receiverId;
	}

	public double getCurrencyAmount() {
		return currencyAmount;
	}

	public void setCurrencyAmount(double currencyAmount) {
		this.currencyAmount = currencyAmount;
	}

	public double getTransferFees() {
		return transferFees;
	}

	public void setTransferFees(double transferFees) {
		this.transferFees = transferFees;
	}

	public double getClearBalance() {
		return clearBalance;
	}

	public void setClearBalance(double clearBalance) {
		this.clearBalance = clearBalance;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(clearBalance, currencyAmount, currencyCode, customerId, messageCode,
				receiverAccountHolderName, receiverAccountHolderNumber, receiverBic, receiverId, senderBic,
				transactionDate, transactionId, transferFees, transferTypeCode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transaction other = (Transaction) obj;
		return Double.doubleToLongBits(clearBalance) == Double.doubleToLongBits(other.clearBalance)
				&& Double.doubleToLongBits(currencyAmount) == Double.doubleToLongBits(other.currencyAmount)
				&& Objects.equals(currencyCode, other.currencyCode) && Objects.equals(customerId, other.customerId)
				&& Objects.equals(messageCode, other.messageCode)
				&& Objects.equals(receiverAccountHolderName, other.receiverAccountHolderName)
				&& Objects.equals(receiverAccountHolderNumber, other.receiverAccountHolderNumber)
				&& Objects.equals(receiverBic, other.receiverBic) && Objects.equals(receiverId, other.receiverId)
				&& Objects.equals(senderBic, other.senderBic) && Objects.equals(transactionDate, other.transactionDate)
				&& transactionId == other.transactionId
				&& Double.doubleToLongBits(transferFees) == Double.doubleToLongBits(other.transferFees)
				&& Objects.equals(transferTypeCode, other.transferTypeCode);
	}

	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", customerId=" + customerId + ", currencyCode="
				+ currencyCode + ", senderBic=" + senderBic + ", receiverBic=" + receiverBic
				+ ", receiverAccountHolderNumber=" + receiverAccountHolderNumber + ", receiverAccountHolderName="
				+ receiverAccountHolderName + ", transferTypeCode=" + transferTypeCode + ", messageCode=" + messageCode
				+ ", receiverId=" + receiverId + ", currencyAmount=" + currencyAmount + ", transferFees=" + transferFees
				+ ", clearBalance=" + clearBalance + ", transactionDate=" + transactionDate + "]";
	}


	
	
}