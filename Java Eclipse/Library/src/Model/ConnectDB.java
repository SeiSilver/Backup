package Model;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB implements DatabaseInfor {

    public static Connection conn = null;

    public static Connection getConnection() {
	try {
	    Class.forName(driverName);
	    conn = DriverManager.getConnection(dbURL, userDB, passDB);
	    System.out.println("Connect successfully!");
	} catch (Exception e) {
	    // TODO: handle exception
	    System.out.println("Connect Fail!");
	}
	return conn;
    }
}
