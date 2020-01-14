/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRO192.baitap3;

/**
 *
 * @author ASUS
 */
public class Staff extends Person {
    private String school;
    private double pay;

    public Staff() {
    }

    public Staff(String name, String birthday, String address, String school, double pay) {
        super(name, birthday, address);
        this.school = school;
        this.pay = pay;
    }

    @Override
    public String toString() {
        return super.toString() + " school=" + school + ", pay=" + pay;
    }

}
