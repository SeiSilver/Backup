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
public class Person {
    private String name;
    private String birthday;
    private String address;

    public Person() {
    }

    public Person(String name, String birthday, String address) {
        this.name = name;
        this.birthday = birthday;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "name=" + name + ", birthday=" + birthday + ", address=" + address;
    }

}
