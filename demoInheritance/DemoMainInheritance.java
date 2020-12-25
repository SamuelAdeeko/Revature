package demoInheritance;

public class DemoMainInheritance {

	public static void main(String[] args) {
		
		ContractEmployee tempE1 = new ContractEmployee(100, "James", "Engineer", 87521.87);
		tempE1.printEmployee();
		System.out.println("********************************");
		
		ContractEmployee tempE2 = new ContractEmployee(200, "Borris", "Human Resource Assistant", 98477.50);
		tempE2.printEmployee();
		System.out.println("********************************");
		
		ContractEmployee tempE3 = new ContractEmployee(300, "Amanda", "Marketer", 58677.50);
		tempE3.printEmployee();
		System.out.println("********************************");
		
		Project p1 = new Project(1, " Construction of the San Francisco Bay Bridge " ,"CalTrans");
		
		ContractEmployee tempE4 = new ContractEmployee(400, "Greg", "Project Manager", 58677.50, p1);
		tempE4.printEmployee();
		System.out.println("********************************");
		
		Project p2 = new Project(2, " Building Construction of SalesForce Towers, San Francisco, Ca ", "SalesForce");
		
		ContractEmployee tempE5 = new ContractEmployee(500, "Nathaniel", "Construction worker", 42677.50, p2);
		tempE5.printEmployee();
		System.out.println("********************************");
		
		Address temp100 = new Address(54, "SweetWater Drive", "Oakland", 76583);
		ContractEmployee tempE6 = new ContractEmployee(600, "Christina", "Engineer", 10677.50, p2 , temp100);
		tempE6.printEmployee();
		System.out.println("********************************");
		
		Team team1 = new Team("Arsenal", 7865, "Arsene Wenger" , 6);
		Players player1 = new Players(101, "Drogba" , 9, "Ivory coast" , "Striker", true, team1) ;
		player1.printPlayer();
	}

}
