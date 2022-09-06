package oop.encaptulation;

public class Person {

	private Integer PersonID;
	private String personName;
	private Boolean vaccinated;
	private Long aadharCard;

	public void persibCanWalk() {
		System.out.println("A Persob can walk");
	}

	public Integer getPersonID() {
		return PersonID;
	}

	public void setPersonID(Integer personID) {
		PersonID = personID;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public Boolean getVaccinated() {
		return vaccinated;
	}

	public void setVaccinated(Boolean vaccinated) {
		this.vaccinated = vaccinated;
	}

	public Long getAadharCard() {
		return aadharCard;
	}

	public void setAadharCard(Long aadharCard) {
		this.aadharCard = aadharCard;
	}
}
