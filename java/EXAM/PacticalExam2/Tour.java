// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package PacticalExam2;

import java.io.Serializable;
import java.util.*;

public class Tour implements TourInterface, Serializable {

    private static final long serialVersionUID = 1L;
    private String code;
    private String title;
    private double price;
    private String transport;
    private Date startDate;
    private Date endDate;

    public Tour() {
    }

    public Tour(String code, String title, double price, String transport, Date startDate, Date endDate) {
        this.code = code;
        this.title = title;
        this.price = price;
        this.transport = transport;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int numberOfDate() {
        long noDate = (endDate.getTime() - startDate.getTime()) / 86400000;
        return Math.toIntExact(noDate);
    }

    @Override
    public double tourChange() {
        return 0;
    }

    @Override
    public Tour inputData() {
        return null;
    }

    @Override
    public void printData() {

    }

    @Override
    public String toString() {
        return "Tour []";
    }

}
