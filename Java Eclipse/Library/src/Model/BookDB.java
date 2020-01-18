package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

import obj.Book;

public class BookDB implements DatabaseInfor {
    // --------------------------------------------------------------------
    public Book getBook(String bid) {
	Book s = null;
	try {
	    Class.forName(driverName);
	    Connection con = DriverManager.getConnection(dbURL, userDB, passDB);

	    Statement stmt = con.createStatement();
	    ResultSet rs = stmt.executeQuery(
	                    "Select bookID, title, author, category, keyword from Books where bookID='"
	                                    + bid + "'");
	    if (rs.next()) {
		String bookID = rs.getString(1);
		String title = rs.getString(2);
		String author = rs.getString(3);
		String category = rs.getString(4);
		String keyword = rs.getString(5);
		s = new Book(bookID, title, author, category, keyword);
	    }
	    con.close();
	    return s;
	} catch (Exception e) {
	    // TODO: handle exception
	    System.out.println(e);
	    return null;
	}

    }

    // --------------------------------------------------------------------
    public ArrayList<Book> searchByCategory(String cat) {
	ArrayList<Book> s = new ArrayList<Book>();
	try {
	    Class.forName(driverName);
	    Connection con = DriverManager.getConnection(dbURL, userDB, passDB);

	    Statement stmt = con.createStatement();
	    ResultSet rs = stmt.executeQuery(
	                    "Select bookID, title, author, category, keyword from Books where Category='"
	                                    + cat + "'");
	    while (rs.next()) {
		String bookID = rs.getString(1);
		String title = rs.getString(2);
		String author = rs.getString(3);
		String category = rs.getString(4);
		String keyword = rs.getString(5);
		s.add(new Book(bookID, title, author, category, keyword));
	    }
	    con.close();
	    return s;
	} catch (Exception e) {
	    // TODO: handle exception
	    System.out.println(e);
	    return null;
	}
    }

    // --------------------------------------------------------------------
    public ArrayList<Book> searchByKeyword(String key) {
	ArrayList<Book> s = new ArrayList<Book>();
	try {
	    Class.forName(driverName);
	    Connection con = DriverManager.getConnection(dbURL, userDB, passDB);

	    Statement stmt = con.createStatement();
	    ResultSet rs = stmt.executeQuery(
	                    "Select bookID, title, author, category, keyword from Books where Keyword='"
	                                    + key + "'");
	    while (rs.next()) {
		String bookID = rs.getString(1);
		String title = rs.getString(2);
		String author = rs.getString(3);
		String category = rs.getString(4);
		String keyword = rs.getString(5);
		s.add(new Book(bookID, title, author, category, keyword));
	    }
	    con.close();
	    return s;
	} catch (Exception e) {
	    // TODO: handle exception
	    System.out.println(e);
	    return null;
	}
    }

    // --------------------------------------------------------------------

    // --------------------------------------------------------------------
    public Vector<Book> searchByTitle(String t) {
	Vector<Book> s = new Vector<Book>();
	try {
	    Class.forName(driverName);
	    Connection con = DriverManager.getConnection(dbURL, userDB, passDB);

	    Statement stmt = con.createStatement();
	    ResultSet rs = stmt.executeQuery(
	                    "Select bookID, title, author, category, keyword from Books where Title='"
	                                    + t + "'");
	    while (rs.next()) {
		String bookID = rs.getString(1);
		String title = rs.getString(2);
		String author = rs.getString(3);
		String category = rs.getString(4);
		String keyword = rs.getString(5);
		s.add(new Book(bookID, title, author, category, keyword));
	    }
	    con.close();
	    return s;
	} catch (Exception e) {
	    // TODO: handle exception
	    System.out.println(e);
	    return null;
	}
    }

    // --------------------------------------------------------------------
    public ArrayList<Book> allBooks() {
	ArrayList<Book> s = new ArrayList<Book>();
	try {
	    Class.forName(driverName);
	    Connection con = DriverManager.getConnection(dbURL, userDB, passDB);

	    Statement stmt = con.createStatement();
	    ResultSet rs = stmt.executeQuery(
	                    "Select bookID, title, author, category, keyword from Books");
	    while (rs.next()) {
		String bookID = rs.getString(1);
		String title = rs.getString(2);
		String author = rs.getString(3);
		String category = rs.getString(4);
		String keyword = rs.getString(5);
		s.add(new Book(bookID, title, author, category, keyword));
	    }
	    con.close();
	    for (Book i : s) {
		System.out.println(i);
	    }
	    return s;
	} catch (Exception e) {
	    // TODO: handle exception
	    System.out.println(e);
	    return null;
	}
    }

    public int addNewBook(String BookID, String Title, String Author, String Category,
                    String Keyword) {
	try {
	    Class.forName(driverName);
	    Connection con = DriverManager.getConnection(dbURL, userDB, passDB);

	    PreparedStatement stmt = con.prepareStatement(
	                    "INSERT INTO Books(BookID, Title, Author, Category, Keyword) VALUES (?,?,?,?,?)");
	    stmt.setString(1, BookID);
	    stmt.setString(2, Title);
	    stmt.setString(3, Author);
	    stmt.setString(4, Category);
	    stmt.setString(5, Keyword);
	    int rc = stmt.executeUpdate();
	    con.close();
	    System.out.println("Add book successfully");
	    return rc;
	} catch (Exception e) {
	    // TODO: handle exception
	    System.out.println("Add book fail");
	    return 0;
	}
    }

    public int updateBooks(String BookID, String Title, String Author, String Category,
                    String Keyword) {
	try {
	    Class.forName(driverName);
	    Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
	    String sql = "Update Books set bookID=?, title=?, author=?, category=?, keyword=? where bookID=?";
	    PreparedStatement stmt = con.prepareStatement(sql);

	    stmt.setString(1, BookID);
	    stmt.setString(2, Title);
	    stmt.setString(3, Author);
	    stmt.setString(4, Category);
	    stmt.setString(5, Keyword);
	    stmt.setString(6, BookID);
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

    public int deleteBooks(String BookID) {
	try {
	    Class.forName(driverName);
	    Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
	    String sql = "Delete from Books where BookID = ?";
	    PreparedStatement stmt = con.prepareStatement(sql);
	    stmt.setString(1, BookID);

	    int rc = stmt.executeUpdate();

	    con.close();
	    System.out.println("Delete successfully!");
	    return rc;
	} catch (Exception e) {
	    // TODO: handle exception
	    System.out.println("Delete Fail");
	    return 0;
	}
    }
}
