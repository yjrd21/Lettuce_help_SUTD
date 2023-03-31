package com.example.loginregisterfirebase;

public class User {
     String fullname;
     String email;
     String PhoneNumber;
     String Password;
     String ConPassword;

     String StaffQuery;

    public User(String fullname, String email, String PhoneNumber, String Password, String ConPassword, String StaffQuery) {
        this.fullname = fullname;
        this.email = email;
        this.PhoneNumber = PhoneNumber;
        this.Password = Password;
        this.ConPassword = ConPassword;
        this.StaffQuery = StaffQuery;
    }

    public String getFullname() {
        return fullname;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public String getPassword() {
        return Password;
    }

    public String getConPassword() {
        return ConPassword;
    }
}
