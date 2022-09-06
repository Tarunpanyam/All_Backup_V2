package com.tarun.springcore.lifecycle.lifecycle;

import java.util.Objects;
public class Logger {
	private Long loggerId, customerId, userId;
	private String screenName, action, ipAddress;
	
	public void init_method() {
		System.out.println("Logger object is initialized");
	}
	
	public void destroy_method() {
		System.out.println("Logger object is deleted");
	}
	
	
	public Long getLoggerId() {
		return loggerId;
	}
	public void setLoggerId(Long loggerId) {
		this.loggerId = loggerId;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	@Override
	public int hashCode() {
		return Objects.hash(action, customerId, ipAddress, loggerId, screenName, userId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Logger other = (Logger) obj;
		return Objects.equals(action, other.action) && Objects.equals(customerId, other.customerId)
				&& Objects.equals(ipAddress, other.ipAddress) && Objects.equals(loggerId, other.loggerId)
				&& Objects.equals(screenName, other.screenName) && Objects.equals(userId, other.userId);
	}
	@Override
	public String toString() {
		return "Logger [loggerId=" + loggerId + ", customerId=" + customerId + ", userId=" + userId + ", screenName="
				+ screenName + ", action=" + action + ", ipAddress=" + ipAddress + "]";
	}
	

}
