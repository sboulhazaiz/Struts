package services;

import java.util.List;

import dao.ContactDAO;
import entites.Contact;

public class ContactService {
	ContactDAO dao;
	
	public ContactService() {
		this.dao = new ContactDAO();
	}
	
	public boolean addContact(String nom, String prenom, String mail) {
		dao.create(nom, prenom, mail);
		return true;
	}
	
	public List<Contact> readContact(Contact c) {
		return dao.find(c);
	}
	
	public List<Contact> readContact() {
		return dao.find();
	}
	
	public boolean updateContact(String nom, String prenom, String email) {
		dao.update(nom, prenom, email);
		return true;
	}
	
	public void deleteContact(Contact cont) {
		dao.delete(cont);
	}
	
}
