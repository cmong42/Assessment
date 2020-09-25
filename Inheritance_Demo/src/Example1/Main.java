package Example1;

public class Main {

	public static void main(String[] args) {
		Person person=new Person(100, "Sachin");
		System.out.println(person);
		
		Address a=new Address(188888, "XYZ Street Name", "San Fan", "Kansas", 1222222);
		Project proj = new Project(100, "Raj", "Beatrice Smith", 100000.00);
		Employee employee=new Employee(102, "Raj", "Manager", 123344.44d);
		employee.setPermenantAddress(a);
		employee.setPresentAddress(a);
		employee.setEmployeeProject(proj);
		System.out.println(employee);
		
		Address a2=new Address(188888, "XYZ Street Name", "San Fan", "Kansas", 1222222);
		Project proj2 = new Project(100, "Raj", "Beatrice Smith", 100000.00);
		Employee employee2=new Employee(102, "Raj", "Manager", 123344.44d);
		employee2.setPermenantAddress(a2);
		employee2.setPresentAddress(a2);
		employee2.setEmployeeProject(proj2);
		System.out.println(employee2);
		
		Player player=new Player(900, "Chris Morris", 100, "Cricket");
		Team t = new Team(200, "The Tigers", "Henry Max");
		player.setPlayerTeam(t);
		System.out.println(player);
		
		System.out.println(employee.equals(employee2));

	}

}
