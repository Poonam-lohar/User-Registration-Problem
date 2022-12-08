package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

  /*
  To validate all Use cases using Lambda Expression.
  */

@FunctionalInterface
interface Validation {
      boolean validate(String x) throws UserRegistrationexception;
      }

public class UserRegistration {

    Scanner sc = new Scanner(System.in);

    /*UC1
    enter valid first name
     */
     Validation validateFirstName = (firstName) -> {

        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);
        boolean result = matcher.matches();
        System.out.println(result);
        if (!result) {
            throw new UserRegistrationexception("first Name should start with a Cap and should have minimum 3 characters");
        } else
            return true;
    };
    /*
    UC2
    Enter Valid Last name
     */
    Validation validateLastName = (lastName) -> {

        String regex1 = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern1 = Pattern.compile(regex1);
        Matcher matcher1 = pattern1.matcher(lastName);
        boolean result1 = matcher1.matches();
        System.out.println(result1);
        if (!result1) {
            throw new UserRegistrationexception("Last Name should start with a Cap and should have minimum 3 chars");
        } else {
            return true;
        }
    };

    /*
    UC 3
    Enter valid Email
     */

    Validation validateEmail = (Email) -> {

        String regex2 = "^[a-z]*.[a-z]+@[a-z]+.[a-z]{2,3}(.[a-z]{2})*$";
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(Email);
        boolean result2 = matcher2.matches();
        System.out.println(result2);
        if (!result2) {
            throw new UserRegistrationexception("Enter valid Email");
        } else {
            return true;
    }
    };
    /*UC4
    Enter valid mobile number
     */

    Validation validateMobileNumber = (MobileNumber) -> {

        String regex3 = "^[0-9]{2}\\s{0,1}[0-9]{10}$";
        Pattern pattern3 = Pattern.compile(regex3);
        Matcher matcher3 = pattern3.matcher(MobileNumber);
        boolean result3 = matcher3.matches();
        System.out.println(result3);
        if (!result3) {
            throw new UserRegistrationexception("Enter the Valid Mobile number with county code.");
        } else
            return true;
    };

        /*UC5
        Password Rule 1: minimum 8 characters.
         */

    Validation validatePassword = (Password) -> {

        String regex4 = "^[a-zA-Z0-9@.-_]{8,}$";
        Pattern pattern4 = Pattern.compile(regex4);
        Matcher matcher4 = pattern4.matcher(Password);
        boolean result4 = matcher4.matches();
        System.out.println(result4);
        if (!result4) {
            throw new UserRegistrationexception("Password must have 8 character.");
        } else
            return true;
    };


    /*
    UC6
    Password Rule 2: Should have atleast 1 uppercase.
     */

    Validation validateUpperCasePassword = (password) -> {

        String regex5 = "^[A-Z]{1,}[a-zA-Z0-9@]{7,}$";
        Pattern pattern5 = Pattern.compile(regex5);
        Matcher matcher5 = pattern5.matcher(password);
        boolean result5 = matcher5.matches();
        System.out.println(result5);
        if (!result5) {
            throw new UserRegistrationexception("Should have atleast 1 uppercase");
        } else
        return true;

    };
    /*UC7
    Atleast 1 numeric number in password
     */
    Validation validateNumericPassword = (password) -> {

        String regex6 = "^[A-Z]{1}+[a-zA-Z1-9@]{6,}[1-9]{1}$";
        Pattern pattern6 = Pattern.compile(regex6);
        Matcher matcher6 = pattern6.matcher(password);
        boolean result6 = matcher6.matches();
        System.out.println(result6);
        if (!result6) {
            throw new UserRegistrationexception(" Atleast 1 numeric number in password");
        } else
            return true;
    };
    /*UC8
    Password contains atleast 1 Symbol
    */

    Validation validateSymbolPassword = password1 -> {

        String regex7 = "^[A-Z]{1}+[a-zA-Z]{6,}+[@]{1}[1-9]{1}$";
        Pattern pattern7 = Pattern.compile(regex7);
        Matcher matcher7 = pattern7.matcher(password1);
        boolean result7 = matcher7.matches();
        System.out.println(result7);
        if (!result7) {
            throw new UserRegistrationexception("Password contains atleast 1 Symbol");
        } else
            return true;
    };
    /*
    UC9
    valid email samples
     */
    Validation validateEmail1 = (String Email) -> {

        String regex8 = "^[a-zA-Z0-9]+(@.+-_][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?";
        Pattern pattern8 = Pattern.compile(regex8);
        Matcher matcher8 = pattern8.matcher(Email);
        boolean result8 = matcher8.matches();
        System.out.println(result8);
        if (!result8) {
            throw new UserRegistrationexception("valid email samples");
        } else
        return true;
    };
}
