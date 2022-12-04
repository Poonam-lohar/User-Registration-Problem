package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    Scanner sc = new Scanner(System.in);

    /*UC1
    enter valid first name
     */
    public boolean validFirstName(String name) throws UserRegistrationexception {

        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        boolean result = matcher.matches();
        if (!result) {
            throw new UserRegistrationexception("valid First name");
        } else
            return result;
    }
    /*
    UC2
    Enter Valid Last name
     */

    public boolean validLastName(String lastName) throws UserRegistrationexception {

        String regex1 = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern1 = Pattern.compile(regex1);
        Matcher matcher1 = pattern1.matcher(lastName);
        boolean result1 = matcher1.matches();
        if (!result1) {
            throw new UserRegistrationexception("Valid last name");
        } else {
            return result1;
        }
    }

    /*
    UC 3
    Enter valid Email
     */

    public boolean validEmail(String Email) throws UserRegistrationexception {

        String regex2 = "^[a-z]*.[a-z]+@[a-z]+.[a-z]{2,3}(.[a-z]{2})*$";
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(Email);
        boolean result2 = matcher2.matches();
        if (!result2) {
            throw new UserRegistrationexception("valid Email");
        } else
            return result2;
    }
    /*UC4
    Enter valid mobile number
     */

    public boolean validMobileNumber(String MobileNumber) throws UserRegistrationexception {

        String regex3 = "^[0-9]{2}\\s{0,1}[0-9]{10}$";
        Pattern pattern3 = Pattern.compile(regex3);
        Matcher matcher3 = pattern3.matcher(MobileNumber);
        boolean result3 = matcher3.matches();
        if (!result3) {
            throw new UserRegistrationexception("Valid mob no.");
        } else
            return result3;
    }

        /*UC5
        Password Rule 1: minimum 8 characters.
         */

    public boolean validPassword(String Password) throws UserRegistrationexception {

        String regex4 = "^[a-zA-Z0-9@.-_]{8,}$";
        Pattern pattern4 = Pattern.compile(regex4);
        Matcher matcher4 = pattern4.matcher(Password);
        boolean result4 = matcher4.matches();
        if (!result4) {
            throw new UserRegistrationexception("Valid Password.");
        } else
            return result4;
    }


    /*
    UC6
    Password Rule 2: Should have atleast 1 uppercase.
     */

    public boolean validUpperCasePassword(String password) throws UserRegistrationexception {

        String regex5 = "^[A-Z]{1,}[a-zA-Z0-9@]{7,}$";
        Pattern pattern5 = Pattern.compile(regex5);
        Matcher matcher5 = pattern5.matcher(password);
        boolean result5 = matcher5.matches();
        if (!result5) {
            throw new UserRegistrationexception("Should have atleast 1 uppercase");
        } else
        return result5;

    }
    /*UC7
    Atleast 1 numeric number in password
     */

    public boolean validNumericPassword(String password) throws UserRegistrationexception {

        String regex6 = "^[A-Z]{1}+[a-zA-Z1-9@]{6,}[1-9]{1}$";
        Pattern pattern6 = Pattern.compile(regex6);
        Matcher matcher6 = pattern6.matcher(password);
        boolean result6 = matcher6.matches();
        if (!result6) {
            throw new UserRegistrationexception(" Atleast 1 numeric number in password");
        } else
            return result6;
    }
    /*UC8
    Password contains atleast 1 Symbol
    */

    public boolean validSymbolPassword(String password1) throws UserRegistrationexception {

        String regex7 = "^[A-Z]{1}+[a-zA-Z]{6,}+[@]{1}[1-9]{1}$";
        Pattern pattern7 = Pattern.compile(regex7);
        Matcher matcher7 = pattern7.matcher(password1);
        boolean result7 = matcher7.matches();
        if (!result7) {
            throw new UserRegistrationexception("Password contains atleast 1 Symbol");
        } else
            return result7;
    }
    /*
    UC9
    valid email samples
     */

    public boolean validEmailSamples(String Email) throws UserRegistrationexception {

        String regex8 = "^[a-zA-Z0-9]+(@.+-_][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?";
        Pattern pattern8 = Pattern.compile(regex8);
        Matcher matcher8 = pattern8.matcher(Email);
        boolean result8 = matcher8.matches();
        if (!result8) {
            throw new UserRegistrationexception("valid email samples");
        } else
        return result8;
    }
}
