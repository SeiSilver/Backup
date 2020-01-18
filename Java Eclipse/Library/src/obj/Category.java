package obj;

public class Category {
    private String catID, CatName;

    public Category(String catID, String catName) {
	this.catID = catID;
	CatName = catName;
    }

    public String getCatID() {
	return catID;
    }

    public void setCatID(String catID) {
	this.catID = catID;
    }

    public String getCatName() {
	return CatName;
    }

    public void setCatName(String catName) {
	CatName = catName;
    }

    @Override
    public String toString() {
	return "Category [catID=" + catID + ", CatName=" + CatName + "]";
    }

}
