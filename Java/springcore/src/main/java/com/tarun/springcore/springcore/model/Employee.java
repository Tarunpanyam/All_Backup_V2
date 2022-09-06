package com.tarun.springcore.springcore.model;

import java.util.Objects;
public class Employee {

	 private Integer employeeId;
	    private String employeeName, employeePassword;
		public Integer getEmployeeId() {
			return employeeId;
		}
		public void setEmployeeId(Integer employeeId) {
			this.employeeId = employeeId;
		}
		public String getEmployeeName() {
			return employeeName;
		}
		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}
		public String getEmployeePassword() {
			return employeePassword;
		}
		public void setEmployeePassword(String employeePassword) {
			this.employeePassword = employeePassword;
		}
		@Override
		public int hashCode() {
			return Objects.hash(employeeId, employeeName, employeePassword);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			return Objects.equals(employeeId, other.employeeId) && Objects.equals(employeeName, other.employeeName)
					&& Objects.equals(employeePassword, other.employeePassword);
		}
		@Override
		public String toString() {
			return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeePassword="
					+ employeePassword + "]";
		}
}
