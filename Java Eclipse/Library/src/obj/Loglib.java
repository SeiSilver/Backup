package obj;

public class Loglib {
    private String userID, bookID, ngayDat, ngayMuon, ngayTra, maNV, logID;

    public Loglib(String userID, String bookID, String ngayDat, String ngayMuon, String ngayTra,
                    String maNV, String logID) {
	this.userID = userID;
	this.bookID = bookID;
	this.ngayDat = ngayDat;
	this.ngayMuon = ngayMuon;
	this.ngayTra = ngayTra;
	this.maNV = maNV;
	this.logID = logID;
    }

    public Loglib() {
    }

    public String getUserID() {
	return userID;
    }

    public void setUserID(String userID) {
	this.userID = userID;
    }

    public String getBookID() {
	return bookID;
    }

    public void setBookID(String bookID) {
	this.bookID = bookID;
    }

    public String getNgayDat() {
	return ngayDat;
    }

    public void setNgayDat(String ngayDat) {
	this.ngayDat = ngayDat;
    }

    public String getNgayMuon() {
	return ngayMuon;
    }

    public void setNgayMuon(String ngayMuon) {
	this.ngayMuon = ngayMuon;
    }

    public String getNgayTra() {
	return ngayTra;
    }

    public void setNgayTra(String ngayTra) {
	this.ngayTra = ngayTra;
    }

    public String getMaNV() {
	return maNV;
    }

    public void setMaNV(String maNV) {
	this.maNV = maNV;
    }

    public String getLogID() {
	return logID;
    }

    public void setLogID(String logID) {
	this.logID = logID;
    }

    @Override
    public String toString() {
	return "Loglib [userID=" + userID + ", bookID=" + bookID + ", ngayDat=" + ngayDat
	                + ", ngayMuon=" + ngayMuon + ", ngayTra=" + ngayTra + ", maNV=" + maNV
	                + ", logID=" + logID + "]";
    }

}
