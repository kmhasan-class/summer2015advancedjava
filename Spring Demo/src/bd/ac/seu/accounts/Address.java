/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.ac.seu.accounts;

/**
 *
 * @author kmhasan
 */
public class Address {
    private String streetAddress;
    private String area;
    private String city;
    private String country;
    
    public Address(String streetAddress, String area, String city) {
        this.streetAddress = streetAddress;
        this.area = area;
        this.city = city;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getArea() {
        return area;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Address{" + "streetAddress=" + streetAddress + ", area=" + area + ", city=" + city + '}';
    }
    
}

