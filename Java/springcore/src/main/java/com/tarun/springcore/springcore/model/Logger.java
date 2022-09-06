package com.tarun.springcore.springcore.model;

import java.util.Objects;
public class Logger {
	private Long loggerId, customerId, userId;
	private String screenName, action, ipAddress;
	private Employee employee;
	@Override
	public String toString() {
		return "Logger [loggerId=" + loggerId + ", customerId=" + customerId + ", userId=" + userId + ", screenName="
				+ screenName + ", action=" + action + ", ipAddress=" + ipAddress + ", employee=" + employee + "]";
	}
	public Logger() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Logger(Long loggerId, Long customerId, Long userId, String screenName, String action, String ipAddress,
			Employee employee) {
		super();
		this.loggerId = loggerId;
		this.customerId = customerId;
		this.userId = userId;
		this.screenName = screenName;
		this.action = action;
		this.ipAddress = ipAddress;
		this.employee = employee;
	}
	@Override
	public int hashCode() {
		return Objects.hash(action, customerId, employee, ipAddress, loggerId, screenName, userId);
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
				&& Objects.equals(employee, other.employee) && Objects.equals(ipAddress, other.ipAddress)
				&& Objects.equals(loggerId, other.loggerId) && Objects.equals(screenName, other.screenName)
				&& Objects.equals(userId, other.userId);
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
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
