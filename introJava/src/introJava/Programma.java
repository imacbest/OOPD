package introJava;

import oopd.StudentOpSchool.*;
//import oopd.TicketMachine.*;

public class Programma {
	// main
	public static void main(String[] args) {
		//studentFuncties();
	}
	
	public static void studentFuncties(){
		School deSchool = new School("HAN");
		
		Student s1 = new Student("Hanneke", 1, deSchool);
		System.out.println("Student naam: " + s1.getNaam());
		System.out.println("Student nummer: " + s1.getNummer());
		System.out.println("School naam: " + s1.getSchool().getNaam());
	}

}
