package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import obj.Category;

public class CategoryDB implements DatabaseInfor {

    public Category getCategory(String cid) {
	Category s = null;
	try {
	    Class.forName(driverName);
	    Connection con = DriverManager.getConnection(dbURL, userDB, passDB);

	    Statement stmt = con.createStatement();
	    ResultSet rs = stmt.executeQuery("Select * from Category where bookID='" + cid + "'");
	    if (rs.next()) {
		String catID = rs.getString(1);
		String catName = rs.getString(2);
		s = new Category(catID, catName);
	    }
	    con.close();

	    return s;
	} catch (Exception e) {
	    // TODO: handle exception
	    System.out.println(e);
	    return null;
	}
    }

    public ArrayList<Category> allCategory() {
	ArrayList<Category> s = new ArrayList<Category>();
	try {
	    Class.forName(driverName);
	    Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
	    Statement stmt = con.createStatement();
	    ResultSet rs = stmt.executeQuery("Select * from Category");
	    while (rs.next()) {
		String catID = rs.getString(1);
		String catName = rs.getString(2);
		s.add(new Category(catID, catName));
	    }

	    con.close();
	    for (Category i : s) {
		System.out.println(i);
	    }
	    return s;
	} catch (Exception e) {
	    // TODO: handle exception
	    System.out.println(e);
	    return null;
	}
    }

    public int addNewCategory(String id, String name) {
	try {
	    Class.forName(driverName);
	    Connection con = DriverManager.getConnection(dbURL, userDB, passDB);

	    PreparedStatement stmt = con.prepareStatement("INSERT INTO Category VALUES (?,?)");
	    stmt.setString(1, id);
	    stmt.setString(2, name);

	    int rc = stmt.executeUpdate();
	    con.close();
	    System.out.println("Add successfully");
	    return rc;
	} catch (Exception e) {
	    // TODO: handle exception
	    System.out.println("Add fail");
	    return 0;
	}
    }

    public int deleteCategory(String id) {
	try {
	    Class.forName(driverName);
	    Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
	    String sql = "Delete from Category where CatID = ?";
	    PreparedStatement stmt = con.prepareStatement(sql);
	    stmt.setString(1, id);

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

    public int updateCategory(String id, String name) {
	try {
	    Class.forName(driverName);
	    Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
	    String sql = "Update Category set CatID = ?, Catname = ? where CatID = ?";
	    PreparedStatement stmt = con.prepareStatement(sql);

	    stmt.setString(1, id);
	    stmt.setString(2, name);
	    stmt.setString(3, id);
	    int rc = stmt.executeUpdate();
	    con.close();
	    System.out.println("Update successfully!");
	    return rc;
	} catch (Exception e) {
	    // TODO: handle exception
	    System.out.println("Update Fail");
	    return 0;
	}
    }

    public Category getCategorybyName(String name) {
	Category s = null;
	try {
	    Class.forName(driverName);
	    Connection con = DriverManager.getConnection(dbURL, userDB, passDB);

	    Statement stmt = con.createStatement();
	    ResultSet rs = stmt.executeQuery("Select * from Category where CatName='" + name + "'");
	    if (rs.next()) {
		String catID = rs.getString(1);
		String catName = rs.getString(2);
		s = new Category(catID, catName);
	    }
	    con.close();

	    return s;
	} catch (Exception e) {
	    // TODO: handle exception
	    System.out.println(e);
	    return null;
	}
    }

}
