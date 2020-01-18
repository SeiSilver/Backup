package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import obj.Loglib;

public class LoglibDB implements DatabaseInfor {
    public Loglib getlog(String id) {
	Loglib s = null;
	try {
	    Class.forName(driverName);
	    Connection con = DriverManager.getConnection(dbURL, userDB, passDB);

	    Statement stmt = con.createStatement();
	    ResultSet rs = stmt.executeQuery(
	                    "Select userID, bookID, ngayDat, ngayMuon, ngayTra, maNV, logID from LogLibs where userID='"
	                                    + id + "'");
	    if (rs.next()) {
		String userID = rs.getString(1);
		String bookID = rs.getString(2);
		String ngayDat = rs.getString(3);
		String ngayMuon = rs.getString(4);
		String ngayTra = rs.getString(5);
		String maNV = rs.getString(6);
		String logID = rs.getString(7);

		s = new Loglib(userID, bookID, ngayDat, ngayMuon, ngayTra, maNV, logID);
	    }
	    con.close();
	    return s;
	} catch (Exception e) {
	    // TODO: handle exception
	    System.out.println(e);
	    return null;
	}
    }

    public ArrayList<Loglib> alllog() {
	ArrayList<Loglib> s = new ArrayList<Loglib>();
	try {
	    Class.forName(driverName);
	    Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
	    Statement stmt = con.createStatement();
	    ResultSet rs = stmt.executeQuery("Select * from LogLibs");
	    while (rs.next()) {
		String userID = rs.getString(1);
		String bookID = rs.getString(2);
		String ngayDat = rs.getString(3);
		String ngayMuon = rs.getString(4);
		String ngayTra = rs.getString(5);
		String maNV = rs.getString(6);
		String logID = rs.getString(7);

		s.add(new Loglib(userID, bookID, ngayDat, ngayMuon, ngayTra, maNV, logID));
	    }

	    con.close();
	    for (Loglib i : s) {
		System.out.println(i);
	    }
	    return s;
	} catch (Exception e) {
	    // TODO: handle exception
	    System.out.println(e);
	    return null;
	}
    }

    public int addNewUser(String userID, String bookID, String ngayDat, String ngayMuon,
                    String ngayTra, String maNV, String logID) {
	try {
	    Class.forName(driverName);
	    Connection con = DriverManager.getConnection(dbURL, userDB, passDB);

	    PreparedStatement stmt = con.prepareStatement("INSERT INTO LogLibs VALUES (?,?)");
	    stmt.setString(1, userID);
	    stmt.setString(2, bookID);
	    stmt.setString(3, ngayDat);
	    stmt.setString(4, ngayMuon);
	    stmt.setString(5, ngayTra);
	    stmt.setString(6, maNV);
	    stmt.setString(7, logID);
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

    public int deleteUser(String userID) {
	try {
	    Class.forName(driverName);
	    Connection con = DriverManager.getConnection(dbURL, userDB, passDB);

	    PreparedStatement stmt = con.prepareStatement("Delete from LogLibs where UserID = ?");
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
