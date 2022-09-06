package oop.encaptulation;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person = new Person();
		person.setAadharCard(234757849L);
		person.setPersonID(33345);
		person.setPersonName("Tarun");
		person.setVaccinated(true);
		
		System.out.println(person.getPersonName()+"\n"+person.getVaccinated());
		
		person.persibCanWalk();
	}

}
