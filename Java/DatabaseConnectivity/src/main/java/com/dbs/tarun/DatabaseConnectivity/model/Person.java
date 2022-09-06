package com.dbs.tarun.DatabaseConnectivity.model;

import java.io.Serializable;
import java.util.Objects;

public class Person  implements Serializable {
	  private static final long serialVersionUID = 5504727357483166697L;
	  
	private Integer personId;
    private String personName, PersonCity;
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", PersonCity=" + PersonCity + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(PersonCity, personId, personName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(PersonCity, other.PersonCity) && Objects.equals(personId, other.personId)
				&& Objects.equals(personName, other.personName);
	}
	public Integer getPersonId() {
		return personId;
	}
	public void setPersonId(Integer personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getPersonCity() {
		return PersonCity;
	}
	public void setPersonCity(String personCity) {
		PersonCity = personCity;
	}

}
