package oopd.StudentOpSchool;

public class Student {
	
	private String naam;
	private int nummer;
	private School school;
	
	public Student(String naam, int nummer, School school){
		this.setNaam(naam);
		this.setNummer(nummer);
		this.setSchool(school);
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public int getNummer() {
		return nummer;
	}

	public void setNummer(int nummer) {
		this.nummer = nummer;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

}
