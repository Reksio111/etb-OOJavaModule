package com.example.inheritance.employee2;

public class EmployeeTester {

	public static void main(String[] args) {
		HourlyEmployee hourlystaff = new HourlyEmployee("Joe", "Crow", 11.78);
		//CommissionEmployee commissionstaff = new CommissionEmployee("Martina", "Smith", .2);
		//PieceWorkers pieceWorker = new PieceWorkers("Martin", "Smith", 12.5);
		//System.out.println(commissionstaff.toString() + "\n");

		System.out.println(hourlystaff.toString());

		System.out.println("Weekly salary: " + hourlystaff.weeklyEarning(41) + " euro.\n");

	//	System.out.println(pieceWorker.toString() + "\n");

	//	System.out.println(pieceWorker.toString() + "\n" + pieceWorker.calculateSalary(12));

	}

}
