package com.bridgelabz;

import java.util.Scanner;

public class UserRegistrationMain {

    public static void main(String[] args) {

        System.out.println("Welcome To User Registration Problem....");

        UserRegistration user = new UserRegistration();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1: To validate First Name:\nEnter 2: To validate Last Name:" +
                "\nEnter 3: To validate Email:\nEnter 4: To validate Mobile Number:" +
                "\nEnter 5: To validate Password Rule1:\nEnter 6: To validate Password Rule2:" +
                "\nEnter 7: To validate Password Rule3:\nEnter 8: To validate Password Rule3");

        switch (sc.nextInt()) {
            case 1:
                user.validFirstName();
                break;
            case 2:
                user.validLastName();
                break;
            case 3:
                user.validEmail();
                break;
            case 4:
                user.validMobileNumber();
                break;
            case 5:
                user.validPassword();
                break;
            case 6:
                user.validUpperCasePassword();
                break;
            case 7:
                user.validNumericPassword();
                break;
            case 8:
                user.validSymbolPassword();
                break;
        }
    }
}
