package entites;

import java.util.List;

public class ContactGroup {
	private int groupId;
	private String groupName;
	private List<Contact> contacts;
	
	public List<Contact> getContacts() { return this.contacts; }
	public void setContacts(List<Contact> contacts) { this.contacts = contacts; }
	public int getGroupId() { return this.groupId; }
	public void setGroupId(int groupId) { this.groupId = groupId; }
	public String getGroupName() { return this.groupName; }
	public void setGroupName(String groupName) { this.groupName = groupName; }
}
