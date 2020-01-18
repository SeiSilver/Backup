package Model;

import java.sql.Connection;

public class Main {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Connection conn = ConnectDB.getConnection();
	if (conn != null) {
	    BookDB t = new BookDB();
//	System.out.println(BookDB.getBook("B0001"));
//	System.out.println(BookDB.getBook("B0002"));

//	    for (Book i : t.searchByCategory("LT")) {
//		System.out.println(i);
//	    }

//	    for (Book i : t.searchByKeyword("Java")) 
//		System.out.println(i);
//	    }

//	    for (Book i : t.allBooks()) {
//		System.out.println(i);
//	    }

//	    if () != 0)
//	        System.out.println("add susscess");
//	    t.addNewBook("asd", "asd", "asd", "CS", "qwe");
//	    t.updateBooks("asd", "update", "update", "CS", "update");
//	    t.deleteBooks("asd");

//	    t.allBooks();
//	    CategoryDB tc = new CategoryDB();
//	    tc.allCategory();
//	    tc.addNewCategory("id", "test");
//	    tc.deleteCategory("id");
//	    System.out.println();
//	    tc.allCategory();
	    UserDB tu = new UserDB();
	    tu.allUsers();
	    tu.addNewUser("userID", "fullName", "email@asd", "password", "BL", 1);
	    tu.allUsers();

	}

    }

}
