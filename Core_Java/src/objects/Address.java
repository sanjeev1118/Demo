package objects;

public class Address {
	private int id;
	private int flatNo;
	private int streetNo;
	private String city;
	private String state;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getFlatNo() {
		return flatNo;
	}
	public void setFlatNo(int flatNo) {
		this.flatNo = flatNo;
	}
	public int getStreetNo() {
		return streetNo;
	}
	public void setStreetNo(int streetNo) {
		this.streetNo = streetNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Address(int id, int flatNo, int streetNo, String city, String state) {
		this.id = id;
		this.flatNo = flatNo;
		this.streetNo = streetNo;
		this.city = city;
		this.state = state;
	}
	public void getAddress() {
		System.out.println("Address:-"+"\n"+"Id: "+id+"\n"+"Flat No: "+flatNo+"\n"+"Street No: "+streetNo+"\n"+"City: "+city+"\n"+"State: "+state);
	}
	
	

}
