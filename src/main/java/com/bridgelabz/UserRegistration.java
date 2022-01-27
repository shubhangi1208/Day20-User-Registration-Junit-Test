package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
     Scanner scanner = new Scanner(System.in);

    public boolean validFirstName(String name) {
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(name);
        boolean r = m.matches();
        if (r)
            return true;
        else
            return false;
    }
    public boolean validLastName(String lastname){
        String regex = "^[A-Z]{1}[a-z]{3,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(lastname);
        boolean r = m.matches();
        if (r)
            return true;
        else
            return false;
    }
    public boolean validEmail(String emailID) {
        String regex = "^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(emailID);
        boolean r = m.matches();
        if (r)
            return true;
        else
            return false;
    }
    public boolean validMobileNumber(String mobilenumber){
        String regex3 = "^[9,1]{2}\\s[0-9]{10}$";
        Pattern p = Pattern.compile(regex3);
        Matcher m = p.matcher(mobilenumber);
        boolean r = m.matches();
        if (r)
            return true;
        else
            return false;
    }
    public boolean validPassword(String password){
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()<>]).{8,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(password);
        boolean r = m.matches();
        if (r)
            return true;
        else
            return false;
    }
}
