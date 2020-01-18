package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import obj.User;

public class UserDB implements DatabaseInfor {
    public User getUser(String id) {
	User s = null;
	try {
	    Class.forName(driverName);
	    Connection con = DriverManager.getConnection(dbURL, userDB, passDB);

	    Statement stmt = con.createStatement();
	    ResultSet rs = stmt.executeQuery(
	                    "Select userID, fullName, email, password, status, userRight from User where userID='"
	                                    + id + "'");
	    if (rs.next()) {
		String userID = rs.getString(1);
		String fullName = rs.getString(2);
		String email = rs.getString(3);
		String password = rs.getString(4);
		String status = rs.getString(5);
		int userRight = rs.getInt(6);

		s = new User(userID, fullName, email, password, status, userRight);
	    }
	    con.close();
	    return s;
	} catch (Exception e) {
	    // TODO: handle exception
	    System.out.println(e);
	    return null;
	}
    }

    public ArrayList<User> allUsers() {
	ArrayList<User> s = new ArrayList<User>();
	try {
	    Class.forName(driverName);
	    Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
	    Statement stmt = con.createStatement();
	    ResultSet rs = stmt.executeQuery("Select * from Users");
	    while (rs.next()) {
		String userID = rs.getString(1);
		String fullName = rs.getString(2);
		String email = rs.getString(3);
		String password = rs.getString(4);
		String status = rs.getString(5);
		int userRight = rs.getInt(6);
		s.add(new User(userID, fullName, email, password, status, userRight));
	    }

	    con.close();
	    for (User i : s) {
		System.out.println(i);
	    }
	    return s;
	} catch (Exception e) {
	    // TODO: handle exception
	    System.out.println(e);
	    return null;
	}
    }

    public int addNewUser(String userID, String fullName, String email, String password,
                    String status, int userRight) {
	try {
	    Class.forName(driverName);
	    Connection con = DriverManager.getConnection(dbURL, userDB, passDB);

	    PreparedStatement stmt = con.prepareStatement("INSERT INTO Users VALUES (?,?,?,?,?,?)");
	    stmt.setString(1, userID);
	    stmt.setString(2, fullName);
	    stmt.setString(3, email);
	    stmt.setString(4, password);
	    stmt.setString(5, status);
	    stmt.setInt(6, userRight);

	    int rc = stmt.executeUpdate();
	    con.close();
	    System.out.println("Add User successfully");
	    return rc;
	} catch (Exception e) {
	    // TODO: handle exception
	    System.out.println(e);
	    return 0;
	}
    }

    public int deleteUser(String userID) {
	try {
	    Class.forName(driverName);
	    Connection con = DriverManager.getConnection(dbURL, userDB, passDB);

	    PreparedStatement stmt = con.prepareStatement("Delete from Users where UserID = ?");
	    stmt.setString(1, userID);
	    int rc = stmt.executeUpdate();
	    con.close();
	    System.out.println("delete successfully!");
	    return rc;
	} catch (Exception e) {
	    // TODO: handle exception
	    System.out.println("delete Fail");
	    return 0;
	}
    }

}
