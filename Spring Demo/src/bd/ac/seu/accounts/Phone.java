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
public class Phone {
    private String countryCode;
    private String areaCode;
    private String number;

    public Phone(String countryCode, String areaCode, String number) {
        this.countryCode = countryCode;
        this.areaCode = areaCode;
        this.number = number;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "+" + countryCode + "-" + areaCode + "-" + number;
    }
       
}
