package objects;

public class EmployeeTest {
public static void main(String[] args) {
	Address adr = new Address(101, 203, 12, "Bangalore", "Karnataka");
	Employee emp = new Employee(3514, "Sanjee Kumar", "Trigent Software", adr);
	emp.getEmpDetails();
	System.out.println(emp);
}
}

