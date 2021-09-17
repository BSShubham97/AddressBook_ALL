package com.bridgelabz;

public class Contact {
    private String firstname;
    private String lastname;
    private String address;
    private String city;
    private String state;
    private int zip;
    private long phonenumber;
    private String email;

    public String getFirstname() {
        return this.firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public String getAddress() {
        return this.address;
    }

    public String getCity() {
        return this.city;
    }

    public String getState() {
        return this.state;
    }

    public int getZip() {
        return this.zip;
    }

    public long getPhonenumber() {
        return this.phonenumber;
    }

    public String getEmail() {
        return this.email;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public void setPhonenumber(long phonenumber) {
        this.phonenumber = phonenumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "---------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n"+
                "|CONTACT:: " + " First Name: " + firstname + "\t// Last Name: " + lastname + "\t// Address: " + address + "\t // City: " + city
                + "\t// State: " + state + "\t// ZIP: " + zip + "\t //Phone Number: " + phonenumber + "\t// E-Mail: " + email +" |"
                +"\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------";
    }
}
