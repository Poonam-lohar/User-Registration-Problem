package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    Scanner sc = new Scanner(System.in);

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
}
