// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package PacticalExam2;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DomesticTour extends Tour implements Serializable {

    private static final long serialVersionUID = 1L;
    private double guideTip;

    public DomesticTour(String code, String title, double price, String transport, Date startDate, Date endDate,
            double guideTip) {
        super(code, title, price, transport, startDate, endDate);
        this.guideTip = guideTip;
    }

    public DomesticTour(double guideTip) {
        this.guideTip = guideTip;
    }

    public DomesticTour() {
    }

    public double getGuideTip() {
        return guideTip;
    }

    public void setGuideTip(double guideTip) {
        this.guideTip = guideTip;
    }

    @Override
    public double tourChange() {

        return (double) getGuideTip() * super.numberOfDate() * super.getPrice();
    }

    public void printData() {
        SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
        String start = formater.format(super.getStartDate());
        String end = formater.format(super.getEndDate());
        System.out.printf("%-4s %-20s $%-10.2f %-10s %-10s %-10s %f\n", super.getCode(), super.getTitle(),
                super.getPrice(), super.getTransport(), start, end, tourChange());
        // System.out.println(tourChange());
    }

}
