package com.example.demo.entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "message")
public class Message {
	@Id
	private String messageCode;
	private String instruction;

	public Message() {
		super();
	}
	
	public Message(String messageCode, String instruction) {
		super();
		this.messageCode = messageCode;
		this.instruction = instruction;
	}


	public String getMessagecode() {
		return messageCode;
	}

	public void setMessagecode(String messageCode) {
		this.messageCode = messageCode;
	}

	public String getInstruction() {
		return instruction;
	}

	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}

	@Override
	public int hashCode() {
		return Objects.hash(instruction, messageCode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Message other = (Message) obj;
		return Objects.equals(instruction, other.instruction) && Objects.equals(messageCode, other.messageCode);
	}

	@Override
	public String toString() {
		return "Message_code [messagecode=" + messageCode + ", instruction=" + instruction + "]";
	}

}
