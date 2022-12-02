package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    Scanner sc = new Scanner(System.in);

    /*UC1
    enter valid first name
     */
    public boolean validFirstName() {

        System.out.println("Enter First Name: ");
        String name = sc.next();
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        boolean result = matcher.matches();

        if (result)
            System.out.println("First name is valid..");
        else
            System.out.println("First name is invalid..");
        return result;
    }
    /*
    UC2
    Enter Valid Last name
     */

    public boolean validLastName() {

        System.out.println("Enter Last Name: ");
        String lastName = sc.next();
        String regex1 = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern1 = Pattern.compile(regex1);
        Matcher matcher1 = pattern1.matcher(lastName);
        boolean result1 = matcher1.matches();

        if (result1)
            System.out.println("Lastname is valid... ");
        else
            System.out.println("Lastname is Invalid... ");
        return result1;
    }

    /*
    UC 3
    Enter valid Email
     */

    public boolean validEmail() {

        System.out.println("Enter Email: ");
        String Email = sc.next();
        String regex2 = "^[a-zA-Z0-9]+([a-zA-Z0-9]+)*[@][a-zA-Z0-9]+([.][a-zA-Z]{2,4})$";
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(Email);
        boolean result2 = matcher2.matches();

        if (result2)
            System.out.println("Email is valid... ");
        else
            System.out.println("Email is Invalid... ");
        return result2;
    }
    /*UC4
    Enter valid mobile number
     */

    public boolean validMobileNumber() {

        System.out.println("Enter Mobile Number: ");
        String MobileNumber = sc.next();
        String regex3 = "^[0-9]{2}\\s{0,1}[0-9]{10}$";
        Pattern pattern3 = Pattern.compile(regex3);
        Matcher matcher3 = pattern3.matcher(MobileNumber);
        boolean result3 = matcher3.matches();

        if (result3)
            System.out.println("Mobile number is valid... ");
         else
            System.out.println("Mobile number is Invalid... ");
            return result3;
        }

        /*UC5
        Password Rule 1: minimum 8 characters.
         */

    public boolean validPassword() {

        System.out.println("Enter Password: ");
        String MobileNumber = sc.next();
        String regex4 = "^[a-zA-Z]{8,}$";
        Pattern pattern4 = Pattern.compile(regex4);
        Matcher matcher4 = pattern4.matcher(MobileNumber);
        boolean result4 = matcher4.matches();

        if (result4)
            System.out.println("Password is valid... ");
        else
            System.out.println("Password is Invalid... ");
        return result4;
    }
    /*
    UC6
    Password Rule 2: Should have atleast 1 uppercase.
     */

    public boolean validUpperCasePassword() {

        System.out.println("Enter Password: ");
        String password = sc.next();
        String regex5 = "^[A-Z]{1,}[a-zA-Z0-9]{7,}$";
        Pattern pattern5 = Pattern.compile(regex5);
        Matcher matcher5 = pattern5.matcher(password);
        boolean result5 = matcher5.matches();

        if (result5)
            System.out.println("Password is valid... ");
        else
            System.out.println("Password is Invalid... ");
        return result5;
    }
    }
