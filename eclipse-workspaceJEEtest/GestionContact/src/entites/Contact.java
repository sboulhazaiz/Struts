package entites;

import java.util.List;

public class Contact {
	private String firstName;
	private String lastName;
	private String email;
	private int id;
	private List<ContactGroup> books;
	private List<PhoneNumber> phones;
	private Address add;
	
	public Contact(int id,String firstName, String lastName, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.id = id;
	}
	
	public List<ContactGroup> getBooks() { return books; }
	public void setBooks(List<ContactGroup> books) { this.books = books; }
	public List<PhoneNumber> getProfiles() { return phones; }
	public void setProfile(List<PhoneNumber> phones) { this.phones = phones; }
	public Address getAdd() { return this.add; }
	public void setAdd(Address add) { this.add = add; }
	public String getEmail() { return this.email; }
	public String getFirstName() { return this.firstName; }
	public String getLastName() { return this.lastName; }
	public void setEmail(String email) { this.email = email; }
	public void setFirstName(String firstName) { this.firstName = firstName; }
	public void setLastName(String lastName) { this.lastName = lastName; }
	public int getId() { return this.id; }
	public void setId(int id) { this.id = id; }
}
