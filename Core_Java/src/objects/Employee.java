package objects;

public class Employee {
private int id;
private String name;
private String company;
private Address adr;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public Address getAdr() {
	return adr;
}
public void setAdr(Address adr) {
	this.adr = adr;
}
public Employee(int id, String name, String company, Address adr) {
	super();
	this.id = id;
	this.name = name;
	this.company = company;
	this.adr = adr;
}
public void getEmpDetails() {
	System.out.println("Employee Details are as follows:-"+"\n"+"Id: "+id+"\n"+"Name: "+name+"\n"+"company: "+company);
	adr.getAddress();
	
	}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", company=" + company + ", adr=" + adr + "]";
}
@Override
public boolean equals(Object obj) {
	return false;
}

}
