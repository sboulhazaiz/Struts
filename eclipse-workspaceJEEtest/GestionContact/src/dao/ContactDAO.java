package dao;

/*import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;*/

import entites.Contact;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ContactDAO {
	
	String driver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost/jee";
	String uid = "root"; String passwd = "";
	DataSource ds = null;
	Connection cx = null;
	Statement stmt = null;
	
	public void create(String lastN, String firstN, String mail) {
		//System.out.println("Ajout du contact : "+obj.getFirstName()+" "+obj.getLastName());
		try {
			Context ctx = new InitialContext();
			ds=(DataSource)ctx.lookup("java:comp/env/jdbc/ContactBD");
			//System.out.println("Nom :"+ obj.getFirstName() + " "+obj.getLastName());
			cx=ds.getConnection();
			
			String requete = "INSERT INTO contact(last_name,first_name,email)"
					+ "VALUES ('"+lastN+"','"+firstN+"','"+mail+"')";
			cx.createStatement().executeUpdate(requete);
			}
		catch(SQLException e) {
			e.printStackTrace();
		}
		catch(NamingException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(cx!=null) cx.close();
			} catch (SQLException e) { e.printStackTrace();} 
		}
	}
	
	public List<Contact> find() {
		List<Contact> lesContacts = new ArrayList<Contact>();
		try {
			Class.forName(driver);
			cx = DriverManager.getConnection(url, uid, passwd);
			stmt = cx.createStatement();
			String requete = "SELECT * FROM contact";
			ResultSet rs = stmt.executeQuery(requete);
			while(rs.next()) {
				int cnt_id = rs.getInt("ID");
				String lastName = rs.getString("last_name");
				String firstName = rs.getString("first_name");
				String email = rs.getString("email");
				System.out.println(cnt_id+"-"+lastName+" "+firstName);
				lesContacts.add(new Contact(cnt_id,firstName,lastName,email));
			}
			}
		catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
		catch (SQLException e) {
			throw new RuntimeException(e);
		}
		finally {
			try {
				if(stmt != null) stmt.close();
				if(cx != null) cx.close();
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		
		}
		return lesContacts;
	}
	
	public List<Contact> find(Contact c) {
		List<Contact> lesContacts = new ArrayList<Contact>();
		try {
			Class.forName(driver);
			cx = DriverManager.getConnection(url, uid, passwd);
			stmt = cx.createStatement();
			String requete = "SELECT * FROM contact WHERE last_name='"+c.getLastName()+"'";
			ResultSet rs = stmt.executeQuery(requete);
			while(rs.next()) {
				int cnt_id = rs.getInt("ID");
				String lastName = rs.getString("last_name");
				String firstName = rs.getString("first_name");
				String email = rs.getString("email");
				System.out.println(cnt_id+"-"+lastName+" "+firstName);
				lesContacts.add(new Contact(cnt_id,firstName,lastName,email));
			}
			}
		catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
		catch (SQLException e) {
			throw new RuntimeException(e);
		}
		finally {
			try {
				if(stmt != null) stmt.close();
				if(cx != null) cx.close();
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		
		}
		return lesContacts;
	}
	
	
	public void update(String nom, String prenom, String email) {
		//System.out.println("Modification contact : "+obj.getFirstName()+" "+obj.getLastName());
	    
	    //return obj;
	}


	public void delete(Contact obj) {
		System.out.println("Supp du contact : "+obj.getFirstName()+" "+obj.getLastName());
	}
}